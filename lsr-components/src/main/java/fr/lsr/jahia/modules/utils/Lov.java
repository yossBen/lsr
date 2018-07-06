package fr.lsr.jahia.modules.utils;

public enum Lov {
	JOB_FAMILY("Famille de metiers interne"), JOB_FAMILY_EXTERNE("Domaine de mtiers externe"), JOBS("Metiers la Secu recrute"), REGION("Region@France"), REGIME("Regime"), TYPE_ORGANISME("TypeOrganisme"), ORGANISME(
			"Organisme"), CLASSIFICATION(
					"GrilleClassification"), CONTRACT_TYPE("ContractType"), COEFFICIENT_RG("Coefficient RG"), NIVEAU_RG("Niveau RG"), CURRENCY("Currency"), COMPENSATION_PERIOD("CompensationPeriod"), METIERS("Metiers");
	private String name;

	Lov(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}