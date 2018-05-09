package fr.lsr.jahia.modules.bean;

import java.util.List;

import com.mrted.ws.LovDescendantDto;

import fr.lsr.jahia.modules.services.impl.LovServiceImpl;
import fr.lsr.jahia.modules.utils.Lov;
import fr.lsr.jahia.modules.utils.Regions;

/**
 * @author BENAGIBA
 */
public class LovBean {
	public Regions[] getRegion() {
		return LovServiceImpl.getInstance().getRegions();
	}

	public List<LovDescendantDto> getJobFamily() {
		return LovServiceImpl.getInstance().getLovs(Lov.JOB_FAMILY);
	}

	public List<LovDescendantDto> getContractType() {
		return LovServiceImpl.getInstance().getLovs(Lov.CONTRACT_TYPE);
	}

	public List<LovDescendantDto> getTypeOrganisme() {
		return LovServiceImpl.getInstance().getLovs(Lov.TYPE_ORGANISME);
	}

	public List<LovDescendantDto> getClassification() {
		return LovServiceImpl.getInstance().getLovs(Lov.CLASSIFICATION);
	}

	public List<LovDescendantDto> getRegime() {
		return LovServiceImpl.getInstance().getLovs(Lov.REGIME);
	}
}