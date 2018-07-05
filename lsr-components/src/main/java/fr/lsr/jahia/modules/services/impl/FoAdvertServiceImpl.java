package fr.lsr.jahia.modules.services.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.codehaus.plexus.util.StringUtils;
import org.jahia.data.templates.JahiaTemplatesPackage;
import org.jahia.registries.ServicesRegistry;

import com.mrted.ws.AdvertisementDto;
import com.mrted.ws.AdvertisementResultDto;
import com.mrted.ws.CustomField;
import com.mrted.ws.CustomLovGroup;
import com.mrted.ws.FoAdvertWebService;
import com.mrted.ws.FoAdvertWebService_Service;
import com.mrted.ws.LangCode;
import com.mrted.ws.LovCriterion;
import com.mrted.ws.LovWithActivatorsCriterion;
import com.mrted.ws.SearchCriteriaDto;
import com.mrted.ws.SearchCriteriaDto.ContractTypes;
import com.mrted.ws.SearchCriteriaDto.CustomLovs;
import com.mrted.ws.SearchCriteriaDto.OrganizationIds;
import com.mrted.ws.SearchCriteriaDto.Regions;
import com.mrted.ws.SortType;
import com.mrted.ws.SortingDetailsDto;

import fr.lsr.jahia.modules.services.FoAdvertService;
import fr.lsr.jahia.modules.utils.Constants;
import fr.lsr.jahia.modules.utils.Lov;
import fr.lsr.jahia.modules.utils.Pair;

/**
 * @author BEN AJIBA
 */
public class FoAdvertServiceImpl implements FoAdvertService {

	private FoAdvertWebService foAdvertWebService;
	private String wsdlPath;
	private static FoAdvertServiceImpl theObject;
	private HeaderHandlerResolver headerHandlerResolver;

	private FoAdvertServiceImpl() {
	}

	/**
	 * @return the unique instance of this class
	 */
	public static FoAdvertServiceImpl getInstance() {
		if (theObject == null) {
			synchronized (FoAdvertServiceImpl.class) {
				if (theObject == null) {
					theObject = new FoAdvertServiceImpl();
				}
			}
		}
		return theObject;
	}

	public void start() throws MalformedURLException, IOException {
		JahiaTemplatesPackage templatePackage = ServicesRegistry.getInstance().getJahiaTemplateManagerService().getTemplatePackageById(Constants.TEMPLATE_PACKAGE_NAME);
		URL url = templatePackage.getBundle().getEntry(wsdlPath);

		FoAdvertWebService_Service foWebService_Service = new FoAdvertWebService_Service(url);
		foWebService_Service.setHandlerResolver(headerHandlerResolver);
		this.foAdvertWebService = foWebService_Service.getFoAdvertWebServicePort();

	}

	@Override
	public Advertisement getAdvertisementById(Long offerId) {
		if (offerId != null) {
			return new Advertisement(foAdvertWebService.getAdvertisementById(offerId, null, null));
		}
		return null;
	}

	@Override
	public Pair<Integer, List<Advertisement>> getAdvertisements(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions,
			List<Long> classifications, List<Long> regimes, int firstResult, int maxResults) {
		Pair<Integer, List<Advertisement>> toReturn = null;
		SearchCriteriaDto searchCriteriaDto = createSearchCriteriaDto(keywords, jobFamilys, typeOrganismes, contractTypes, regions, classifications, regimes);
		SortingDetailsDto sortingDetailsDto = new SortingDetailsDto();
		sortingDetailsDto.setColumnName(Constants.SORTING_COLUMN);
		sortingDetailsDto.setSortType(SortType.DESCENDING);
		AdvertisementResultDto advertisementResultDto = foAdvertWebService.getAdvertisements(firstResult, maxResults, searchCriteriaDto, sortingDetailsDto, LangCode.FR);
		if (advertisementResultDto != null && advertisementResultDto.getAdvertisements() != null) {
			List<Advertisement> list = new ArrayList<>();
			for (AdvertisementDto adDto : advertisementResultDto.getAdvertisements().getAdvertisement()) {
				list.add(new Advertisement(adDto));
			}
			toReturn = new Pair<Integer, List<Advertisement>>(advertisementResultDto.getTotalResults(), list);
		}
		return toReturn;
	}

	@Override
	public SearchCriteriaDto createSearchCriteriaDto(String keywords, List<Long> jobFamilys, List<Long> typeOrganismes, List<Long> contractTypes, List<Long> regions, List<Long> classifications,
			List<Long> regimes) {
		SearchCriteriaDto searchCriteriaDto = new SearchCriteriaDto();
		if (StringUtils.isNotBlank(keywords)) {
			searchCriteriaDto.setKeywords(keywords);
		}
		if (CollectionUtils.isNotEmpty(regions)) {
			if (searchCriteriaDto.getRegions() == null) {
				searchCriteriaDto.setRegions(new Regions());
			}
			for (Long region : regions) {
				searchCriteriaDto.getRegions().getRegion().add(region);
			}
		}
		if (CollectionUtils.isNotEmpty(contractTypes)) {
			if (searchCriteriaDto.getContractTypes() == null) {
				searchCriteriaDto.setContractTypes(new ContractTypes());
			}
			for (Long contractType : contractTypes) {
				searchCriteriaDto.getContractTypes().getContractType().add(contractType);
			}
		}
		if (CollectionUtils.isNotEmpty(jobFamilys) || CollectionUtils.isNotEmpty(typeOrganismes) || CollectionUtils.isNotEmpty(classifications) || CollectionUtils.isNotEmpty(regimes)) {
			if (searchCriteriaDto.getCustomLovs() == null) {
				searchCriteriaDto.setCustomLovs(new CustomLovs());
			}
			addGroup(searchCriteriaDto, jobFamilys);
			addGroup(searchCriteriaDto, typeOrganismes);
			addGroup(searchCriteriaDto, classifications);
			addGroup(searchCriteriaDto, regimes);
		}

		// set Organizations Filter
		if (searchCriteriaDto.getOrganizationIds() == null) {
			searchCriteriaDto.setOrganizationIds(new OrganizationIds());
			for (Long orgId : Constants.VALID_ORGANIZATION_LIST) {
				searchCriteriaDto.getOrganizationIds().getOrganizationId().add(orgId);
			}
		}

		return searchCriteriaDto;
	}

