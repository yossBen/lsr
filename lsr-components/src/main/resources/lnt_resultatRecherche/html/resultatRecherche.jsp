<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>

<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageFichePoste" var="pageFichePoste" />
<template:addResources type="javascript" resources="lst-components.js" />

<c:set var="jobFamilys" value="${!empty param['jobFamily'] ? fn:split(fn:escapeXml(param['jobFamily']),',') : null}" />
<c:set var="typeOrganismes" value="${!empty param['typeOrganisme'] ? fn:split(fn:escapeXml(param['typeOrganisme']),',') : null}" />
<c:set var="contractTypes" value="${!empty param['contractType'] ? fn:split(fn:escapeXml(param['contractType']),',') : null}" />
<c:set var="classifications" value="${!empty param['classification'] ? fn:split(fn:escapeXml(param['classification']),',') : null}" />
<c:set var="regimes" value="${!empty param['regime'] ? fn:split(fn:escapeXml(param['regime']),',') : null}" />
<c:set var="regions" value="${!empty param['region'] ? fn:split(fn:escapeXml(param['region']),'[,]') : null}" />
<c:set var="oldRegions" value="${!empty param['region'] ? fn:split(fn:escapeXml(param['region']),'[-,]') : null}" />
<c:set var="keywords" value="${fn:escapeXml(param['keywords'])}" />

<c:set var="JOB_FAMILY_EXTERNE"><%=fr.lsr.jahia.modules.utils.Lov.JOB_FAMILY_EXTERNE%></c:set>
<c:set var="REGIME"><%=fr.lsr.jahia.modules.utils.Lov.REGIME%></c:set>
<c:set var="TYPE_ORGANISME"><%=fr.lsr.jahia.modules.utils.Lov.TYPE_ORGANISME%></c:set>
<c:set var="CLASSIFICATION"><%=fr.lsr.jahia.modules.utils.Lov.CLASSIFICATION%></c:set>
<c:set var="CONTRACT_TYPE"><%=fr.lsr.jahia.modules.utils.Lov.CONTRACT_TYPE%></c:set>

<section class="blocresultat-recherche">
	<div class="bloc-titre mrgrr">
		<h1>Résultats de recherche</h1>
	</div>
	<div class="table-wrap">
		<c:if test="${!empty jobFamilys or  !empty regimes or !empty typeOrganismes or !empty contractTypes or !empty regions or !empty keywords}">
			<div class="criteres">
				<h3>Critères de recherche</h3>
				<c:set var="criterias">
					<ul>
						<c:if test="${!empty regimes}">
							<li>
								<b> <fmt:message key="search.regime.label" /> :
								</b> ${fn:join(lsr:getLovById(REGIME,regimes), ', ')}
							</li>
						</c:if>
						<c:if test="${!empty typeOrganismes}">
							<li>
								<b> <fmt:message key="search.organization.label" /> :
								</b> ${fn:join(lsr:getLovById(TYPE_ORGANISME,typeOrganismes), ', ')}
							</li>
						</c:if>
						<c:if test="${!empty jobFamilys}">
							<li>
								<b> <fmt:message key="search.metier.label" /> :
								</b> ${fn:join(lsr:getLovById(JOB_FAMILY_EXTERNE,jobFamilys), ', ')}
							</li>
						</c:if>


						<c:if test="${!empty contractTypes}">
							<li>
								<b> <fmt:message key="search.contractType.label" /> :
								</b> ${fn:join(lsr:getLovById(CONTRACT_TYPE,contractTypes), ', ')}
							</li>
						</c:if>
						<c:if test="${!empty classifications}">
							<li>
								<b> <fmt:message key="search.classification.label" /> :
								</b> ${fn:join(lsr:getLovById(CLASSIFICATION,classifications), ', ')}
							</li>
						</c:if>
						<c:if test="${!empty regions}">
							<li>
								<b> <fmt:message key="search.region.label" /> :
								</b> ${fn:join(lsr:getRegionsByIds(regions), ', ')}
							</li>
						</c:if>
						<c:if test="${!empty keywords}">
							<li>
								<b> <fmt:message key="search.keyword.label" /> :
								</b> ${keywords}
							</li>
						</c:if>
					</ul>
				</c:set>${criterias}
			</div>
		</c:if>


		<%--calculer l'offset--%>
		<c:set var="pageSize" value="${!empty param['pageSize'] ?  param['pageSize'] : 10}" />
		<lsr:offsetPagination pageSize="${pageSize}" />
		<c:set var="searchResult" value="${lsr:getAdvertisements(keywords,jobFamilys,typeOrganismes,contractTypes,oldRegions,classifications,regimes, paginationMap.begin , pageSize)}" />

		<div class="nombredoffres row">
			<div class="col-lg-6 mrg20 nombreresultats">Offres correspondant à votre recherche : ${searchResult.key}</div>
			<div class="col-lg-6 mrg20 nombreaffiches">
				Nombre de résultats affichés

				<c:url value="${pageContext.request.requestURI}" context="/" var="pageUrl">
					<c:forEach var="originalParam" items="${param}">
						<c:if test="${originalParam.key ne 'pageSize'}">
							<c:param name="${originalParam.key}" value="${originalParam.value}" />
							<c:set var="hasParams" value="${true}" />
						</c:if>
					</c:forEach>
				</c:url>
				<select data-url="${pageUrl}${hasParams ? '&' : '?'}" class="selectpicker show-menu-arrow form-control" onchange="document.location.href=$(this).data('url') + 'pageSize='+ $(this).val();">
					<c:forTokens items="10,20,30,50" delims="," var="page">
						<option ${pageSize eq page ? "selected='selected'" : ""}>${page}</option>
 					</c:forTokens>
				</select>
			</div>
		</div>
		<div class="table-wrap">
			<c:if test="${!empty searchResult.value}">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>
								<fmt:message key="offer.offerTitle.label" />
							</th>
							<th>
								<fmt:message key="offer.city.label" />
							</th>
							<th>
								<fmt:message key="offer.organization.label" />
							</th>
							<th>
								<fmt:message key="offer.remuneration.label" />
							</th>
							<th>
								<fmt:message key="offer.qualification.label" />
							</th>
							<th>
								<fmt:message key="offer.contractType.label" />
							</th>
							<th>
								<fmt:message key="offer.publish.date.label" />
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${searchResult.value}" var="adv">
							<tr>
								<td>
									<a href="${pageFichePoste.node.url}?posteId=${adv.id}" role="link" title="${adv.title}" aria-label="${adv.title}">${adv.title}</a>
								</td>
								<td>${adv.city}</td>
								<td>${adv.organisme}</td>
								<td>${adv.compensation}</td>
								<td>${adv.niveau}</td>
								<td>${adv.contractType}</td>
								<td>
									<fmt:formatDate value="${adv.postingEndDate}" pattern="dd/MM/yyyy" />
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty searchResult.value}">
				<div class="aucune">Aucune offre ne correspond à vos critères</div>
			</c:if>
			<div class="clearfix"></div>
			<div class="row ">
				<div class="col-lg-12">
					<a class="bt" href="${pageRechercheSession}">Nouvelle recherche</a>
					<button type="button" class="bt blanc" data-toggle="modal" data-target="#modalAlerte">Créer une alerte mail</button>
				</div>
			</div>
		</div>
	</div>
