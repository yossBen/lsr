package fr.lsr.jahia.modules.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.mail.MailService;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author BEN AJIBA
 */
public class SendOfferToFriendAction extends Action {
	public static final String PARAMS_EMAIL = "email";
	public static final String PARAMS_OFFER_URL = "offerurl";
	private MailService mailService;
	private String bodyMailTemplate;
	private String from;

	@Override
	public ActionResult doExecute(HttpServletRequest req, RenderContext renderContext, Resource resource, JCRSessionWrapper session, Map<String, List<String>> parameters, URLResolver urlResolver)
			throws Exception {
		String email = super.getParameter(parameters, PARAMS_EMAIL);
		String offerUrl = super.getParameter(parameters, PARAMS_OFFER_URL);

		Map<String, Object> bindings = new HashMap<String, Object>();
		bindings.put("body", offerUrl);
		mailService.sendMessageWithTemplate(bodyMailTemplate, bindings, email, from, null, null, resource.getLocale(), "Jahia LSR Components Module");

		JSONObject json = new JSONObject();
		json.put("statut", "ok");
		return new ActionResult(HttpServletResponse.SC_OK, null, false, json);
	}

	public void setBodyMailTemplate(String bodyMailTemplate) {
		this.bodyMailTemplate = bodyMailTemplate;
	}

	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}

	public void setFrom(String from) {
		this.from = from;
	}
}