	private void addGroup(SearchCriteriaDto searchCriteriaDto, List<Long> lovs) {
		if (CollectionUtils.isNotEmpty(lovs)) {
			CustomLovGroup cGroup = new CustomLovGroup();
			for (Long lov : lovs) {
				cGroup.getCustomLov().add(lov);
				searchCriteriaDto.getCustomLovs().getCustomLovGroup().add(cGroup);
			}
		}
	}

	public void setWsdlPath(String wsdlPath) {
		this.wsdlPath = wsdlPath;
	}

	public void setHeaderHandlerResolver(HeaderHandlerResolver headerHandlerResolver) {
		this.headerHandlerResolver = headerHandlerResolver;
	}

	public static class Advertisement {
		private String typeOrganisme;
		private String contractType;
		private String city;
		private String organisme;
		private String niveau;
		private Date postingEndDate;
		private Date postingStartDate;
		private String jobNumber;
		private String currency;
		private String compensationPeriod;
		private String compensation;
		private String title;
		private Long id;
		private List<CustomField> customFields;

		public Advertisement(AdvertisementDto advertisementDto) {
			if (advertisementDto != null) {
				this.title = advertisementDto.getJobTitle();
				this.id = advertisementDto.getId();
				this.city = advertisementDto.getLocation();
				if (advertisementDto.getPostingEndDate() != null) {
					this.postingEndDate = advertisementDto.getPostingEndDate().toGregorianCalendar().getTime();
				}
				if (advertisementDto.getPostingStartDate() != null) {
					this.postingStartDate = advertisementDto.getPostingStartDate().toGregorianCalendar().getTime();
				}
				jobNumber = advertisementDto.getJobNumber();
				List<LovCriterion> list = new ArrayList<>();
				if (advertisementDto.getCustomLovs() != null) {
					list.addAll(advertisementDto.getCustomLovs().getCustomLov());
				}
				if (advertisementDto.getStandardLovs() != null) {
					list.addAll(advertisementDto.getStandardLovs().getStandardLov());
				}

				String lovValue;
				LovWithActivatorsCriterion criterion = null;
				for (LovCriterion lovCriterion : list) {
					String label = null;
					if (lovCriterion.getCriteria() != null && !lovCriterion.getCriteria().getCriterion().isEmpty()) {
						criterion = lovCriterion.getCriteria().getCriterion().get(0);
						if (criterion != null) {
							label = criterion.getLabel();
						}
					}

					if (StringUtils.isNotBlank(label)) {
						lovValue = lovCriterion.getValue();
						if (Lov.ORGANISME.getName().equals(lovValue)) {
							this.organisme = label;
						} else if (Lov.CONTRACT_TYPE.getName().equals(lovValue)) {
							this.contractType = label;
						} else if (Lov.NIVEAU_RG.getName().equals(lovValue)) {
							this.niveau = label;
						} else if (Lov.CURRENCY.getName().equals(lovValue)) {
							this.currency = label;
						} else if (Lov.COMPENSATION_PERIOD.getName().equals(lovValue)) {
							this.compensationPeriod = label;
						}
					}

					if (advertisementDto.isShowCompensation() && (advertisementDto.getCompensationMinValue() != null || advertisementDto.getCompensationMaxValue() != null)) {
						StringBuffer s = new StringBuffer();
						if (advertisementDto.getCompensationMinValue() != null) {
							s.append(advertisementDto.getCompensationMinValue().intValue());
						}
						if (advertisementDto.getCompensationMaxValue() != null) {
							s.append("-");
							s.append(advertisementDto.getCompensationMaxValue().intValue());
						}
						if (this.currency != null) {
							s.append(" ");
							s.append(this.currency);
						}
						s.append(" par ");
						if (this.compensationPeriod != null) {
							s.append(this.compensationPeriod);
						}
						this.compensation = s.toString().toLowerCase();
					}

					if (advertisementDto.getCustomFields() != null) {
						customFields = advertisementDto.getCustomFields().getCustomField();
					}
				}
			}
		}

		public String getTypeOrganisme() {
			return typeOrganisme;
		}

		public String getContractType() {
			return contractType;
		}

		public String getCity() {
			return city;
		}

		public String getOrganisme() {
			return organisme;
		}

		public String getNiveau() {
			return niveau;
		}

		public Date getPostingEndDate() {
			return postingEndDate;
		}

		public String getTitle() {
			return title;
		}

		public Long getId() {
			return id;
		}

		public String getCompensation() {
			return compensation;
		}

		public Date getPostingStartDate() {
			return postingStartDate;
		}

		public String getJobNumber() {
			return jobNumber;
		}

		public List<CustomField> getCustomFields() {
			return customFields;
		}
	}
}