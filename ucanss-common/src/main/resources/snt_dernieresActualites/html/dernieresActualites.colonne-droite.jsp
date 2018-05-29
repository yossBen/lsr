<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>

<jcr:nodeProperty node="${currentNode}" name="nombre" var="max" />
<jcr:nodeProperty node="${currentNode}" name="pageToutesActus" var="pageToutesActus" />

<section class="bloc-actualites" role="contentinfo" aria-label="Actualités">
	<h2 class="bloc-titre">${titre}</h2>
	<div class="actualites">
		<jcr:sql var="query11" sql="select * from [lnt:actualite] where isdescendantnode('${currentNode.resolveSite.path}') and tagUne = 'true' order by [datePublication] desc" limit="1" />
		<c:choose>
			<c:when test="${functions:length(query.nodes)==1}">
				<c:forEach items="${query11.nodes}" var="node">
					<jcr:nodeProperty node="${node}" name="jcr:title" var="titre" />
					<jcr:nodeProperty node="${node}" name="image" var="image" />
					<jcr:nodeProperty node="${node}" name="chapeau" var="chapeau" />
					<article class="actu" role="article">
						<a href="${url.base}${node.parent.parent.path}/article.html?articleId=${node.identifier}" role="link" title="">
							<div class="image" style="background-image:url('${image.node.url}');"></div>
							<div class="contenu">
								<h3>${titre.string}</h3>
								<div class="desc">${chapeau.string}</div>
								<span>Lire l’article</span>
							</div>
						</a>
					</article>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<jcr:sql var="query22" sql="select * from [lnt:actualite] where isdescendantnode('${currentNode.resolveSite.path}') order by [datePublication] desc" limit="${max.long}" />
				<c:forEach items="${query22.nodes}" var="node">
					<jcr:nodeProperty node="${node}" name="jcr:title" var="titre" />
					<jcr:nodeProperty node="${node}" name="image" var="image" />
					<jcr:nodeProperty node="${node}" name="chapeau" var="chapeau" />
					<article class="actu" role="article">
						<a href="${url.base}${node.parent.parent.path}/article.html?articleId=${node.identifier}" role="link" title="">
							<div class="image" style="background-image:url('${image.node.url}');"></div>
							<div class="contenu">
								<h3>${titre.string}</h3>
								<div class="desc">${chapeau.string}</div>
								<span>Lire l’article</span>
							</div>
						</a>
					</article>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<c:if test="${renderContext.editMode}">
			<template:module path="*" nodeTypes="lnt:actualite" />
		</c:if>
	</div>
	<div class="touteslesactus">
		<a href="${url.server}${pageToutesActus.node.url}" class="bttoutes" role="link" aria-label="Voir toutes les actualités">Voir toutes les actualités</a>
	</div>
</section>