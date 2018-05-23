<%@include file="../../common/declarations.jspf"%>

<c:set var="currentPage" value="${renderContext.mainResource.node}" />
<c:set var="homeUrl" value="${renderContext.site.home.url}" />
<jcr:nodeProperty node="${currentNode}" name="imagesHome" var="imagesHome" />
<jcr:nodeProperty node="${currentNode}" name="imagesSite" var="imagesSite" />
<jcr:nodeProperty node="${currentPage}" name="jcr:title" var="pageTitle" />
<jcr:nodeProperty node="${currentPage}" name="j:isHomePage" var="isHomePage" />

<div class="logomobile">
	<a href="${homeUrl}">
		<img src="/modules/lsr-template/images/logos/logo-secu-mobile.svg" class="logosecumobile" alt="Logo LaSecuRecrute Mobile">
	</a>
	<div id="btmobil" class="btmobile"></div>
</div>

<c:if test="${isHomePage.boolean}">
	<div class="bloc">
		<div class="bloc-gauche"></div>
		<div class="bloc-droit">
			<a href="${homeUrl}">
				<img src="/modules/lsr-template/images/logos/logo-secu.svg" class="logosecu" alt="Logo LaSecuRecrute Desktop">
			</a>
			<template:module path="nombreOffres" />
		</div>
	</div>
	<img src="${imagesHome[lsr:randomInt(fn:length(imagesHome))].node.url}" alt="Image ${pageTitle.string}">
</c:if>
<c:if test="${!isHomePage.boolean}">
	<a href="${homeUrl}">
		<div class="image">
			<img src="${imagesSite[lsr:randomInt(fn:length(imagesSite))].node.url}" alt="Image ${pageTitle.string}">
		</div>
		<div class="bloc">
			<div class="bloc-gauche"></div>
			<div class="bloc-droit">
				<img src="/modules/lsr-template/images/logos/logo-secu.svg" class="logosecu" alt="Logo LaSecuRecrute Desktop">
			</div>
		</div>
	</a>
</c:if>