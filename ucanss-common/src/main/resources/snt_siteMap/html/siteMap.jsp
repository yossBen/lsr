<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="ui" uri="http://www.jahia.org/tags/uiComponentsLib"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<%@ taglib prefix="query" uri="http://www.jahia.org/tags/queryLib"%>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib"%>
<%@ taglib prefix="s" uri="http://www.jahia.org/tags/search"%>

<section class="bloc-contenu-page">
	<h1>
		<jcr:nodeProperty node="${currentNode}" name="jcr:title" />
	</h1>
</section>

<c:set var="homePage" value="${renderContext.mainResource.node.resolveSite.home}" />
<c:set var="pages" value="${jcr:getChildrenOfType(homePage, 'jnt:page')}" />
<c:forEach items="${pages}" var="page">
	<template:module path="${page.path}" editable="false" view="hidden.sitemap">
		<template:param name="level" value="1" />
	</template:module>
</c:forEach>