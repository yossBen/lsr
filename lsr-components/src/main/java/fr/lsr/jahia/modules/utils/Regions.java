package fr.lsr.jahia.modules.utils;

public enum Regions {
	R1("Auvergne-Rhône-Alpes", "3118-3509"), R2("Bourgogne-Franche-Comté", "3120-3507"), R3("Bretagne", "3121"), R4("Centre-Val de Loire", "3122"), R13("Corse", "3124"), R5("Grand Est",
			"3123-3131-3116"), R6("Hauts-de-France", "3133-3135"), R7("Île-de-France", "3128"), R8("Normandie", "3127-3119"), R9("Nouvelle-Aquitaine",
					"3136-3130-3117"), R10("Occitanie", "3508-3129"), R11("Pays de la Loire", "3134"), R12("Provence-Alpes-Côte d'Azur",
							"3137"), R14("Collectivités d'outre-mer", "5680"), R15("Guadeloupe", "5681"), R16("Guyane", "5682"), R17("Martinique", "5683"), R18("Réunion", "5684");
	// 3118-3509=Auvergne-Rhône-Alpes
	// 3120-3507=Bourgogne-Franche-Comté
	// 3121=Bretagne
	// 3122=Centre-Val de Loire
	// 3123-3131-3116=Grand Est
	// 3133-3135=Hauts-de-France
	// 3128=Île-de-France
	// 3127-3119=Normandie
	// 3136-3130-3117=Nouvelle-Aquitaine
	// 3508-3129=Occitanie
	// 3134=Pays de la Loire
	// 3137=Provence-Alpes-Côte d’Azur
	// 3124=Corse
	// 5680=Collectivités d'outre-mer
	// 5681=Guadeloupe
	// 5682=Guyane
	// 5683=Martinique
	// 5684=Réunion

	private String codes;
	private String name;

	Regions(String name, String codes) {
		this.name = name;
		this.codes = codes;
	}

	public String getName() {
		return name;
	}

	public String getCodes() {
		return codes;
	}

	public static Regions getRegionByCode(String code) {
		for (Regions r : Regions.values()) {
			if (r.getCodes().equals(code)) {
				return r;
			}
		}
		return null;
	}
}
