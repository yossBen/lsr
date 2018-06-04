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
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<jcr:nodeProperty var="titre" node="${currentNode.parent}" name="jcr:title" />
<jcr:nodeProperty var="image" node="${currentNode.parent}" name="image" />
<c:url value="${image.node.url}" var="imageUrl"></c:url>

<div class="metier-carousel">

	<a href="" class="fleche gauche"
		title="${titre}"
		data-toggle="tooltip" data-placement="top" role="link"
		aria-label="${titre}">
	</a> 
	
	<span>
		${titre}
	</span>
	<div class="image" style="background-image: url('${imageUrl}');">
	</div>
	
	<a href="" class="fleche droite" title="${titre}"
		data-toggle="tooltip" data-placement="top" role="link"
		aria-label="${titre}">
	</a>
	
	<div class="bubble">
		<ul>
			<jcr:sql var="query" sql="select * from [lnt:famillemetier] " />

			<c:forEach items="${query.nodes}" var="node">		
				<c:choose>	
					<c:when test="${node == currentNode.parent}">
						<li class="active"><a href="${node.properties['link'].node.url}"
							title="${node.properties['jcr:title'].string}"
							data-toggle="tooltip" data-placement="top" role="link"
							aria-label="${node.properties['jcr:title'].string}"> </a>
						</li>
					</c:when>
					<c:otherwise>
						<li><a href="${node.properties['link'].node.url}" title="${node.properties['jcr:title'].string}"
							data-toggle="tooltip" data-placement="top" role="link"
							aria-label="${node.properties['jcr:title'].string}"></a>
						</li>
					</c:otherwise>
				</c:choose>

			</c:forEach>
		</ul>
	</div>
</div>