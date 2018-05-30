<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<jcr:nodeProperty node="${currentNode}" name="displayHome" var="displayHome" />
<jcr:nodeProperty node="${currentNode}" name="displayCurrentPage" var="displayCurrentPage" />
<jcr:nodeProperty node="${currentNode}" name="displayLinkOnCurrentPage" var="displayLinkOnCurrentPage" />
<jcr:nodeProperty node="${currentNode}" name="displayOnFirstLevel" var="displayOnFirstLevel" />
<c:set var="pageNodes" value="${jcr:getMeAndParentsOfType(renderContext.mainResource.node, 'jnt:page')}" />
<c:if test="${displayOnFirstLevel.boolean || fn:length(pageNodes) > 1}">
	<section class="bloc-fildariane">
		<ul class="fildariance">
			<c:forEach items="${functions:reverse(pageNodes)}" var="pageNode" varStatus="status">
				<c:set var="displayPage" value="true" />
				<c:choose>
					<c:when test="${status.first && !displayHome.boolean}">
						<c:set var="displayPage" value="false" />
					</c:when>
					<c:when test="${status.last && !displayCurrentPage.boolean}">
						<c:set var="displayPage" value="false" />
					</c:when>
				</c:choose>
				<c:if test="${displayPage}">
					<li>
						<c:choose>
							<c:when test="${renderContext.mainResource.node.path ne pageNode.path || displayLinkOnCurrentPage.boolean}">
								<a href="<c:url value='${pageNode.url}'/>">
									<c:out value="${pageNode.properties['jcr:title'].string}" />
								</a>
							</c:when>
							<c:otherwise>
								<c:out value="${pageNode.properties['jcr:title'].string}" />
							</c:otherwise>
						</c:choose>
					</li>
				</c:if>
			</c:forEach>
		</ul>
	</section>
</c:if>