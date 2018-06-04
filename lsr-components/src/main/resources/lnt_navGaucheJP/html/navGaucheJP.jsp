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

<c:set var="index" value="0" scope="page" />

        <jcr:sql var="query" sql="select * from [lnt:jepostule] as elements order by [j:lastPublished] asc" />
	<c:forEach items="${query.nodes}" var="node">
	    <c:set var="index" value="${index + 1}" scope="page"/>
		<jcr:nodeProperty var="titre" node="${node}" name="titre"/>
		<jcr:nodeProperty var="texte" node="${node}" name="texte"/>
		<jcr:nodeProperty var="link" node="${node}" name="link"/>

		<a
			href="${link.node.url}"
			class="nbraison col-md-6 ${currentNode.parent == node ? 'active' : ''}">
			<i class="${titre}" data-line="${index}"></i>
			<span>
				<jcr:nodePropertyRenderer node="${currentNode}" name="titre" renderer="resourceBundle"/>
			</span>
		</a>
	</c:forEach>

