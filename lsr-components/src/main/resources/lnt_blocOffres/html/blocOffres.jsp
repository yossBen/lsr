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

<template:addResources type="javascript" resources="jquery.validate.js" />
<template:addResources type="javascript" resources="lst-components.js" />

<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageFichePoste" var="pageFichePoste" />
<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageResultat" var="pageResultat" />
<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="title" />
<jcr:nodeProperty node="${currentNode}" name="nombre" var="nombre" />

<c:set var="nombre" value="${!empty nombre ? nombre.long : 4  }" />
<c:set var="classCol" value="${nombre mod 4 == 0 ?  'col-lg-3' : 'col-lg-4'}" />

<c:set var="searchResult" value="${lsr:getAdvertisements(null,null,null,null,null,null,0,nombre)}" />
<section class="bloc-offres" role="contentinfo" aria-label="Consultez les dernières offres">
	<h2 class="bloc-titre">${title.string}</h2>
	<c:forEach items="${searchResult.value}" var="adv">
		<c:set var="description" value="${!empty adv.customFields[1].value ? adv.customFields[1].value  : adv.customFields[0].value}" />
		<c:set var="description" value="${functions:removeHtmlTags(description)}" />
		<c:set var="description" value="${functions:abbreviate(description ,150,-1,'...')}" />
		<div class="offre ${classCol} col-md-6 col-xs-12">
			<div class="recruteur">${adv.organisme}</div>
			<div class="titreoffre">${adv.title}</div>
			<div class="extrait">${description}</div>
			<div class="ensavoirplus">
				<a href="${pageFichePoste.node.url}?posteId=${adv.id}" role="link" aria-label="Lire le descriptif de l'offre - ${fn:escapeXml(adv.title)}">Lire le descriptif</a>
			</div>

			<template:include view="hidden.social">
				<template:param name="posteId" value="${adv.id}" />
				<template:param name="posteTitle" value="${adv.title}" />
			</template:include>

			<div class="bloc-social">
				<ul class="iconsocial">
					<li>
						<a href="javascript:void(0);" data-shareurl="${twitterShareUrl}" onclick="window.open($(this).data('shareurl'), '_blank')" title="${adv.title}" rel="nofollow">
							<i class="fa fa-twitter"></i>
						</a>
					</li>
					<li class="btin"></li>
					<li>
						<a href="javascript:void(0);" data-shareurl="${facebookShareUrl}" onclick="window.open($(this).data('shareurl'), '_blank')" title="${adv.title}" rel="nofollow">
							<i class="fa fa-facebook"></i>
						</a>
					</li>
					<li>
						<a href="javascript:void(0);" data-shareurl="${linkedinShareUrl}" onclick="window.open($(this).data('shareurl'), '_blank')" title="${adv.title}" rel="nofollow">
							<i class="fa fa-linkedin"></i>
						</a>
					</li>
					<li onclick="changeOfferUrl('<c:url value="${url.server}${pageFichePoste.node.url}" />?posteId=${adv.id}');">
						<a href="javascript:void(0);" data-toggle="modal" data-target="#modalSendMail">
							<i class="fa fa-envelope"></i>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</c:forEach>
	<div class="col-lg-12 touteslesoffres">
		<a href="${pageResultat.node.url}" class="btoffres" role="link" aria-label="Voir toutes les offres">Voir toutes les offres</a>
	</div>
</section>
<%@include file="../../common/popin.jsp"%>