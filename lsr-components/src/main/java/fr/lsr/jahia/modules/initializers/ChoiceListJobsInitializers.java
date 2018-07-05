package fr.lsr.jahia.modules.initializers;

import fr.lsr.jahia.modules.utils.Lov;

/**
 * 
 * @author BEN AJIBA
 *
 */
public class ChoiceListJobsInitializers extends AbstractChoiceListLovsInitializers {
	@Override
	public Lov getLov() {
		return Lov.JOBS;
	}
}
