package fr.lsr.jahia.modules.initializers;

import fr.lsr.jahia.modules.utils.Lov;

/**
 * 
 * @author BEN AJIBA
 *
 */
public class ChoiceListJobFamilyInitializers extends AbstractChoiceListLovsInitializers {
	@Override
	public Lov getLov() {
		return Lov.JOB_FAMILY_EXTERNE;
	}
}
