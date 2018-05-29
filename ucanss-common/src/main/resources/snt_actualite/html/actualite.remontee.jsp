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
<article class="actu" role="article">
	<a href="${currentPage.url}" role="link" title="${titre.string}">
		<div class="image" style="background-image:url('${image.node.url}');"></div>
		<div class="contenu">
			<div class="date-contenu">
				<fmt:formatDate value="${lastPublished.time}" pattern="dd MMMMMMMMMM yyyy" />
			</div>
			<h3>${titre.string}</h3>
			<div class="desc">${functions:removeHtmlTags(chapeau.string)}</div>
			<%-- <span>Lire l'article</span> --%>
		</div>
	</a>
</article>