<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>

<template:include view="hidden.header" />

<c:set var="corps" value="${functions:removeHtmlTags(corps.string)}" />
<section class="bloc-a-la-une">
	<div class="bloc-titre">A la une</div>
	<div class="bloc-une">
		<div class="col-une">
			<img src="${image.node.url}" width="400" alt="${titre.string}" align="left" />
		</div>
		<div class="col-une contenu">
			<h1>${titre.string}</h1>
			<div class="date">
				<fmt:formatDate value="${lastPublished.time}" pattern="dd MMMMMMMMMM yyyy" />
			</div>

			<div class="contenu-art">${chapeau.string}${functions:abbreviate(corps ,500,-1,'...')}</div>
			<a href="${currentPage.url}" class="lire" role="link" title="${titre.string}">Lire l'article</a>
		</div>
	</div>
</section>
