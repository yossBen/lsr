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

<jcr:nodeProperty var="titre" node="${currentNode}" name="jcr:title" />
<jcr:nodeProperty var="video" node="${currentNode}" name="video" />
<jcr:nodeProperty var="doc" node="${currentNode}" name="doc" />
<div class="metierEditMode">
 <h1>${titre}</h1>
    <p>
    							<br><b><h3>Colonne gauche :</h3></b>
    							<c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:sousblocmetiergauche')}"
                                    			var="child">
                                    	<template:module path="${child.path}" editable="true" />
                                 </c:forEach>
                                 <template:module path="*" nodeTypes="lnt:sousblocmetiergauche" />

                                <br><b><h3>Colonne droite :</h3></b>

    							<c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:sousblocmetierdroite')}"
                                    			var="child">
                                    	<template:module path="${child.path}" editable="true" />
                                </c:forEach>
                                <template:module path="*" nodeTypes="lnt:sousblocmetierdroite" />
                              <br><b>Lien vidéo : ${video}
</b>
                              <br><b>Lien doc : ${doc.node.url}</b>
</p>
</div>