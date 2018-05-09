<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>

<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<section aria-labelledby="offerTitle">
	<c:set var="posteId" value="${fn:escapeXml(param['posteId'])}" />
	<%--calculer l'offset--%>
	<c:if test="${!renderContext.editMode && !empty posteId}">
		<c:set var="offer" value="${lsr:getAdvertisementById(posteId)}" />
		<h1 id="offerTitle">${offer.title}</h1>
		<ul>
			<li>
				<fmt:message key="offer.city.label" />
				: ${offer.city}
			</li>
			<li>
				<fmt:message key="offer.contractType.label" />
				: ${offer.contractType}
			</li>
			<li>
				<fmt:message key="offer.publish.date.label" />
				:
				<fmt:formatDate value="${offer.postingEndDate}" pattern="dd/MM/yyyy" />
			</li>
			<c:if test="${!empty offer.compensation}">
				<li>
					<fmt:message key="offer.remuneration.label" />
					: ${offer.compensation}
				</li>
			</c:if>
			<li>
				<fmt:message key="offer.organization.label" />
				: ${offer.organisme}
			</li>
			<li>
				<fmt:message key="offer.qualification.label" />
				: ${offer.niveau}
			</li>
		</ul>
		<c:forEach items="${offer.customFields}" var="customField">
			<c:if test="${!empty customField.value}">
				<h2>${customField.label}</h2>
				<p>${customField.value}</p>
			</c:if>
		</c:forEach>
		<a class="btn btn-primary" target="_blank"
			href="https://emea3.recruitmentplatform.com/appproc/index.cfm?event=createSessionAfterSessionClear&jobboard=0&bSessionClear=true&nProfileIdFoundInAGP=&ID=${currentNode.resolveSite.properties['idLumesse'].string}&nPTID=${offer.id}">
			<fmt:message key="offer.postulate.label" />
		</a>
	</c:if>
	<c:if test="${renderContext.editMode}">
		<h1>Fiche de poste</h1>
	</c:if>
</section>