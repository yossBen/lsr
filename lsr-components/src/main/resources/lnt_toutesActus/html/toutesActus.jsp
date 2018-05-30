<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>

<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="titre" />
<jcr:nodeProperty node="${currentNode}" name="nombre" var="nombre" />
<jcr:nodeProperty node="${currentNode}" name="pageToutesActus" var="pageToutesActus" />

<%--calculer l'offset et mettre le size en session--%>
<lsr:offsetPagination pageSize="${nombre.long}" />
<%--Rechercher le contenu--%>
<jcr:sql var="query" sql="select * from [lnt:actu] where isdescendantnode('${currentNode.resolveSite.path}') order by [j:lastPublished] desc" limit="${paginationMap.limit}"
	offset="${paginationMap.offset}" />

<section class="bloc-actualites" role="contentinfo" aria-label="Actualités">
	<h2 class="bloc-titre">${titre.string}</h2>
	<div class="actualites">
		<c:forEach items="${query.nodes}" var="item" begin="${paginationMap.begin}" end="${paginationMap.end}">
			<template:module node="${item}" view="remontee" editable="false" />
		</c:forEach>
	</div>

	<lsr:showPagination count="${query.nodes.size}" pageSize="${nombre.long}" />
</section>