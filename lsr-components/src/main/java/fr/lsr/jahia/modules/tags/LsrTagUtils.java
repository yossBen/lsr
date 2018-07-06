package fr.lsr.jahia.modules.tags;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;

import org.apache.log4j.Logger;
import org.jahia.api.Constants;
import org.jahia.services.content.JCRContentUtils;
import org.jahia.services.content.JCRNodeWrapper;

import com.mrted.ws.LovDescendantDto;

import fr.lsr.jahia.modules.services.impl.FoAdvertServiceImpl;
import fr.lsr.jahia.modules.services.impl.FoAdvertServiceImpl.Advertisement;
import fr.lsr.jahia.modules.services.impl.LovServiceImpl;
import fr.lsr.jahia.modules.utils.Lov;
import fr.lsr.jahia.modules.utils.LsrUtils;
import fr.lsr.jahia.modules.utils.Pair;
import fr.lsr.jahia.modules.utils.Regions;

/**
 * @author BEN AJIBA
 */
public class LsrTagUtils {
	private static Logger LOGGER = Logger.getLogger(LsrTagUtils.class);

	public static Pair<Integer, List<Advertisement>> getAdvertisements(String keywords, String[] jobFamilys, String[] typeOrganismes, String[] contractTypes, String[] regions,
			String[] classifications, String[] regimes, int firstResult, int maxResults) {
		try {
			return FoAdvertServiceImpl.getInstance().getAdvertisements(keywords, LsrUtils.valueOf(jobFamilys), LsrUtils.valueOf(typeOrganismes), LsrUtils.valueOf(contractTypes),
					LsrUtils.valueOf(regions), LsrUtils.valueOf(classifications), LsrUtils.valueOf(regimes), firstResult, maxResults);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}

	public static List<Advertisement> getLastAdvertisements(String[] jobFamilys, String[] contractTypes, int maxResults) {
		List<Advertisement> toReturn = new ArrayList<>();
		try {
			Pair<Integer, List<Advertisement>> p = FoAdvertServiceImpl.getInstance().getAdvertisements(null, LsrUtils.valueOf(jobFamilys), null, LsrUtils.valueOf(contractTypes), null, null, null, 0,
					maxResults);
			toReturn = p.getValue();
			if (p.getKey() < maxResults) {
				p = FoAdvertServiceImpl.getInstance().getAdvertisements(null, null, null, null, null, null, null, 0, maxResults - p.getKey());
				toReturn.addAll(p.getValue());
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return toReturn;
	}

	public static Integer countAdvertisements() {
		Integer count = null;
		try {
			Pair<Integer, List<Advertisement>> p = FoAdvertServiceImpl.getInstance().getAdvertisements(null, null, null, null, null, null, null, 0, 1);
			count = p.getKey();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return count;
	}

	public static String[] getLovById(String lovName, String[] ids) {
		String[] list = null;
		if (ids != null) {
			list = new String[ids.length];
			for (int i = 0; i < ids.length; i++) {
				String id = ids[i];
				LovDescendantDto dto = LovServiceImpl.getInstance().getLovById(Lov.valueOf(lovName), LsrUtils.valueOf(id));
				if (dto != null) {
					list[i] = dto.getTranslation();
				}

			}
		}
		return list;
	}

	public static String[] getRegionsByIds(String[] ids) {
		String[] list = null;
		if (ids != null) {
			list = new String[ids.length];
			for (int i = 0; i < ids.length; i++) {
				String id = ids[i];
				Regions r = Regions.getRegionByCode(id);
				if (r != null) {
					list[i] = r.getName();
				}
			}
		}
		return list;
	}

	public static int randomInt(final Integer length) {
		if (length != null && length > 0) {
			return (int) (Math.random() * length);
		}
		return 0;
	}

	public static Advertisement getAdvertisementById(String offerId) {
		return FoAdvertServiceImpl.getInstance().getAdvertisementById(LsrUtils.valueOf(offerId));
	}

	/**
	 * Récupérer une liste random des noeud
	 * 
	 * @param site
	 *            : le site
	 * @param type
	 *            : type de composants à récupérer
	 * @param max
	 *            : nombre marximal à récupérer
	 * @return : liste de noeuds
	 */
	public static List<JCRNodeWrapper> getRandomNodes(JCRNodeWrapper site, String type, int max) {
		List<JCRNodeWrapper> toReturn = new ArrayList<>();
		List<JCRNodeWrapper> allNode = new ArrayList<>();
		NodeIterator it = JCRContentUtils.getDescendantNodes(site, type);
		while (it.hasNext()) {
			allNode.add((JCRNodeWrapper) it.next());
		}
		List<Integer> list = new ArrayList<>(allNode.size());
		for (int i = 0; i < allNode.size(); i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for (int i = 0; i < max; i++) {
			toReturn.add(allNode.get(list.get(i)));
		}
		return toReturn;
	}

	/**
	 * Recuperer les liens du caroussel de la page metier
	 * 
	 * @param currentPage
	 *            : page metier courante
	 * 
	 * @return : les liens
	 */
	public static Pair<JCRNodeWrapper, JCRNodeWrapper> getLinksCarousel(JCRNodeWrapper currentPage) {
		Pair<JCRNodeWrapper, JCRNodeWrapper> toReturn = null;
		try {
			if (currentPage != null) {
				JCRNodeWrapper parentPage = JCRContentUtils.getParentOfType(currentPage, Constants.JAHIANT_PAGE);
				List<JCRNodeWrapper> list = JCRContentUtils.getNodes(parentPage, Constants.JAHIANT_PAGE);
				for (int i = 0; i < list.size(); i++) {
					JCRNodeWrapper page = list.get(i);
					if (currentPage.getIdentifier().equals(page.getIdentifier())) {
						JCRNodeWrapper previews = i > 0 ? list.get(i - 1) : null;
						JCRNodeWrapper next = i < list.size() - 1 ? list.get(i + 1) : null;
						toReturn = new Pair<JCRNodeWrapper, JCRNodeWrapper>(previews, next);
						break;
					}
				}
			}
		} catch (RepositoryException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return toReturn;
	}
}