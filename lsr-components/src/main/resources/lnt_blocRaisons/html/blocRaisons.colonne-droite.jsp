<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr" %>
<%@ taglib prefix="ui" uri="http://www.jahia.org/tags/uiComponentsLib" %>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions" %>
<%@ taglib prefix="query" uri="http://www.jahia.org/tags/queryLib" %>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib" %>
<%@ taglib prefix="s" uri="http://www.jahia.org/tags/search" %>
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<jcr:nodeProperty var="titre" node="${currentNode}" name="titre"/>
<jcr:nodeProperty var="texte" node="${currentNode}" name="texte"/>

<c:set var="index" value="0" scope="page" />
<section class="bloc-raisons" role="contentinfo" aria-label="${currentNode.properties['jcr:title']}">
            <h2 class="bloc-titre">${currentNode.properties['jcr:title']}</h2>

            <c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:raison')}" var="child">
                               <template:module path="${child.path}" editable="true" view="droite">
                                    <c:set var="index" value="${index + 1}" scope="page"/>
                                    <template:param name="listSize" value="${functions:length(jcr:getChildrenOfType(currentNode,'lnt:raison'))}"/>
                                    <template:param name="index" value="${index}"/>
                               </template:module>
            </c:forEach>
            <c:if test="${renderContext.editMode}">
                             <template:module path="*" nodeTypes="lnt:raison" view="droite"/>
            </c:if>

</section>