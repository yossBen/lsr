package fr.lsr.jahia.modules.services.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jahia.data.templates.JahiaTemplatesPackage;
import org.jahia.registries.ServicesRegistry;
import org.jahia.services.cache.CacheHelper;
import org.jahia.services.cache.ModuleClassLoaderAwareCacheEntry;
import org.jahia.services.cache.ehcache.EhCacheProvider;

import com.mrted.ws.LangCode;
import com.mrted.ws.LovDescendantDto;
import com.mrted.ws.LovWebService;
import com.mrted.ws.LovWebService_Service;

import fr.lsr.jahia.modules.services.LovService;
import fr.lsr.jahia.modules.utils.Constants;
import fr.lsr.jahia.modules.utils.Lov;
import fr.lsr.jahia.modules.utils.Regions;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

/**
 * @author BEN AJIBA
 */
public class LovServiceImpl implements LovService {
	private LovWebService lovWebService;
	private static final String LOV_WS_CACHES = "LOV_WS_CACHES";
	private final static Long[] CONTRACT_TYPE_INTERNE = new Long[] { 11623l, 9876l, 10129l };
	private EhCacheProvider cacheProvider;
	private Ehcache ehCache;
	private String wsdlPath;
	private static LovServiceImpl theObject;
	private HeaderHandlerResolver headerHandlerResolver;

	private LovServiceImpl() {
	}

	/**
	 * @return the unique instance of this class
	 */
	public static LovServiceImpl getInstance() {
		if (theObject == null) {
			synchronized (LovServiceImpl.class) {
				if (theObject == null) {
					theObject = new LovServiceImpl();
				}
			}
		}
		return theObject;
	}

	public void start() throws MalformedURLException, IOException {
		JahiaTemplatesPackage templatePackage = ServicesRegistry.getInstance().getJahiaTemplateManagerService().getTemplatePackageById(Constants.TEMPLATE_PACKAGE_NAME);
		URL url = templatePackage.getBundle().getEntry(wsdlPath);
		LovWebService_Service lovWebService_Service = new LovWebService_Service(url);
		lovWebService_Service.setHandlerResolver(headerHandlerResolver);

		lovWebService = lovWebService_Service.getLovWebServicePort();
		ehCache = cacheProvider.getCacheManager().addCacheIfAbsent(LOV_WS_CACHES);
		flushCache();
	}

	@Override
	public Regions[] getRegions() {
		return Regions.values();
	}

	@Override
	public List<LovDescendantDto> getLovs(Lov lov) {
		@SuppressWarnings("unchecked")
		List<LovDescendantDto> lovs = (List<LovDescendantDto>) CacheHelper.getObjectValue(ehCache, lov.getName());
		if (lovs == null) {
			lovs = lovWebService.getLovWithValuesByName(lov.getName(), LangCode.FR);
			ehCache.put(new Element(lov.getName(), new ModuleClassLoaderAwareCacheEntry(lovs, lov.getName())));
		}
		return lovs;
	}

	@Override
	public LovDescendantDto getLovById(Lov lov, Long id) {
		List<LovDescendantDto> lovs = getLovs(lov);
		for (LovDescendantDto l : lovs) {
			if (l.getLovId().equals(id)) {
				return l;
			}
		}
		return null;
	}

	public void flushCache() {
		if (ehCache != null) {
			for (Lov lov : Lov.values()) {
				ehCache.remove(lov.getName());
			}
		}
	}

	public void setCacheProvider(EhCacheProvider cacheProvider) {
		this.cacheProvider = cacheProvider;
	}

	public void setWsdlPath(String wsdlPath) {
		this.wsdlPath = wsdlPath;
	}

	public void setHeaderHandlerResolver(HeaderHandlerResolver headerHandlerResolver) {
		this.headerHandlerResolver = headerHandlerResolver;
	}

	/**
	 * Get que les types de contrats internes
	 * 
	 * @return liste des types de contrats
	 */
	public List<LovDescendantDto> getContractTypeExterne() {
		List<LovDescendantDto> toReturn = new ArrayList<>();
		List<LovDescendantDto> lovs = getLovs(Lov.CONTRACT_TYPE);
		if (lovs != null) {
			for (LovDescendantDto lov : lovs) {
				boolean isInterne = false;
				for (Long lovId : LovServiceImpl.CONTRACT_TYPE_INTERNE) {
					if (lovId.equals(lov.getLovId())) {
						isInterne = true;
						break;
					}
				}
				if (!isInterne) {
					toReturn.add(lov);
				}
			}
		}
		return toReturn;
	}
}