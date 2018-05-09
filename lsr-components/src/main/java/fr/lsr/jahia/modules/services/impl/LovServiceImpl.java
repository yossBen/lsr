package fr.lsr.jahia.modules.services.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import javax.xml.namespace.QName;

import org.jahia.data.templates.JahiaTemplatesPackage;
import org.jahia.registries.ServicesRegistry;
import org.jahia.services.cache.CacheHelper;
import org.jahia.services.cache.ModuleClassLoaderAwareCacheEntry;
import org.jahia.services.cache.ehcache.EhCacheProvider;
import org.springframework.core.io.Resource;

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
		Resource wsdl = templatePackage.getResource(wsdlPath);
		LovWebService_Service lovWebService_Service = new LovWebService_Service(wsdl.getFile().toURI().toURL(), new QName("http://ws.mrted.com/", "LovWebService"));
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
}