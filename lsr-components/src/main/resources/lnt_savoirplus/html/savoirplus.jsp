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

<jcr:nodeProperty var="video" node="${currentNode}" name="video" />
<jcr:nodeProperty var="doc" node="${currentNode}" name="doc" />

 <section class="bloc-localisations">
              <div class="bloc-ensavoirplus">
                <div class="titre">En savoir plus</div>
                <ul class="lienensavoir">
                <c:if test="${!empty video}">
                    <li class="video"><a href="${video}" role="link" alt="" onclick="window.open(this.href); return false;">voir la vidéo métier</a></li>
                </c:if>
                <c:if test="${!empty doc}">
                    <li class="telecharger"><a href="${doc.node.url}" alt="" onclick="window.open(this.href); return false;">télécharger la fiche</a></li>
                </c:if>
                </ul>
              </div>
 </section>