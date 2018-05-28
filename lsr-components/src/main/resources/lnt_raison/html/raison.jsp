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
            <a href="${url.base}${currentNode.parent.parent.parent.path}/contribuer-a-un-projet-de-societ.html" class="nbraison col-md-6 ${titre == 'contribuer' ? 'active' : ''}">
                <i class="contribuer" data-line="1"></i>
                <span>Contribuer à projet de société</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/construire-sa-carriere.html" class="nbraison col-md-6 ${titre == 'construire' ? 'active' : ''}">
                <i class="construire" data-line="2"></i>
                <span>Construire<br/>sa carrière</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/acceder-a-un-large-eventail-de-m.html" class="nbraison col-md-6 ${titre == 'acceder' ? 'active' : ''}">
                <i class="acceder" data-line="3"></i>
                <span>Accéder à un large éventail de métiers</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/rejoindre-un-employeur-engage.html" class="nbraison col-md-6 ${titre == 'rejoindre' ? 'active' : ''}">
                <i class="rejoindre" data-line="4"></i>
                <span>Rejoindre un employeur engagé</span>
            </a>
            <a href="${url.base}${currentNode.parent.parent.parent.path}/evoluer-dans-un-univers-performa.html" class="nbraison col-md-6 ${titre == 'evoluer' ? 'active' : ''}">
                <i class="evoluer" data-line="5"></i>
                <span>Evoluer dans un univers performant</span>
            </a>
        </section>
        <div class="btn-group etape-dr" role="group">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">SELECTIONNER UNE ETAPE<span class="caret"></span></button>
                            <ul class="dropdown-menu">
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/contribuer-a-un-projet-de-societ.html">Contribuer à un projet de société</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/construire-sa-carriere.html">Construire sa carrière</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/acceder-a-un-large-eventail-de-m.html">Accéder à un large éventail de métiers</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/rejoindre-un-employeur-engage.html">Rejoindre un employeur engagé</a></li>
                              <li><a href="${url.base}${currentNode.parent.parent.parent.path}/evoluer-dans-un-univers-performa.html">Evoluer dans un univers performant</a></li>
                            </ul>
                      </div>
    </div>
    <div class="br-bloc-2">
        <section class="bloc-raisons-contenu">
            <c:set var="dataline" value="1"/>
            <c:choose>
                  <c:when test="${titre == 'contribuer'}">
                    <c:set var="dataline" value="1"/>
                  </c:when>
                  <c:when test="${titre == 'construire'}">
                    <c:set var="dataline" value="2"/>
                  </c:when>
                  <c:when test="${titre == 'acceder'}">
                    <c:set var="dataline" value="3"/>
                  </c:when>
                  <c:when test="${titre == 'rejoindre'}">
                    <c:set var="dataline" value="4"/>
                  </c:when>
                  <c:when test="${titre == 'evoluer'}">
                    <c:set var="dataline" value="5"/>
                  </c:when>
            </c:choose>
            <div class="numero-raison"><i class="${titre}" data-line="${dataline}"></i></div>
            <div class="bloc-titre"><jcr:nodePropertyRenderer node="${currentNode}" name="titre" renderer="resourceBundle"/></div>
            <div class="bloc-contenu-rz">${texte}<br/><br/>Emplacement Infographie ...</div>
        </section>
    </div>
</section>