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

<jcr:nodeProperty node="${currentNode}" name="showInXml" var="showInXml" />
<jcr:nodeProperty node="${currentNode}" name="showInSite" var="showInSite" />
<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="title" />

<li>
	<h2>${title.string}</h2>
</li>
<c:set var="pages" value="${jcr:getChildrenOfType(currentNode, 'jnt:page')}" />
<%-- 	<c:if test="${renderContext.editMode || showInSite.boolean}">
		<li>
			<div class="titre">
				<h3 style="display: inline-block;">
					<a href="${currentNode.url}" title="${fn:escapeXml(currentNode.properties['jcr:title'].string)}">${currentNode.properties['jcr:title'].string}</a>
				</h3>
				<c:if test="${renderContext.editMode}">
					<c:url value='${url.base}${currentNode.path}' var="postUrl" />
					<form id="form-${currentNode.identifier}" style="display: inline; float: right;" action="${postUrl}" method="post">
						<input type="hidden" name="jcrMethodToCall" value="put" />
						<input type="hidden" name="jcr:mixinTypes" value="cmix:sitemap" />
						<label for="showInSite-${currentNode.identifier}" style="margin-left: 20px; margin-right: 10px; display: inline-block;"> <input type="checkbox"
								name="showInSite-${currentNode.identifier}" id="showInSite-${currentNode.identifier}" onclick="updatePageSitemap($(this),'${currentNode.identifier}'); return true;"
								<c:if test="${showInSite.boolean}">checked="checked"</c:if> /> Faire apparaitre dans le plan du site
						</label> <label for="showInXml-${currentNode.identifier}" style="margin-left: 20px; margin-right: 10px; display: inline-block;"> <input type="checkbox" name="showInXml-${currentNode.identifier}"
								id="showInXml-${currentNode.identifier}" onclick="updatePageSitemap($(this),'${currentNode.identifier}'); return true;" <c:if test="${showInXml.boolean}">checked="checked"</c:if> /> Faire
							apparaitre dans le sitemap.xml
						</label>
					</form>
				</c:if>
			</div>
		</li>
	</c:if>
--%>

<c:if test="${fn:length(pages) > 0}">
	<ul>
		<c:forEach items="${pages}" var="page">
			<li>
				<template:module path="${page.path}" editable="false" view="hidden.sitemap">
					<template:param name="level" value="${level +1}" />
				</template:module>
			</li>
		</c:forEach>
	</ul>
</c:if>