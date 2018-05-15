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

<c:set var="jobFamilys" value="${!empty param['jobFamily'] ? fn:split(fn:escapeXml(param['jobFamily']),',') : null}" />
<c:set var="typeOrganismes" value="${!empty param['typeOrganisme'] ? fn:split(fn:escapeXml(param['typeOrganisme']),',') : null}" />
<c:set var="contractTypes" value="${!empty param['contractType'] ? fn:split(fn:escapeXml(param['contractType']),',') : null}" />
<c:set var="classifications" value="${!empty param['classification'] ? fn:split(fn:escapeXml(param['classification']),',') : null}" />
<c:set var="regimes" value="${!empty param['regime'] ? fn:split(fn:escapeXml(param['regime']),',') : null}" />
<c:set var="regions" value="${!empty param['region'] ? fn:split(fn:escapeXml(param['region']),',') : null}" />
<c:set var="keywords" value="${fn:escapeXml(param['keywords'])}" />
<%--calculer l'offset--%>
<c:set var="pageSize" value="10" />
<lsr:offsetPagination pageSize="${pageSize}" />
<c:set var="searchResult" value="${lsr:getAdvertisements(jobFamilys,typeOrganismes,contractTypes,regions,classifications,regimes, paginationMap.begin , pageSize)}" />

<c:set var="JOB_FAMILY"><%=fr.lsr.jahia.modules.utils.Lov.JOB_FAMILY%></c:set>
<c:set var="REGIME"><%=fr.lsr.jahia.modules.utils.Lov.REGIME%></c:set>
<c:set var="TYPE_ORGANISME"><%=fr.lsr.jahia.modules.utils.Lov.TYPE_ORGANISME%></c:set>
<c:set var="CLASSIFICATION"><%=fr.lsr.jahia.modules.utils.Lov.CLASSIFICATION%></c:set>
<c:set var="CONTRACT_TYPE"><%=fr.lsr.jahia.modules.utils.Lov.CONTRACT_TYPE%></c:set>

<section class="blocresultat-recherche">
	<div class="bloc-titre mrgrr">
		<h1>Résultats de recherche</h1>
	</div>
	<div class="table-wrap">
		<c:if test="${!empty regimes or !empty typeOrganismes or !empty contractTypes or !empty regions or !empty keywords}">
			<div class="criteres">
				<h3>Critères de recherche</h3>
				<ul>
					<c:if test="${!empty regimes}">
						<li>
							<b>Régime :</b>
							${fn:join(lsr:getLovById(REGIME,regimes), ', ')}
						</li>
					</c:if>
					<c:if test="${!empty typeOrganismes}">
						<li>
							<b>Organisme :</b>
							${fn:join(lsr:getLovById(TYPE_ORGANISME,typeOrganismes), ', ')}
						</li>
					</c:if>
					<c:if test="${!empty contractTypes}">
						<li>
							<b>Type de contrat :</b>
							${fn:join(lsr:getLovById(CONTRACT_TYPE,contractTypes), ', ')}
						</li>
					</c:if>
					<c:if test="${!empty classifications}">
						<li>
							<b>Grille de classification :</b>
							${fn:join(lsr:getLovById(CLASSIFICATION,classifications), ', ')}
						</li>
					</c:if>
					<c:if test="${!empty regions}">
						<li>
							<b>Région :</b>
							${fn:join(lsr:getRegionsByIds(regions), ', ')}
						</li>
					</c:if>
					<c:if test="${!empty keywords}">
						<li>
							<b>Mots clés :</b>
							${keywords}
						</li>
					</c:if>
				</ul>
			</div>
		</c:if>
	</div>
	<div class="nombredoffres row">
		<div class="col-lg-6 mrg20 nombreresultats">Offres correspondant à votre recherche : ${searchResult.key}</div>
		<!-- 			<div class="col-lg-6 mrg20 nombreaffiches">
					Nombre de résultats affichés
					<select aria-labelledby="" class="selectpicker show-menu-arrow form-control">
						<option>10</option>
						<option>15</option>
						<option>20</option>
						<option>50</option>
					</select>
				</div> -->
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
								<a href="${pageFichePoste.node.url}?posteId=${adv.id}" role="link" aria-label="${adv.title}">${adv.title}</a>
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
				<!-- 				<button type="button" class="bt">Nouvelle recherche</button>
 -->
			</div>
		</div>
	</div>
</section>
<%--Display Pagination--%>
<lsr:showPagination count="${searchResult.key}" pageSize="${pageSize}" />
<c:set var="searchQuerySession" value="${pageContext.request.queryString}" scope="session" />