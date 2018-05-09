<%@ tag description="Display pagination after call to initPager tag."%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>

<%@ attribute name="id" required="false" type="java.lang.String" description="id de la Pagination"%>
<%@ attribute name="count" required="true" type="java.lang.Integer" description="nombre total d'elements"%>
<%@ attribute name="pageSize" required="true" type="java.lang.Integer" description="nombre d'elements par page"%>
<%@ attribute name="maxPages" required="false" type="java.lang.Integer" description="Max de pages a afficher"%>

<%--init Pagination--%>
<lsr:initPagination count="${count}" countSessionAttr="${paginationMap.countSessionAttr}" pageSize="${pageSize}" maxPages="${maxPages}" />

<%--Affichage de la pagination--%>
<c:if test="${paginationMap.nbOfPages > 1}">
	<%--URLS --%>
	<c:set var="pageUrl">${pageContext.request.requestURI}</c:set>

	<c:url value="${pageUrl}" context="/" var="previousUrl">
		<c:forEach var="originalParam" items="${param}">
			<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
				<c:param name="${originalParam.key}" value="${originalParam.value}" />
			</c:if>
		</c:forEach>
		<c:param name="${paginationMap.PARAMS_PAGINATION}" value="${paginationMap.selectedPage-1}" />
	</c:url>
	
	<c:url value="${pageUrl}" context="/" var="goToFirstUrl">
		<c:forEach var="originalParam" items="${param}">
			<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
				<c:param name="${originalParam.key}" value="${originalParam.value}" />
			</c:if>
		</c:forEach>
	</c:url>
	<c:url value="${pageUrl}" context="/" var="nextUrl">
		<c:forEach var="originalParam" items="${param}">
			<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
				<c:param name="${originalParam.key}" value="${originalParam.value}" />
			</c:if>
		</c:forEach>
		<c:param name="${paginationMap.PARAMS_PAGINATION}" value="${paginationMap.selectedPage+1}" />
	</c:url>
	<c:url value="${pageUrl}" context="/" var="goToLastUrl">
		<c:forEach var="originalParam" items="${param}">
			<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
				<c:param name="${originalParam.key}" value="${originalParam.value}" />
			</c:if>
		</c:forEach>
		<c:param name="${paginationMap.PARAMS_PAGINATION}" value="${paginationMap.nbOfPages}" />
	</c:url>

	<div class="pagination" style="">
		<ul>
			<c:if test="${paginationMap.selectedPage > 1}">
				<li>
					<a href="${goToFirstUrl}"> |&lt; </a>
				</li>
				<li>
					<a href="${previousUrl}"> &lt; </a>
				</li>
			</c:if>
			<c:forEach items="${paginationMap.pagesList}" var="p">
				<c:choose>
					<c:when test="${p eq paginationMap.selectedPage}">
						<li class="active">${p}</li>
					</c:when>
					<c:otherwise>
						<c:url value="${pageUrl}" context="/" var="fullUrl">
							<c:if test="${p ne 1}">
								<c:param name="${paginationMap.PARAMS_PAGINATION}" value="${p}" />
							</c:if>
							<c:forEach var="originalParam" items="${param}">
								<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
									<c:param name="${originalParam.key}" value="${originalParam.value}" />
								</c:if>
							</c:forEach>
						</c:url>
						<li>
							<a href="${fullUrl}"> ${p} </a>
						</li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<li class="sur">sur</li>
			<c:choose>
				<c:when test="${paginationMap.nbOfPages eq paginationMap.selectedPage}">
					<li class="active">${paginationMap.nbOfPages}</li>
				</c:when>
				<c:otherwise>
					<c:url value="${pageUrl}" context="/" var="fullUrl">
						<c:forEach var="originalParam" items="${param}">
							<c:if test="${originalParam.key ne paginationMap.PARAMS_PAGINATION}">
								<c:param name="${originalParam.key}" value="${originalParam.value}" />
							</c:if>
						</c:forEach>
						<c:param name="${paginationMap.PARAMS_PAGINATION}" value="${paginationMap.nbOfPages}" />
					</c:url>
					<li>
						<a href="${fullUrl}"> ${paginationMap.nbOfPages} </a>
					</li>
				</c:otherwise>
			</c:choose>
			<c:if test="${paginationMap.selectedPage < paginationMap.nbOfPages}">
				<li>
					<a href="${nextUrl}"> &gt; </a>
				</li>
				<li>
					<a href="${goToLastUrl}"> &gt;| </a>
				</li>
			</c:if>
		</ul>
	</div>
	<%--SEO balise prev et next--%>
	<template:addResources>
		<c:if test="${paginationMap.selectedPage > 1}">
			<link rel="prev" href="${url.server}${previousUrl}">
		</c:if>
		<c:if test="${paginationMap.selectedPage < paginationMap.nbOfPages}">
			<link rel="next" href="${url.server}${nextUrl}">
		</c:if>
	</template:addResources>
</c:if>
