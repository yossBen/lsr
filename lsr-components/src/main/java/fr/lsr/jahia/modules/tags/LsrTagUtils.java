package fr.lsr.jahia.modules.tags;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import fr.lsr.jahia.modules.services.impl.FoAdvertServiceImpl;
import fr.lsr.jahia.modules.services.impl.FoAdvertServiceImpl.Advertisement;
import fr.lsr.jahia.modules.utils.Pair;

/**
 * @author BEN AJIBA
 */
public class LsrTagUtils {
	private static Logger LOGGER = Logger.getLogger(LsrTagUtils.class);

	public static Pair<Integer, List<Advertisement>> getAdvertisements(String keywords, String[] jobFamilys, String[] typeOrganismes, String[] contractTypes, String[] regions,
			String[] classifications, String[] regimes, int firstResult, int maxResults) {
		try {
			return FoAdvertServiceImpl.getInstance().getAdvertisements(keywords, valueOf(jobFamilys), valueOf(typeOrganismes), valueOf(contractTypes), valueOf(regions), valueOf(classifications),
					valueOf(regimes), firstResult, maxResults);
		} catch (Exception e) {e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}

	public static Advertisement getAdvertisementById(String offerId) {
		return FoAdvertServiceImpl.getInstance().getAdvertisementById(valueOf(offerId));
	}

	private static List<Long> valueOf(String[] values) {
		if (values != null && values.length > 0) {
			List<Long> toReturn = new ArrayList<>(values.length);
			for (String val : values) {
				if (StringUtils.isNotBlank(val)) {
					toReturn.add(valueOf(val));
				}

			}
			return toReturn;
		}
		return null;
	}

	private static Long valueOf(String val) {
		try {
			if (StringUtils.isNotBlank(val)) {
				return Long.valueOf(val);
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}
}