
package com.mrted.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomField_QNAME = new QName("http://ws.mrted.com/", "customField");
    private final static QName _Lovhiercriterion_QNAME = new QName("http://ws.mrted.com/", "lovhiercriterion");
    private final static QName _Availablesearchcriteria_QNAME = new QName("http://ws.mrted.com/", "availablesearchcriteria");
    private final static QName _Sortingdetails_QNAME = new QName("http://ws.mrted.com/", "sortingdetails");
    private final static QName _CustomLovGroup_QNAME = new QName("http://ws.mrted.com/", "customLovGroup");
    private final static QName _GetSimpleAdvertisementsResponse_QNAME = new QName("http://ws.mrted.com/", "getSimpleAdvertisementsResponse");
    private final static QName _GetAdvertisementsSortingColumnsResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementsSortingColumnsResponse");
    private final static QName _GetAttachments_QNAME = new QName("http://ws.mrted.com/", "getAttachments");
    private final static QName _GetStandardCriteria_QNAME = new QName("http://ws.mrted.com/", "getStandardCriteria");
    private final static QName _GetCriteriaResponse_QNAME = new QName("http://ws.mrted.com/", "getCriteriaResponse");
    private final static QName _KeyValueDTO_QNAME = new QName("http://ws.mrted.com/", "keyValueDTO");
    private final static QName _AdvertisementSortingColumns_QNAME = new QName("http://ws.mrted.com/", "advertisementSortingColumns");
    private final static QName _GetAttachmentsFromTokenResponse_QNAME = new QName("http://ws.mrted.com/", "getAttachmentsFromTokenResponse");
    private final static QName _GetAdvertisementPreviewByToken_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementPreviewByToken");
    private final static QName _SearchCriteriaSorting_QNAME = new QName("http://ws.mrted.com/", "searchCriteriaSorting");
    private final static QName _GetAdvertisementsSortingColumns_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementsSortingColumns");
    private final static QName _GetSimpleAdvertisements_QNAME = new QName("http://ws.mrted.com/", "getSimpleAdvertisements");
    private final static QName _AttachmentContent_QNAME = new QName("http://ws.mrted.com/", "attachmentContent");
    private final static QName _GetAdvertisementByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementByIdResponse");
    private final static QName _GetStandardCriteriaResponse_QNAME = new QName("http://ws.mrted.com/", "getStandardCriteriaResponse");
    private final static QName _GetAdvertisementsByPage_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementsByPage");
    private final static QName _AssignedImage_QNAME = new QName("http://ws.mrted.com/", "assignedImage");
    private final static QName _GetAdvertisementById_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementById");
    private final static QName _GetSimpleAdvertisementsByPage_QNAME = new QName("http://ws.mrted.com/", "getSimpleAdvertisementsByPage");
    private final static QName _GetAttachmentsFromToken_QNAME = new QName("http://ws.mrted.com/", "getAttachmentsFromToken");
    private final static QName _AdvertisementResult_QNAME = new QName("http://ws.mrted.com/", "advertisementResult");
    private final static QName _Countrycriterion_QNAME = new QName("http://ws.mrted.com/", "countrycriterion");
    private final static QName _Organizationcriterion_QNAME = new QName("http://ws.mrted.com/", "organizationcriterion");
    private final static QName _GetAdvertisementsResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementsResponse");
    private final static QName _GetAttachmentsResponse_QNAME = new QName("http://ws.mrted.com/", "getAttachmentsResponse");
    private final static QName _GetAdvertisements_QNAME = new QName("http://ws.mrted.com/", "getAdvertisements");
    private final static QName _GetAdvertisementsByPageResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementsByPageResponse");
    private final static QName _GetAdvertisementPreviewByTokenResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementPreviewByTokenResponse");
    private final static QName _Advertisements_QNAME = new QName("http://ws.mrted.com/", "advertisements");
    private final static QName _Simpleadvertisement_QNAME = new QName("http://ws.mrted.com/", "simpleadvertisement");
    private final static QName _Lovcriterion_QNAME = new QName("http://ws.mrted.com/", "lovcriterion");
    private final static QName _Criterion_QNAME = new QName("http://ws.mrted.com/", "criterion");
    private final static QName _GetCriteria_QNAME = new QName("http://ws.mrted.com/", "getCriteria");
    private final static QName _Simpleuserdto_QNAME = new QName("http://ws.mrted.com/", "simpleuserdto");
    private final static QName _GetAdvertisementImagesResponse_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementImagesResponse");
    private final static QName _GetAdvertisementImages_QNAME = new QName("http://ws.mrted.com/", "getAdvertisementImages");
    private final static QName _GetSimpleAdvertisementsByPageResponse_QNAME = new QName("http://ws.mrted.com/", "getSimpleAdvertisementsByPageResponse");
    private final static QName _Lovactivatorscriterion_QNAME = new QName("http://ws.mrted.com/", "lovactivatorscriterion");
    private final static QName _Searchcriteria_QNAME = new QName("http://ws.mrted.com/", "searchcriteria");
    private final static QName _SimpleAdvertisementResult_QNAME = new QName("http://ws.mrted.com/", "simpleAdvertisementResult");
    private final static QName _GetAdvertisementByIdShowImages_QNAME = new QName("http://ws.mrted.com/", "showImages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CategoryListCriterion }
     * 
     */
    public CategoryListCriterion createCategoryListCriterion() {
        return new CategoryListCriterion();
    }

    /**
     * Create an instance of {@link CategoryNameDto }
     * 
     */
    public CategoryNameDto createCategoryNameDto() {
        return new CategoryNameDto();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto }
     * 
     */
    public SearchCriteriaDto createSearchCriteriaDto() {
        return new SearchCriteriaDto();
    }

    /**
     * Create an instance of {@link SimpleAdvertisementResultDto }
     * 
     */
    public SimpleAdvertisementResultDto createSimpleAdvertisementResultDto() {
        return new SimpleAdvertisementResultDto();
    }

    /**
     * Create an instance of {@link AdvertisementDto }
     * 
     */
    public AdvertisementDto createAdvertisementDto() {
        return new AdvertisementDto();
    }

    /**
     * Create an instance of {@link LovCriterion }
     * 
     */
    public LovCriterion createLovCriterion() {
        return new LovCriterion();
    }

    /**
     * Create an instance of {@link AdvertisementResultDto }
     * 
     */
    public AdvertisementResultDto createAdvertisementResultDto() {
        return new AdvertisementResultDto();
    }

    /**
     * Create an instance of {@link CountryCriterion }
     * 
     */
    public CountryCriterion createCountryCriterion() {
        return new CountryCriterion();
    }

    /**
     * Create an instance of {@link OrganizationCriterion }
     * 
     */
    public OrganizationCriterion createOrganizationCriterion() {
        return new OrganizationCriterion();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto }
     * 
     */
    public AvailableSearchCriteriaDto createAvailableSearchCriteriaDto() {
        return new AvailableSearchCriteriaDto();
    }

    /**
     * Create an instance of {@link GetAdvertisementsSortingColumnsResponse }
     * 
     */
    public GetAdvertisementsSortingColumnsResponse createGetAdvertisementsSortingColumnsResponse() {
        return new GetAdvertisementsSortingColumnsResponse();
    }

    /**
     * Create an instance of {@link GetSimpleAdvertisementsResponse }
     * 
     */
    public GetSimpleAdvertisementsResponse createGetSimpleAdvertisementsResponse() {
        return new GetSimpleAdvertisementsResponse();
    }

    /**
     * Create an instance of {@link CustomLovGroup }
     * 
     */
    public CustomLovGroup createCustomLovGroup() {
        return new CustomLovGroup();
    }

    /**
     * Create an instance of {@link SortingDetailsDto }
     * 
     */
    public SortingDetailsDto createSortingDetailsDto() {
        return new SortingDetailsDto();
    }

    /**
     * Create an instance of {@link LovHierarchedCriterion }
     * 
     */
    public LovHierarchedCriterion createLovHierarchedCriterion() {
        return new LovHierarchedCriterion();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link KeyValueDTO }
     * 
     */
    public KeyValueDTO createKeyValueDTO() {
        return new KeyValueDTO();
    }

    /**
     * Create an instance of {@link GetCriteriaResponse }
     * 
     */
    public GetCriteriaResponse createGetCriteriaResponse() {
        return new GetCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetStandardCriteria }
     * 
     */
    public GetStandardCriteria createGetStandardCriteria() {
        return new GetStandardCriteria();
    }

    /**
     * Create an instance of {@link GetAttachments }
     * 
     */
    public GetAttachments createGetAttachments() {
        return new GetAttachments();
    }

    /**
     * Create an instance of {@link SearchCriteriaSorting }
     * 
     */
    public SearchCriteriaSorting createSearchCriteriaSorting() {
        return new SearchCriteriaSorting();
    }

    /**
     * Create an instance of {@link GetAdvertisementsSortingColumns }
     * 
     */
    public GetAdvertisementsSortingColumns createGetAdvertisementsSortingColumns() {
        return new GetAdvertisementsSortingColumns();
    }

    /**
     * Create an instance of {@link GetAttachmentsFromTokenResponse }
     * 
     */
    public GetAttachmentsFromTokenResponse createGetAttachmentsFromTokenResponse() {
        return new GetAttachmentsFromTokenResponse();
    }

    /**
     * Create an instance of {@link GetAdvertisementPreviewByToken }
     * 
     */
    public GetAdvertisementPreviewByToken createGetAdvertisementPreviewByToken() {
        return new GetAdvertisementPreviewByToken();
    }

    /**
     * Create an instance of {@link AdvertisementSortingColumns }
     * 
     */
    public AdvertisementSortingColumns createAdvertisementSortingColumns() {
        return new AdvertisementSortingColumns();
    }

    /**
     * Create an instance of {@link AssignedImageDto }
     * 
     */
    public AssignedImageDto createAssignedImageDto() {
        return new AssignedImageDto();
    }

    /**
     * Create an instance of {@link GetStandardCriteriaResponse }
     * 
     */
    public GetStandardCriteriaResponse createGetStandardCriteriaResponse() {
        return new GetStandardCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetAdvertisementsByPage }
     * 
     */
    public GetAdvertisementsByPage createGetAdvertisementsByPage() {
        return new GetAdvertisementsByPage();
    }

    /**
     * Create an instance of {@link GetAdvertisementByIdResponse }
     * 
     */
    public GetAdvertisementByIdResponse createGetAdvertisementByIdResponse() {
        return new GetAdvertisementByIdResponse();
    }

    /**
     * Create an instance of {@link AttachmentContentDto }
     * 
     */
    public AttachmentContentDto createAttachmentContentDto() {
        return new AttachmentContentDto();
    }

    /**
     * Create an instance of {@link GetSimpleAdvertisements }
     * 
     */
    public GetSimpleAdvertisements createGetSimpleAdvertisements() {
        return new GetSimpleAdvertisements();
    }

    /**
     * Create an instance of {@link GetAttachmentsFromToken }
     * 
     */
    public GetAttachmentsFromToken createGetAttachmentsFromToken() {
        return new GetAttachmentsFromToken();
    }

    /**
     * Create an instance of {@link GetSimpleAdvertisementsByPage }
     * 
     */
    public GetSimpleAdvertisementsByPage createGetSimpleAdvertisementsByPage() {
        return new GetSimpleAdvertisementsByPage();
    }

    /**
     * Create an instance of {@link GetAdvertisementById }
     * 
     */
    public GetAdvertisementById createGetAdvertisementById() {
        return new GetAdvertisementById();
    }

    /**
     * Create an instance of {@link GetAdvertisementsByPageResponse }
     * 
     */
    public GetAdvertisementsByPageResponse createGetAdvertisementsByPageResponse() {
        return new GetAdvertisementsByPageResponse();
    }

    /**
     * Create an instance of {@link GetAdvertisements }
     * 
     */
    public GetAdvertisements createGetAdvertisements() {
        return new GetAdvertisements();
    }

    /**
     * Create an instance of {@link GetAttachmentsResponse }
     * 
     */
    public GetAttachmentsResponse createGetAttachmentsResponse() {
        return new GetAttachmentsResponse();
    }

    /**
     * Create an instance of {@link GetAdvertisementsResponse }
     * 
     */
    public GetAdvertisementsResponse createGetAdvertisementsResponse() {
        return new GetAdvertisementsResponse();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link SimpleAdvertisementDto }
     * 
     */
    public SimpleAdvertisementDto createSimpleAdvertisementDto() {
        return new SimpleAdvertisementDto();
    }

    /**
     * Create an instance of {@link GetAdvertisementPreviewByTokenResponse }
     * 
     */
    public GetAdvertisementPreviewByTokenResponse createGetAdvertisementPreviewByTokenResponse() {
        return new GetAdvertisementPreviewByTokenResponse();
    }

    /**
     * Create an instance of {@link LovWithActivatorsCriterion }
     * 
     */
    public LovWithActivatorsCriterion createLovWithActivatorsCriterion() {
        return new LovWithActivatorsCriterion();
    }

    /**
     * Create an instance of {@link GetSimpleAdvertisementsByPageResponse }
     * 
     */
    public GetSimpleAdvertisementsByPageResponse createGetSimpleAdvertisementsByPageResponse() {
        return new GetSimpleAdvertisementsByPageResponse();
    }

    /**
     * Create an instance of {@link GetAdvertisementImages }
     * 
     */
    public GetAdvertisementImages createGetAdvertisementImages() {
        return new GetAdvertisementImages();
    }

    /**
     * Create an instance of {@link GetAdvertisementImagesResponse }
     * 
     */
    public GetAdvertisementImagesResponse createGetAdvertisementImagesResponse() {
        return new GetAdvertisementImagesResponse();
    }

    /**
     * Create an instance of {@link SimpleUserDto }
     * 
     */
    public SimpleUserDto createSimpleUserDto() {
        return new SimpleUserDto();
    }

    /**
     * Create an instance of {@link GetCriteria }
     * 
     */
    public GetCriteria createGetCriteria() {
        return new GetCriteria();
    }

    /**
     * Create an instance of {@link Activators }
     * 
     */
    public Activators createActivators() {
        return new Activators();
    }

    /**
     * Create an instance of {@link CategoryListCriterion.Criteria }
     * 
     */
    public CategoryListCriterion.Criteria createCategoryListCriterionCriteria() {
        return new CategoryListCriterion.Criteria();
    }

    /**
     * Create an instance of {@link CategoryNameDto.CategoryIds }
     * 
     */
    public CategoryNameDto.CategoryIds createCategoryNameDtoCategoryIds() {
        return new CategoryNameDto.CategoryIds();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.AdLanguages }
     * 
     */
    public SearchCriteriaDto.AdLanguages createSearchCriteriaDtoAdLanguages() {
        return new SearchCriteriaDto.AdLanguages();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.CategoryLists }
     * 
     */
    public SearchCriteriaDto.CategoryLists createSearchCriteriaDtoCategoryLists() {
        return new SearchCriteriaDto.CategoryLists();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.ContractTypes }
     * 
     */
    public SearchCriteriaDto.ContractTypes createSearchCriteriaDtoContractTypes() {
        return new SearchCriteriaDto.ContractTypes();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.Countries }
     * 
     */
    public SearchCriteriaDto.Countries createSearchCriteriaDtoCountries() {
        return new SearchCriteriaDto.Countries();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.CustomLovs }
     * 
     */
    public SearchCriteriaDto.CustomLovs createSearchCriteriaDtoCustomLovs() {
        return new SearchCriteriaDto.CustomLovs();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.OrganizationIds }
     * 
     */
    public SearchCriteriaDto.OrganizationIds createSearchCriteriaDtoOrganizationIds() {
        return new SearchCriteriaDto.OrganizationIds();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.Regions }
     * 
     */
    public SearchCriteriaDto.Regions createSearchCriteriaDtoRegions() {
        return new SearchCriteriaDto.Regions();
    }

    /**
     * Create an instance of {@link SearchCriteriaDto.ScheduleTypes }
     * 
     */
    public SearchCriteriaDto.ScheduleTypes createSearchCriteriaDtoScheduleTypes() {
        return new SearchCriteriaDto.ScheduleTypes();
    }

    /**
     * Create an instance of {@link SimpleAdvertisementResultDto.SimpleAdvertisements }
     * 
     */
    public SimpleAdvertisementResultDto.SimpleAdvertisements createSimpleAdvertisementResultDtoSimpleAdvertisements() {
        return new SimpleAdvertisementResultDto.SimpleAdvertisements();
    }

    /**
     * Create an instance of {@link AdvertisementDto.CategoryLists }
     * 
     */
    public AdvertisementDto.CategoryLists createAdvertisementDtoCategoryLists() {
        return new AdvertisementDto.CategoryLists();
    }

    /**
     * Create an instance of {@link AdvertisementDto.ConfigurableFields }
     * 
     */
    public AdvertisementDto.ConfigurableFields createAdvertisementDtoConfigurableFields() {
        return new AdvertisementDto.ConfigurableFields();
    }

    /**
     * Create an instance of {@link AdvertisementDto.CustomFields }
     * 
     */
    public AdvertisementDto.CustomFields createAdvertisementDtoCustomFields() {
        return new AdvertisementDto.CustomFields();
    }

    /**
     * Create an instance of {@link AdvertisementDto.CustomLovs }
     * 
     */
    public AdvertisementDto.CustomLovs createAdvertisementDtoCustomLovs() {
        return new AdvertisementDto.CustomLovs();
    }

    /**
     * Create an instance of {@link AdvertisementDto.Operationals }
     * 
     */
    public AdvertisementDto.Operationals createAdvertisementDtoOperationals() {
        return new AdvertisementDto.Operationals();
    }

    /**
     * Create an instance of {@link AdvertisementDto.Organizations }
     * 
     */
    public AdvertisementDto.Organizations createAdvertisementDtoOrganizations() {
        return new AdvertisementDto.Organizations();
    }

    /**
     * Create an instance of {@link AdvertisementDto.Recruiters }
     * 
     */
    public AdvertisementDto.Recruiters createAdvertisementDtoRecruiters() {
        return new AdvertisementDto.Recruiters();
    }

    /**
     * Create an instance of {@link AdvertisementDto.StandardLovs }
     * 
     */
    public AdvertisementDto.StandardLovs createAdvertisementDtoStandardLovs() {
        return new AdvertisementDto.StandardLovs();
    }

    /**
     * Create an instance of {@link AdvertisementDto.AssignedImages }
     * 
     */
    public AdvertisementDto.AssignedImages createAdvertisementDtoAssignedImages() {
        return new AdvertisementDto.AssignedImages();
    }

    /**
     * Create an instance of {@link LovCriterion.Parents }
     * 
     */
    public LovCriterion.Parents createLovCriterionParents() {
        return new LovCriterion.Parents();
    }

    /**
     * Create an instance of {@link LovCriterion.Criteria }
     * 
     */
    public LovCriterion.Criteria createLovCriterionCriteria() {
        return new LovCriterion.Criteria();
    }

    /**
     * Create an instance of {@link AdvertisementResultDto.Advertisements }
     * 
     */
    public AdvertisementResultDto.Advertisements createAdvertisementResultDtoAdvertisements() {
        return new AdvertisementResultDto.Advertisements();
    }

    /**
     * Create an instance of {@link CountryCriterion.Regions }
     * 
     */
    public CountryCriterion.Regions createCountryCriterionRegions() {
        return new CountryCriterion.Regions();
    }

    /**
     * Create an instance of {@link OrganizationCriterion.Suborganizations }
     * 
     */
    public OrganizationCriterion.Suborganizations createOrganizationCriterionSuborganizations() {
        return new OrganizationCriterion.Suborganizations();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.AdLanguages }
     * 
     */
    public AvailableSearchCriteriaDto.AdLanguages createAvailableSearchCriteriaDtoAdLanguages() {
        return new AvailableSearchCriteriaDto.AdLanguages();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.CategoryLists }
     * 
     */
    public AvailableSearchCriteriaDto.CategoryLists createAvailableSearchCriteriaDtoCategoryLists() {
        return new AvailableSearchCriteriaDto.CategoryLists();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.Countries }
     * 
     */
    public AvailableSearchCriteriaDto.Countries createAvailableSearchCriteriaDtoCountries() {
        return new AvailableSearchCriteriaDto.Countries();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.Customlovs }
     * 
     */
    public AvailableSearchCriteriaDto.Customlovs createAvailableSearchCriteriaDtoCustomlovs() {
        return new AvailableSearchCriteriaDto.Customlovs();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.Organizations }
     * 
     */
    public AvailableSearchCriteriaDto.Organizations createAvailableSearchCriteriaDtoOrganizations() {
        return new AvailableSearchCriteriaDto.Organizations();
    }

    /**
     * Create an instance of {@link AvailableSearchCriteriaDto.StandardLovs }
     * 
     */
    public AvailableSearchCriteriaDto.StandardLovs createAvailableSearchCriteriaDtoStandardLovs() {
        return new AvailableSearchCriteriaDto.StandardLovs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "customField")
    public JAXBElement<CustomField> createCustomField(CustomField value) {
        return new JAXBElement<CustomField>(_CustomField_QNAME, CustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LovHierarchedCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lovhiercriterion")
    public JAXBElement<LovHierarchedCriterion> createLovhiercriterion(LovHierarchedCriterion value) {
        return new JAXBElement<LovHierarchedCriterion>(_Lovhiercriterion_QNAME, LovHierarchedCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableSearchCriteriaDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "availablesearchcriteria")
    public JAXBElement<AvailableSearchCriteriaDto> createAvailablesearchcriteria(AvailableSearchCriteriaDto value) {
        return new JAXBElement<AvailableSearchCriteriaDto>(_Availablesearchcriteria_QNAME, AvailableSearchCriteriaDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingDetailsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "sortingdetails")
    public JAXBElement<SortingDetailsDto> createSortingdetails(SortingDetailsDto value) {
        return new JAXBElement<SortingDetailsDto>(_Sortingdetails_QNAME, SortingDetailsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomLovGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "customLovGroup")
    public JAXBElement<CustomLovGroup> createCustomLovGroup(CustomLovGroup value) {
        return new JAXBElement<CustomLovGroup>(_CustomLovGroup_QNAME, CustomLovGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleAdvertisementsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getSimpleAdvertisementsResponse")
    public JAXBElement<GetSimpleAdvertisementsResponse> createGetSimpleAdvertisementsResponse(GetSimpleAdvertisementsResponse value) {
        return new JAXBElement<GetSimpleAdvertisementsResponse>(_GetSimpleAdvertisementsResponse_QNAME, GetSimpleAdvertisementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementsSortingColumnsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementsSortingColumnsResponse")
    public JAXBElement<GetAdvertisementsSortingColumnsResponse> createGetAdvertisementsSortingColumnsResponse(GetAdvertisementsSortingColumnsResponse value) {
        return new JAXBElement<GetAdvertisementsSortingColumnsResponse>(_GetAdvertisementsSortingColumnsResponse_QNAME, GetAdvertisementsSortingColumnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAttachments")
    public JAXBElement<GetAttachments> createGetAttachments(GetAttachments value) {
        return new JAXBElement<GetAttachments>(_GetAttachments_QNAME, GetAttachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStandardCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getStandardCriteria")
    public JAXBElement<GetStandardCriteria> createGetStandardCriteria(GetStandardCriteria value) {
        return new JAXBElement<GetStandardCriteria>(_GetStandardCriteria_QNAME, GetStandardCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCriteriaResponse")
    public JAXBElement<GetCriteriaResponse> createGetCriteriaResponse(GetCriteriaResponse value) {
        return new JAXBElement<GetCriteriaResponse>(_GetCriteriaResponse_QNAME, GetCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "keyValueDTO")
    public JAXBElement<KeyValueDTO> createKeyValueDTO(KeyValueDTO value) {
        return new JAXBElement<KeyValueDTO>(_KeyValueDTO_QNAME, KeyValueDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvertisementSortingColumns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "advertisementSortingColumns")
    public JAXBElement<AdvertisementSortingColumns> createAdvertisementSortingColumns(AdvertisementSortingColumns value) {
        return new JAXBElement<AdvertisementSortingColumns>(_AdvertisementSortingColumns_QNAME, AdvertisementSortingColumns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentsFromTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAttachmentsFromTokenResponse")
    public JAXBElement<GetAttachmentsFromTokenResponse> createGetAttachmentsFromTokenResponse(GetAttachmentsFromTokenResponse value) {
        return new JAXBElement<GetAttachmentsFromTokenResponse>(_GetAttachmentsFromTokenResponse_QNAME, GetAttachmentsFromTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementPreviewByToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementPreviewByToken")
    public JAXBElement<GetAdvertisementPreviewByToken> createGetAdvertisementPreviewByToken(GetAdvertisementPreviewByToken value) {
        return new JAXBElement<GetAdvertisementPreviewByToken>(_GetAdvertisementPreviewByToken_QNAME, GetAdvertisementPreviewByToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaSorting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "searchCriteriaSorting")
    public JAXBElement<SearchCriteriaSorting> createSearchCriteriaSorting(SearchCriteriaSorting value) {
        return new JAXBElement<SearchCriteriaSorting>(_SearchCriteriaSorting_QNAME, SearchCriteriaSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementsSortingColumns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementsSortingColumns")
    public JAXBElement<GetAdvertisementsSortingColumns> createGetAdvertisementsSortingColumns(GetAdvertisementsSortingColumns value) {
        return new JAXBElement<GetAdvertisementsSortingColumns>(_GetAdvertisementsSortingColumns_QNAME, GetAdvertisementsSortingColumns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleAdvertisements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getSimpleAdvertisements")
    public JAXBElement<GetSimpleAdvertisements> createGetSimpleAdvertisements(GetSimpleAdvertisements value) {
        return new JAXBElement<GetSimpleAdvertisements>(_GetSimpleAdvertisements_QNAME, GetSimpleAdvertisements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentContentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "attachmentContent")
    public JAXBElement<AttachmentContentDto> createAttachmentContent(AttachmentContentDto value) {
        return new JAXBElement<AttachmentContentDto>(_AttachmentContent_QNAME, AttachmentContentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementByIdResponse")
    public JAXBElement<GetAdvertisementByIdResponse> createGetAdvertisementByIdResponse(GetAdvertisementByIdResponse value) {
        return new JAXBElement<GetAdvertisementByIdResponse>(_GetAdvertisementByIdResponse_QNAME, GetAdvertisementByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStandardCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getStandardCriteriaResponse")
    public JAXBElement<GetStandardCriteriaResponse> createGetStandardCriteriaResponse(GetStandardCriteriaResponse value) {
        return new JAXBElement<GetStandardCriteriaResponse>(_GetStandardCriteriaResponse_QNAME, GetStandardCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementsByPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementsByPage")
    public JAXBElement<GetAdvertisementsByPage> createGetAdvertisementsByPage(GetAdvertisementsByPage value) {
        return new JAXBElement<GetAdvertisementsByPage>(_GetAdvertisementsByPage_QNAME, GetAdvertisementsByPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedImageDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignedImage")
    public JAXBElement<AssignedImageDto> createAssignedImage(AssignedImageDto value) {
        return new JAXBElement<AssignedImageDto>(_AssignedImage_QNAME, AssignedImageDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementById")
    public JAXBElement<GetAdvertisementById> createGetAdvertisementById(GetAdvertisementById value) {
        return new JAXBElement<GetAdvertisementById>(_GetAdvertisementById_QNAME, GetAdvertisementById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleAdvertisementsByPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getSimpleAdvertisementsByPage")
    public JAXBElement<GetSimpleAdvertisementsByPage> createGetSimpleAdvertisementsByPage(GetSimpleAdvertisementsByPage value) {
        return new JAXBElement<GetSimpleAdvertisementsByPage>(_GetSimpleAdvertisementsByPage_QNAME, GetSimpleAdvertisementsByPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentsFromToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAttachmentsFromToken")
    public JAXBElement<GetAttachmentsFromToken> createGetAttachmentsFromToken(GetAttachmentsFromToken value) {
        return new JAXBElement<GetAttachmentsFromToken>(_GetAttachmentsFromToken_QNAME, GetAttachmentsFromToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvertisementResultDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "advertisementResult")
    public JAXBElement<AdvertisementResultDto> createAdvertisementResult(AdvertisementResultDto value) {
        return new JAXBElement<AdvertisementResultDto>(_AdvertisementResult_QNAME, AdvertisementResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "countrycriterion")
    public JAXBElement<CountryCriterion> createCountrycriterion(CountryCriterion value) {
        return new JAXBElement<CountryCriterion>(_Countrycriterion_QNAME, CountryCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "organizationcriterion")
    public JAXBElement<OrganizationCriterion> createOrganizationcriterion(OrganizationCriterion value) {
        return new JAXBElement<OrganizationCriterion>(_Organizationcriterion_QNAME, OrganizationCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementsResponse")
    public JAXBElement<GetAdvertisementsResponse> createGetAdvertisementsResponse(GetAdvertisementsResponse value) {
        return new JAXBElement<GetAdvertisementsResponse>(_GetAdvertisementsResponse_QNAME, GetAdvertisementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAttachmentsResponse")
    public JAXBElement<GetAttachmentsResponse> createGetAttachmentsResponse(GetAttachmentsResponse value) {
        return new JAXBElement<GetAttachmentsResponse>(_GetAttachmentsResponse_QNAME, GetAttachmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisements")
    public JAXBElement<GetAdvertisements> createGetAdvertisements(GetAdvertisements value) {
        return new JAXBElement<GetAdvertisements>(_GetAdvertisements_QNAME, GetAdvertisements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementsByPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementsByPageResponse")
    public JAXBElement<GetAdvertisementsByPageResponse> createGetAdvertisementsByPageResponse(GetAdvertisementsByPageResponse value) {
        return new JAXBElement<GetAdvertisementsByPageResponse>(_GetAdvertisementsByPageResponse_QNAME, GetAdvertisementsByPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementPreviewByTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementPreviewByTokenResponse")
    public JAXBElement<GetAdvertisementPreviewByTokenResponse> createGetAdvertisementPreviewByTokenResponse(GetAdvertisementPreviewByTokenResponse value) {
        return new JAXBElement<GetAdvertisementPreviewByTokenResponse>(_GetAdvertisementPreviewByTokenResponse_QNAME, GetAdvertisementPreviewByTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvertisementDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "advertisements")
    public JAXBElement<AdvertisementDto> createAdvertisements(AdvertisementDto value) {
        return new JAXBElement<AdvertisementDto>(_Advertisements_QNAME, AdvertisementDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAdvertisementDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "simpleadvertisement")
    public JAXBElement<SimpleAdvertisementDto> createSimpleadvertisement(SimpleAdvertisementDto value) {
        return new JAXBElement<SimpleAdvertisementDto>(_Simpleadvertisement_QNAME, SimpleAdvertisementDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LovCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lovcriterion")
    public JAXBElement<LovCriterion> createLovcriterion(LovCriterion value) {
        return new JAXBElement<LovCriterion>(_Lovcriterion_QNAME, LovCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "criterion")
    public JAXBElement<Criterion> createCriterion(Criterion value) {
        return new JAXBElement<Criterion>(_Criterion_QNAME, Criterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCriteria")
    public JAXBElement<GetCriteria> createGetCriteria(GetCriteria value) {
        return new JAXBElement<GetCriteria>(_GetCriteria_QNAME, GetCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleUserDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "simpleuserdto")
    public JAXBElement<SimpleUserDto> createSimpleuserdto(SimpleUserDto value) {
        return new JAXBElement<SimpleUserDto>(_Simpleuserdto_QNAME, SimpleUserDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementImagesResponse")
    public JAXBElement<GetAdvertisementImagesResponse> createGetAdvertisementImagesResponse(GetAdvertisementImagesResponse value) {
        return new JAXBElement<GetAdvertisementImagesResponse>(_GetAdvertisementImagesResponse_QNAME, GetAdvertisementImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdvertisementImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getAdvertisementImages")
    public JAXBElement<GetAdvertisementImages> createGetAdvertisementImages(GetAdvertisementImages value) {
        return new JAXBElement<GetAdvertisementImages>(_GetAdvertisementImages_QNAME, GetAdvertisementImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleAdvertisementsByPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getSimpleAdvertisementsByPageResponse")
    public JAXBElement<GetSimpleAdvertisementsByPageResponse> createGetSimpleAdvertisementsByPageResponse(GetSimpleAdvertisementsByPageResponse value) {
        return new JAXBElement<GetSimpleAdvertisementsByPageResponse>(_GetSimpleAdvertisementsByPageResponse_QNAME, GetSimpleAdvertisementsByPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LovWithActivatorsCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lovactivatorscriterion")
    public JAXBElement<LovWithActivatorsCriterion> createLovactivatorscriterion(LovWithActivatorsCriterion value) {
        return new JAXBElement<LovWithActivatorsCriterion>(_Lovactivatorscriterion_QNAME, LovWithActivatorsCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "searchcriteria")
    public JAXBElement<SearchCriteriaDto> createSearchcriteria(SearchCriteriaDto value) {
        return new JAXBElement<SearchCriteriaDto>(_Searchcriteria_QNAME, SearchCriteriaDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAdvertisementResultDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "simpleAdvertisementResult")
    public JAXBElement<SimpleAdvertisementResultDto> createSimpleAdvertisementResult(SimpleAdvertisementResultDto value) {
        return new JAXBElement<SimpleAdvertisementResultDto>(_SimpleAdvertisementResult_QNAME, SimpleAdvertisementResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "showImages", scope = GetAdvertisementById.class)
    public JAXBElement<Boolean> createGetAdvertisementByIdShowImages(Boolean value) {
        return new JAXBElement<Boolean>(_GetAdvertisementByIdShowImages_QNAME, Boolean.class, GetAdvertisementById.class, value);
    }

}
