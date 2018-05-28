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

<jcr:nodeProperty var="facebookLink"  node="${currentNode}" name="facebookLink"/>
<jcr:nodeProperty var="viadeoLink"  node="${currentNode}" name="viadeoLink"/>
<jcr:nodeProperty var="twitterLink"  node="${currentNode}" name="twitterLink"/>
<jcr:nodeProperty var="linkedinLink"  node="${currentNode}" name="linkedinLink"/>

<c:if test="${not empty facebookLink}">
   <li><a href="${facebookLink.string}"><i class="fa fa-facebook"></i></a></li>
</c:if> 

<c:if test="${not empty twitterLink}">
   <li><a href="${twitterLink.string}"><i class="fa fa-twitter"></i></a></li>
</c:if> 

<c:if test="${not empty linkedinLink}">
   <li><a href="${linkedinLink.string}"><i class="fa fa-linkedin"></i></a></li>
</c:if> 

<c:if test="${not empty viadeoLink}">
   <li><a href="${viadeoLink.string}"><i class="fa fa-viadeo"></i></a></li>
</c:if> 