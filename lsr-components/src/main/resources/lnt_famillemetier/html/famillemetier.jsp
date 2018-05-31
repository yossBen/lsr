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
<jcr:nodeProperty var="image" node="${currentNode}" name="image" />
<jcr:nodeProperty var="texte" node="${currentNode}" name="texte" />


<section class="blocfiche-metier">

	<template:module path="metiercaroussel" />

	<div class="bloc-titre">${titre}</div>

	<div class="bloccontenu">
		<p>${texte}</p>
	</div>

	<div class="infobloc-metiers" role="contentinfo" aria-label="${titre}">

		<button class="btn btn-primary titrebloc" type="button"
			data-toggle="collapse" data-target="#collapseExample"
			aria-expanded="false" aria-controls="collapseExample">${titre}</button>

		<jcr:sql var="query" sql="select * from [lnt:metier] as metiers where ISDESCENDANTNODE(metiers,'${currentNode.path}') " />


		<div class="collapse" id="collapseExample">
			<div class="blocselect">
				<ul>
					<c:forEach items="${query.nodes}" var="node">
						<li>${node.properties['jcr:title'].string}</li>
					</c:forEach>
					<c:if test="${renderContext.editMode}">
						<template:module path="*" nodeTypes="lnt:metier" />
					</c:if>
				</ul>
			</div>
			<div class="select-contenu">
					<c:forEach items="${query.nodes}" var="node" >
						<template:module path="${node}"/>
					</c:forEach>
					<c:if test="${renderContext.editMode}">
						<template:module path="*" nodeTypes="lnt:metier" />
					</c:if>
			</div>
		</div>
	</div>
</section>

<section class="bloc-metiers" role="contentinfo">

	<template:module path="blocmetiers" />

</section>
