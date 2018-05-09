package fr.lsr.jahia.modules.utils;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
	private static Logger LOGGER = Logger.getLogger(HeaderHandler.class);
	// private static String ID_PREPROD = "Q9GFK026203F3VB7V6G688NDG";
	// private static String ID_PROD = "QMOFK026203F3VBQB8MLO8MJ3";
	private static String PASSWORD = "guest";

	private String idLumesse;

	public HeaderHandler(String idLumesse) {
		this.idLumesse = idLumesse;
	}

	public boolean handleMessage(SOAPMessageContext smc) {
		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			SOAPMessage message = smc.getMessage();
			try {
				SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				if (header == null) {
					header = envelope.addHeader();
				}

				SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

				SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
				usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
				SOAPElement username = usernameToken.addChildElement("Username", "wsse");
				username.addTextNode(idLumesse + ":guest:FO");

				SOAPElement password = usernameToken.addChildElement("Password", "wsse");
				password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
				password.addTextNode(PASSWORD);

				message.saveChanges();
				message.writeTo(System.out);
			} catch (Exception e) {
				LOGGER.error(e.getMessage(), e);
			}

		} else {
			try {
				smc.getMessage().writeTo(System.out);
			} catch (Exception e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return outboundProperty;
	}

	@Override
	public void close(MessageContext arg0) {

	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
}