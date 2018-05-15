package fr.lsr.jahia.modules.services;

import java.util.List;

import com.mrted.ws.LovDescendantDto;

import fr.lsr.jahia.modules.utils.Lov;
import fr.lsr.jahia.modules.utils.Regions;

/**
 * @author BENA JIBA
 */
public interface LovService {
	Regions[] getRegions();

	List<LovDescendantDto> getLovs(Lov lov);

	LovDescendantDto getLovById(Lov lov, Long id);
}