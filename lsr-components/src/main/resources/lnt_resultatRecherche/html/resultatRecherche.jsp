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

<c:set var="jobFamilys" value="${fn:split(fn:escapeXml(param['jobFamily']),',')}" />
<c:set var="typeOrganismes" value="${fn:split(fn:escapeXml(param['typeOrganisme']),',')}" />
<c:set var="contractTypes" value="${fn:split(fn:escapeXml(param['contractType']),',')}" />
<c:set var="classifications" value="${fn:split(fn:escapeXml(param['classification']),',')}" />
<c:set var="regimes" value="${fn:split(fn:escapeXml(param['regime']),',')}" />
<c:set var="regions" value="${fn:split(fn:escapeXml(param['region']),'[,-]')}" />
<c:set var="keywords" value="${fn:escapeXml(param['keywords'])}" />

<%--calculer l'offset--%>
<c:set var="pageSize" value="10" />
<lsr:offsetPagination pageSize="${pageSize}" />
<c:set var="searchResult" value="${lsr:getAdvertisements(keywords,jobFamilys,typeOrganismes,contractTypes,regions,classifications,regimes, paginationMap.begin , pageSize)}" />

<c:if test="${!empty searchResult}">
	<div class="row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<p style="font-size: 19px;">
				<strong style="color: #00aed6;">${searchResult.key}</strong>
				résultats pour votre recherche
			</p>
			<div class="bd-example">
				<table class="table table-striped table-bordered">
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
			</div>
		</div>
	</div>
</c:if>
<%--Display Pagination--%>
<lsr:showPagination count="${searchResult.key}" pageSize="${pageSize}" />