</section>

<%--Display Pagination--%>
<lsr:showPagination count="${searchResult.key}" pageSize="${pageSize}" />

<%-- set la query string en session --%>
<c:set var="searchQuerySession" value="${pageContext.request.queryString}" scope="session" />

<!-- POPIN Creation d'alerte-->
<div class="modal fade" id="modalAlerte" tabindex="-1" role="dialog" aria-labelledby="modalAlerteLabel">
	<div class="modal-dialog" role="document">
		<form id="createAlerteForm" data-query="${searchQuerySession}" action="<c:url value='${url.base}${currentNode.path}'/>.createAlerteAction.do">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">
						<b>Créer une alerte mail</b>
					</h4>
				</div>
				<div class="modal-body">
					<div class="criteres">
						<h3>Critères de recherche :</h3>
						<c:choose>
							<c:when test="${!empty criterias}">
								<ul>${criterias}
								</ul>
							</c:when>
							<c:otherwise>
							Aucun critére n'est sélectionné 
							</c:otherwise>
						</c:choose>
					</div>
					<div>
						<label class="titre" for="email">E-mail:</label>
						<input type="text" style="width: 100%; height: 30px;" placeholder="Entrez votre email" name="email">
					</div>
					<div>
						<label class="titre" for="vDeliveryFrequency">Recevoir les offres :</label> <label class="iptlabel"> <input type="radio" name="frequency" value="ONCE_A_DAY" id="vDeliveryFrequency1">
							Une fois par jour
						</label> <label class="iptlabel"> <input type="radio" name="frequency" value="ONCE_A_WEEK" id="vDeliveryFrequency7"> Une fois par semaine
						</label>
					</div>
					<div>
						<label class="titre" for="expiration">Validité de l'agent de recherche :</label> <label class="iptlabel"> <input type="radio" name="expiration" value="15" id="expiration15"> 2
							semaines
						</label> <label class="iptlabel"> <input type="radio" name="expiration" value="30" id="expiration30"> 1 mois
						</label> <label class="iptlabel"> <input type="radio" name="expiration" value="90" id="expiration90"> 3 mois
						</label> <label class="iptlabel"> <input type="radio" name="expiration" value="180" id="expiration180"> 6 mois
						</label>
					</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary">Confirmer</button>
				</div>
			</div>
		</form>
	</div>
</div>