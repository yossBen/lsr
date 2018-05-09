package fr.lsr.jahia.modules.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jcr.RepositoryException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import org.apache.log4j.Logger;
import org.jahia.registries.ServicesRegistry;
import org.jahia.services.content.JCRCallback;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.content.JCRTemplate;
import org.jahia.services.content.decorator.JCRSiteNode;

import fr.lsr.jahia.modules.utils.Constants;
import fr.lsr.jahia.modules.utils.HeaderHandler;

public class HeaderHandlerResolver implements HandlerResolver {
	private static Logger LOGGER = Logger.getLogger(HeaderHandlerResolver.class);
	private static String ID_LUMESSE_CND = "idLumesse";
	private String idLumesse;

	public void start() {
		try {
			JCRTemplate.getInstance().doExecuteWithSystemSession(new JCRCallback<Object>() {
				@Override
				public Object doInJCR(JCRSessionWrapper session) throws RepositoryException {
					List<JCRSiteNode> sites = ServicesRegistry.getInstance().getJahiaSitesService().getSitesNodeList(session);
					for (JCRSiteNode site : sites) {
						if (site.isNodeType(Constants.LMIX_LSR_OPTIONS_OFFERS_SEARCH)) {
							try {
								idLumesse = site.getPropertyAsString(ID_LUMESSE_CND);
							} catch (Exception e) {
								LOGGER.error("Message : ", e);
							}
						}
					}
					return null;
				}
			});
		} catch (RepositoryException e) {
			LOGGER.error("Probleme lors de la configuration du site");
		}
	}

	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();
		handlerChain.add(new HeaderHandler(idLumesse));
		return handlerChain;
	}
}