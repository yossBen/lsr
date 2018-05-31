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
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<jcr:nodeProperty var="titre" node="${currentNode}" name="jcr:title" />

<h2>${titre}</h2>
<div class="contenu">
	<div class="colcontenu">
		<c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:sousblocmetiergauche')}"
			var="child">
			<template:module path="${child.path}" editable="true" />
		</c:forEach>
		<c:if test="${renderContext.editMode}">
			<template:module path="*" nodeTypes="lnt:sousblocmetiergauche" />
		</c:if>

	</div>
	<div class="colcontenu">
		<c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:sousblocmetierdroite')}"
			var="child">
			<template:module path="${child.path}" editable="true" />
		</c:forEach>
		<c:if test="${renderContext.editMode}">
			<template:module path="*" nodeTypes="lnt:sousblocmetierdroite" />
		</c:if>

		<ul class="lienensavoir">
			<li class="video"><a>voir la vidéo métier</a></li>
			<li class="telecharger"><a>télécharger la fiche</a></li>
		</ul>

	</div>
</div>