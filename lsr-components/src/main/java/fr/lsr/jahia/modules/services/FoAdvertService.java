package fr.lsr.jahia.modules.services;

import java.util.List;

import com.mrted.ws.SearchCriteriaDto;

import fr.lsr.jahia.modules.services.impl.FoAdvertServiceImpl.Advertisement;
import fr.lsr.jahia.modules.utils.Pair;

/**
 * @author BENA JIBA
 */
public interface FoAdvertService {
	Advertisement getAdvertisementById(Long offerId);

	Pair<Integer, List<Advertisement>> getAdvertisements(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions, List<Long> classifications,
			List<Long> regimes, int firstResult, int maxResults);

	SearchCriteriaDto createSearchCriteriaDto(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions, List<Long> classifications,
			List<Long> regimes);
}