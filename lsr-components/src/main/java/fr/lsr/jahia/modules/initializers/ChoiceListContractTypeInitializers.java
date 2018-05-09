package fr.lsr.jahia.modules.initializers;

import fr.lsr.jahia.modules.utils.Lov;

/**
 * 
 * @author BEN AJIBA
 *
 */
public class ChoiceListContractTypeInitializers extends AbstractChoiceListLovsInitializers {
	@Override
	public Lov getLov() {
		return Lov.CONTRACT_TYPE;
	}
}
