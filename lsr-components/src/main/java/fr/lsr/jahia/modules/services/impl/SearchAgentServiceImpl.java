package fr.lsr.jahia.modules.services.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jahia.data.templates.JahiaTemplatesPackage;
import org.jahia.registries.ServicesRegistry;

import com.mrted.ws.DeliveryFrequency;
import com.mrted.ws.LangCode;
import com.mrted.ws.SearchAgentDto;
import com.mrted.ws.SearchAgentWebService;
import com.mrted.ws.SearchAgentWebService_Service;
import com.mrted.ws.SearchCriteriaDto;

import fr.lsr.jahia.modules.services.FoAdvertService;
import fr.lsr.jahia.modules.services.SearchAgentService;
import fr.lsr.jahia.modules.utils.Constants;

/**
 * @author BEN AJIBA
 */
public class SearchAgentServiceImpl implements SearchAgentService {
	private static Logger LOGGER = Logger.getLogger(SearchAgentServiceImpl.class);

	private FoAdvertService foAdvertService;
	private SearchAgentWebService searchAgentWebService;
	private String wsdlPath;
	private static SearchAgentServiceImpl theObject;
	private HeaderHandlerResolver headerHandlerResolver;

	private SearchAgentServiceImpl() {
	}

	/**
	 * @return the unique instance of this class
	 */
	public static SearchAgentServiceImpl getInstance() {
		if (theObject == null) {
			synchronized (SearchAgentServiceImpl.class) {
				if (theObject == null) {
					theObject = new SearchAgentServiceImpl();
				}
			}
		}
		return theObject;
	}

	public void start() throws MalformedURLException, IOException {
		JahiaTemplatesPackage templatePackage = ServicesRegistry.getInstance().getJahiaTemplateManagerService().getTemplatePackageById(Constants.TEMPLATE_PACKAGE_NAME);
		URL url = templatePackage.getBundle().getEntry(wsdlPath);

		SearchAgentWebService_Service searchAgentWebService_Service = new SearchAgentWebService_Service(url);
		searchAgentWebService_Service.setHandlerResolver(headerHandlerResolver);
		searchAgentWebService = searchAgentWebService_Service.getSearchAgentWebServicePort();
	}

	@Override
	public void createAlerte(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions, List<Long> classifications, List<Long> regimes,
			String email, DeliveryFrequency frequency, Integer expirationDays) throws DatatypeConfigurationException {
		SearchCriteriaDto searchCriteriaDto = foAdvertService.createSearchCriteriaDto(keywords, jobFamilys, typeOrganismes, contractTypes, regions, classifications, regimes);

		if (StringUtils.isNotBlank(email) && frequency != null && expirationDays != null) {
			SearchAgentDto searchAgentDto = new SearchAgentDto();
			searchAgentDto.setDeliveryFrequency(frequency);
			searchAgentDto.setEmail(email);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			c.add(Calendar.DATE, expirationDays);
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			searchAgentDto.setExpirationDate(date);
			searchAgentDto.setSearchCriteria(searchCriteriaDto);
			searchAgentWebService.create(searchAgentDto, true, LangCode.FR);
		} else {
			LOGGER.info("Some values are null : " + " email= " + email + " frequency=" + frequency + " expirationDays= " + expirationDays);
		}
	}

	public void setWsdlPath(String wsdlPath) {
		this.wsdlPath = wsdlPath;
	}

	public void setHeaderHandlerResolver(HeaderHandlerResolver headerHandlerResolver) {
		this.headerHandlerResolver = headerHandlerResolver;
	}

	public void setFoAdvertService(FoAdvertService foAdvertService) {
		this.foAdvertService = foAdvertService;
	}
}