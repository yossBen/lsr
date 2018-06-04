<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<c:if test="${empty param['p']}">
	<jcr:nodeProperty node="${currentNode}" name="actu" var="actuPage" />
	<c:choose>
		<c:when test="${!empty actuPage and !empty actuPage.node}">
			<c:set var="nodes" value="${jcr:getDescendantNodes(actuPage.node,'lnt:actu')}" />
		</c:when>
		<c:otherwise>
			<jcr:sql var="query" sql="select * from [lnt:actu] where isdescendantnode('${currentNode.resolveSite.path}')   order by [j:lastPublished] desc" limit="1" />
			<c:set var="nodes" value="${query.nodes}" />
		</c:otherwise>
	</c:choose>

	<c:if test="${!empty nodes}">
		<c:forEach items="${nodes}" var="item" begin="0" end="0">
			<c:set var="actuAlaune" value="${item}" />
		</c:forEach>
		<template:module node="${actuAlaune}" view="alaune" editable="false" />
	</c:if>
</c:if>
