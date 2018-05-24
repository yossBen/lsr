package fr.lsr.jahia.modules.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.json.JSONObject;

import com.mrted.ws.DeliveryFrequency;

import fr.lsr.jahia.modules.services.SearchAgentService;
import fr.lsr.jahia.modules.utils.LsrUtils;

/**
 * @author BEN AJIBA
 */
public class CreateAlerteAction extends Action {
	public static final String PARAMS_REGIME = "regime";
	public static final String PARAMS_TYPEORGANISME = "typeOrganisme";
	public static final String PARAMS_JOBFAMILY = "jobFamily";
	public static final String PARAMS_CONTRACTTYPE = "contractType";
	public static final String PARAMS_CLASSIFICATION = "classification";
	public static final String PARAMS_REGION = "region";
	public static final String PARAMS_KEYWORDS = "keywords";
	public static final String PARAMS_EMAIL = "email";
	public static final String PARAMS_FREQUENCY = "frequency";
	public static final String PARAMS_EXPIRATION = "expiration";

	private static final String SEPARATOR = "[,-]";

	private SearchAgentService searchAgentService;

	@Override
	public ActionResult doExecute(HttpServletRequest req, RenderContext renderContext, Resource resource, JCRSessionWrapper session, Map<String, List<String>> parameters, URLResolver urlResolver)
			throws Exception {
		String[] regimes = StringUtils.split(super.getParameter(parameters, PARAMS_REGIME), SEPARATOR);
		String[] typeOrganismes = StringUtils.split(super.getParameter(parameters, PARAMS_TYPEORGANISME), SEPARATOR);
		String[] jobFamilys = StringUtils.split(super.getParameter(parameters, PARAMS_JOBFAMILY), SEPARATOR);
		String[] contractTypes = StringUtils.split(super.getParameter(parameters, PARAMS_CONTRACTTYPE), SEPARATOR);
		String[] classifications = StringUtils.split(super.getParameter(parameters, PARAMS_CLASSIFICATION), SEPARATOR);
		String[] regions = StringUtils.split(super.getParameter(parameters, PARAMS_REGION), SEPARATOR);

		String keywords = super.getParameter(parameters, PARAMS_KEYWORDS);
		String email = super.getParameter(parameters, PARAMS_EMAIL);
		String frequency = super.getParameter(parameters, PARAMS_FREQUENCY);
		String expiration = super.getParameter(parameters, PARAMS_EXPIRATION);

		if (StringUtils.isNotBlank(email) && StringUtils.isNotBlank(frequency) && StringUtils.isNotBlank(expiration)) {
			searchAgentService.createAlerte(keywords, LsrUtils.valueOf(jobFamilys), LsrUtils.valueOf(typeOrganismes), LsrUtils.valueOf(contractTypes), LsrUtils.valueOf(regions),
					LsrUtils.valueOf(classifications), LsrUtils.valueOf(regimes), email, DeliveryFrequency.valueOf(frequency), Integer.valueOf(expiration));
		}

		JSONObject json = new JSONObject();
		json.put("statut", "ok");
		return new ActionResult(HttpServletResponse.SC_OK, null, false, json);
	}

	public void setSearchAgentService(SearchAgentService searchAgentService) {
		this.searchAgentService = searchAgentService;
	}
}