package fr.lsr.jahia.modules.services.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jahia.data.templates.JahiaTemplatesPackage;
import org.jahia.registries.ServicesRegistry;
import org.springframework.core.io.Resource;

import com.mrted.ws.DeliveryFrequency;
import com.mrted.ws.LangCode;
import com.mrted.ws.SearchAgentDto;
import com.mrted.ws.SearchAgentWebService;
import com.mrted.ws.SearchAgentWebService_Service;
import com.mrted.ws.SearchCriteriaDto;

import fr.lsr.jahia.modules.services.SearchAgentService;
import fr.lsr.jahia.modules.utils.Constants;

/**
 * @author BEN AJIBA
 */
public class SearchAgentServiceImpl implements SearchAgentService {

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

	public void createAlerte(SearchCriteriaDto searchCriteriaDto) throws DatatypeConfigurationException {
		SearchAgentDto searchAgentDto = new SearchAgentDto();
		searchAgentDto.setDeliveryFrequency(DeliveryFrequency.ONCE_A_DAY);
		searchAgentDto.setEmail("youssef.benajiba@gmail.com");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		searchAgentDto.setExpirationDate(date);
		searchAgentDto.setSearchCriteria(searchCriteriaDto);
		searchAgentWebService.create(searchAgentDto, true, LangCode.FR);
	}

	public void setWsdlPath(String wsdlPath) {
		this.wsdlPath = wsdlPath;
	}

	public void setHeaderHandlerResolver(HeaderHandlerResolver headerHandlerResolver) {
		this.headerHandlerResolver = headerHandlerResolver;
	}
}