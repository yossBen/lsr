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
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<c:set var="currentPage" value="${jcr:getParentOfType(currentNode,'jnt:page' )}" />
<c:set var="parentPage" value="${jcr:getParentOfType(currentPage,'jnt:page' )}" />
<c:set var="allMetierPages" value="${jcr:getNodes(parentPage,'jnt:page')}" />
<c:set var="links" value="${lsr:getLinksCarousel(currentPage)}" />

<jcr:nodeProperty var="titre" node="${currentNode.parent}" name="jcr:title" />
<jcr:nodeProperty var="image" node="${currentNode.parent}" name="image" />
<c:url value="${image.node.url}" var="imageUrl" />

<div class="metier-carousel">
	<c:if test="${!empty links.key}">
	    <template:addCacheDependency node="${links.key}" />
		<a href="${links.key.url}" class="fleche gauche" title="${links.key.properties['jcr:title'].string}" data-toggle="tooltip" data-placement="top" role="link"> </a>
	</c:if>
	<span> ${titre} </span>
	<div class="image" style="background-image: url('${imageUrl}');"></div>
	<c:if test="${!empty links.value}">
	    <template:addCacheDependency node="${links.value}" />
		<a href="${links.value.url}" class="fleche droite" title="${links.value.properties['jcr:title'].string}" data-toggle="tooltip" data-placement="top" role="link"> </a>
	</c:if>
	<div class="bubble">
		<ul>
			<c:forEach items="${allMetierPages}" var="page">
				<c:set var="classActive" value="" />
				<c:if test="${page.identifier eq currentPage.identifier}">
					<c:set var="classActive" value="class='active'" />
				</c:if>

				<c:forEach items="${jcr:getDescendantNodes(page,'lnt:famillemetier')}" var="famille" begin="0" end="0" />

				<li ${classActive}>
				    <template:addCacheDependency node="${famille}" />
					<a href="${page.url}" title="${famille.properties['jcr:title'].string}" data-toggle="tooltip" data-placement="top" role="link" aria-label="${famille.properties['jcr:title'].string}"> </a>
				</li>
			</c:forEach>
		</ul>
	</div>
</div>