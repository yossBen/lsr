package fr.lsr.jahia.modules.services;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.mrted.ws.DeliveryFrequency;

/**
 * @author BENA JIBA
 */
public interface SearchAgentService {

	void createAlerte(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions, List<Long> classifications, List<Long> regimes, String email,
			DeliveryFrequency frequency, Integer expirationDays) throws DatatypeConfigurationException;
}