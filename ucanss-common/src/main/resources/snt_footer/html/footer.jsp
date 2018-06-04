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

<jcr:nodeProperty var="logoucanss" node="${currentNode}" name="logoucanss"/>
<jcr:nodeProperty var="logoseculavieenplus" node="${currentNode}" name="logoseculavieenplus"/>
<jcr:nodeProperty var="texte" node="${currentNode}" name="texte"/>


<div class="container blocfooter">
        <div class="logolink">
          <div class="bloclogo">
            <a href="https://www.securite-sociale.fr" role="link" alt="">
            <c:if test="${!empty logoseculavieenplus && !empty logoseculavieenplus.node}">
                <img width="100" src="${logoseculavieenplus.node.url}" alt="${logoseculavieenplus.node.displayableName}">
            </c:if>
            </a>
          </div>
          <div class="bloclogo">
            <a href="http://extranet.ucanss.fr" role="link" alt="">
             <c:if test="${!empty logoucanss && !empty logoucanss.node}">
                <img src="${logoucanss.node.url}" alt="${logoucanss.node.displayableName}" >
             </c:if>
            </a>
          </div>
        </div>
        <template:module path="share" />
        <div class="linkfooter">
          <div class="linkft">

          <c:forEach items="${jcr:getChildrenOfType(currentNode,'snt:link')}" var="child">
          	<template:module path="${child.path}" editable="true" />
          </c:forEach>
          <c:if test="${renderContext.editMode}">
          	<template:module path="*" nodeTypes="snt:link" />
          </c:if>
          </div>
        </div>
        <div class="contenufooter">
          <div class="cfooter">${currentNode.properties['texte'].string}</div>
        </div>
 </div>