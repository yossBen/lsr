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

<section class="cinq-br-bloc" >
    <div class="br-bloc-1">
        <section class="bloc-raisons" >
            <a href="${url.base}${currentNode.parent.parent.parent.parent.path}/etudiant.html" class="nbraison col-md-6 ${titre == 'etudiant' ? 'active' : ''}">
                <i class="etudiant" data-line="1"></i>
                <span>Étudiant</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.parent.path}/jeune-diplome.html" class="nbraison col-md-6 ${titre == 'jeune-diplome' ? 'active' : ''}">
                <i class="diplome" data-line="2"></i>
                <span>Jeune diplômé</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/experimente.html" class="nbraison col-md-6 ${titre == 'experimente' ? 'active' : ''}">
                <i class="experimente" data-line="3"></i>
                <span>Expérimenté</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/salarie-de-linstitution.html" class="nbraison col-md-6 ${titre == 'salarie-de-l-institution' ? 'active' : ''}">
                <i class="salarie" data-line="4"></i>
                <span>Salarié<br/>de l’institution</span>
            </a>
        </section>
        <div class="btn-group etape-dr" role="group">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">SELECTIONNER UNE ETAPE<span class="caret"></span></button>
                            <ul class="dropdown-menu">
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/etudiant.html">Etudiant</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.parent.path}/jeune-diplome.html">Jeune diplômé</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/experimente.html">Expérimenté</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/salarie-de-linstitution.html">Salariéde l’institution</a></li>
                            </ul>
                      </div>
    </div>
    <div class="br-bloc-2">
        <section class="bloc-raisons-contenu">
            <c:set var="dataline" value="1"/>
            <c:choose>
                  <c:when test="${titre == 'etudiant'}">
                    <c:set var="dataline" value="1"/>
                  </c:when>
                  <c:when test="${titre == 'jeune-diplome'}">
                    <c:set var="dataline" value="2"/>
                  </c:when>
                  <c:when test="${titre == 'experimente'}">
                    <c:set var="dataline" value="3"/>
                  </c:when>
                  <c:when test="${titre == 'salarie-de-l-institution'}">
                    <c:set var="dataline" value="4"/>
                  </c:when>
            </c:choose>
            <div class="numero-raison"><i class="${titre}" data-line="${dataline}"></i></div>
            <div class="bloc-titre"><jcr:nodePropertyRenderer node="${currentNode}" name="titre" renderer="resourceBundle"/></div>
            <div class="bloc-contenu-rz">${texte}<br/>
            <c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:bouton')}" var="child">
                <template:module path="${child.path}" editable="true" />
            </c:forEach>
            <c:if test="${renderContext.editMode}">
                <template:module path="*" nodeTypes="lnt:bouton" />
            </c:if>
            </div>
        </section>
    </div>
</section>