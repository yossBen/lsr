<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>

<template:addResources type="javascript" resources="jquery.validate.js" />
<template:addResources type="javascript" resources="lst-components.js" />

<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageResultat" var="pageResultat" />
<c:set var="posteId" value="${fn:escapeXml(param['posteId'])}" />
<section aria-labelledby="offerTitle" class="cinq-br-bloc">
	<c:if test="${!renderContext.editMode && !empty posteId}">
		<c:set var="offer" value="${lsr:getAdvertisementById(posteId)}" />
		<div class="br-bloc-2">
			<section class="bloc-raisons-contenu">
				<div class="bloc-titre">
					<h1 id="offerTitle">${offer.title}</h1>
				</div>
				<div class="bloc-contenu-rz">
					<a href="${pageResultat.node.url}" class="lienback">Retour aux résulats</a>
					<div class="blockinfo">
						<div class="tableau">
							<table>
								<tbody>
									<tr>
										<td class="titre">
											<fmt:message key="offer.city.label" />
										</td>
										<td class="reponse">${offer.city}</td>
									</tr>
									<tr>
										<td class="titre">
											<fmt:message key="offer.contractType.label" />
										</td>
										<td class="reponse">${offer.contractType}</td>
									</tr>
									<tr>
										<td class="titre">
											<fmt:message key="offer.publish.date.label" />
										</td>
										<td class="reponse">
											<fmt:formatDate value="${offer.postingEndDate}" pattern="dd/MM/yyyy" />
										</td>
									</tr>
									<c:if test="${!empty offer.compensation}">
										<tr>
											<td class="titre">
												<fmt:message key="offer.remuneration.label" />
											</td>
											<td class="reponse">${offer.compensation}</td>
										</tr>
									</c:if>
									<tr>
										<td class="titre">
											<fmt:message key="offer.organization.label" />
										</td>
										<td class="reponse">${offer.organisme}</td>
									</tr>
									<tr>
										<td class="titre">
											<fmt:message key="offer.qualification.label" />
										</td>
										<td class="reponse">${offer.niveau}</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="boutons">
							<a target="_blank" class="bt blanc"
								href="https://emea3.recruitmentplatform.com/appproc/index.cfm?event=createSessionAfterSessionClear&jobboard=0&bSessionClear=true&nProfileIdFoundInAGP=&ID=${currentNode.resolveSite.properties['idLumesse'].string}&nPTID=${offer.id}">
								<fmt:message key="offer.postulate.label" />
							</a>
							<a href="#" class="bt blanc">Enregistrer</a>
							<!-- Button ou a href les deux marches <a href="" class="bt blanc">Envoyer par mail</a> -->
							<button type="button" class="bt blanc" data-toggle="modal" data-target="#modalSendMail">Envoyer par mail</button>
							<a href="" class="bt blanc" onclick="javascript:window.print();">Imprimer</a>
						</div>
					</div>
					<c:forEach items="${offer.customFields}" var="customField">
						<c:if test="${!empty customField.value}">
							<h3>${customField.label}</h3>
							<p>${customField.value}</p>
						</c:if>
					</c:forEach>
					<div class="row mrg40">
						<div class="col-md-3 col-sm-6">
							<a target="_blank" class="bt blanc"
								href="https://emea3.recruitmentplatform.com/appproc/index.cfm?event=createSessionAfterSessionClear&jobboard=0&bSessionClear=true&nProfileIdFoundInAGP=&ID=${currentNode.resolveSite.properties['idLumesse'].string}&nPTID=${offer.id}">
								<fmt:message key="offer.postulate.label" />
							</a>
						</div>
						<div class="col-md-3 col-sm-6">
							<a href="#" class="bt blanc">Enregistrer</a>
						</div>
						<div class="col-md-3 col-sm-6">
							<button type="button" class="bt blanc" data-toggle="modal" data-target="#modalSendMail">Envoyer par mail</button>
						</div>
						<div class="col-md-3 col-sm-6">
							<a href="" class="bt blanc" onclick="javascript:window.print();">Imprimer</a>
						</div>
					</div>
					<a href="${pageResultat.node.url}?${searchQuerySession}" class="lienback">Retour aux résulats</a>
				</div>
			</section>
		</div>
	</c:if>
	<c:if test="${renderContext.editMode}">
		<h1>Fiche de poste</h1>
	</c:if>
</section>
<%@include file="../../common/popin.jsp"%>