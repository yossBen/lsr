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

<section class="bloc-article">
	<div class="bloc-titre">
		<h1>${titre.string}</h1>
		<div class="date">
			<fmt:formatDate value="${lastPublished.time}" pattern="dd MMMMMMMMMM yyyy" />
		</div>
		<div class="bloc-une">
			<div class="col-une contenu">
				<div class="contenu-art">
					<img src="${image.node.url}" width="400" alt="${titre.string}" align="left" />
					${chapeau.string} ${corps.string}
				</div>
			</div>
		</div>
	</div>
</section>