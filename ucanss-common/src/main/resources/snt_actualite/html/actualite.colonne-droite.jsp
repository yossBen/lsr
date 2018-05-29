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
<section class="bloc-actualites" role="article">
	<h2 class="bloc-titre">${titre.string}</h2>
	<div class="actualites">
		<article class="actu" role="article">
			<a href="${currentPage.url}" role="link" title="">
				<div class="image" style="background-image:url('${image.node.url}');"></div>
				<div class="contenu">
					<div class="date-contenu">
						<fmt:formatDate value="${lastPublished.time}" pattern="dd MMMMMMMMMM yyyy" />
					</div>
					<h3>${titre.string}</h3>
					<div class="desc">${functions:removeHtmlTags(chapeau.string)}</div>
				</div>
			</a>
		</article>
	</div>
	<div class="touteslesactus">
		<a href="" class="bttoutes" role="link" aria-label="Voir toutes les actualités">Voir toutes les actualités</a>
	</div>
</section>