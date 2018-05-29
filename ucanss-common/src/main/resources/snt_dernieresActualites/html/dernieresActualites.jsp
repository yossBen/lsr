<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>

<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="titre" />
<jcr:nodeProperty node="${currentNode}" name="nombre" var="max" />
<jcr:nodeProperty node="${currentNode}" name="pageToutesActus" var="pageToutesActus" />

<section class="bloc-actualites" role="contentinfo" aria-label="Actualités">
	<h2 class="bloc-titre">${titre.string}</h2>
	<div class="actualites">
		<jcr:sql var="query" sql="select * from [snt:actualite] where isdescendantnode('${currentNode.resolveSite.path}') order by [j:lastPublished] desc" limit="${max.long}" />
		<c:forEach items="${query.nodes}" var="item">
			<template:module node="${item}" view="remontee" editable="false" />
		</c:forEach>
	</div>
	<div class="touteslesactus">
		<a href="${url.server}${pageToutesActus.node.url}" class="bttoutes" role="link" aria-label="Voir toutes les actualités">Voir toutes les actualités</a>
	</div>
</section>