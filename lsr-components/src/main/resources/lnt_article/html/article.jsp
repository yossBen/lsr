<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions" %>

<c:set var="articleId" value="${fn:escapeXml(param['articleId'])}" />

<c:if test="${!renderContext.editMode && !empty articleId}">

   <jcr:sql var="query" sql="select * from [lnt:actualite] where [jcr:uuid]='${articleId}'" limit="1" />

   <c:if test="${functions:length(query.nodes)==1}">
      <c:forEach items="${query.nodes}" var="node">

      <jcr:nodeProperty node="${node}" name="jcr:title" var="titre" />
      <jcr:nodeProperty node="${node}" name="datePublication" var="datePublication" />
      <jcr:nodeProperty node="${node}" name="image" var="image" />
      <jcr:nodeProperty node="${node}" name="chapeau" var="chapeau" />
      <jcr:nodeProperty node="${node}" name="corps" var="corps" />

          <section class="bloc-article">
             <div class="bloc-titre">
                <h1>${titre.string}</h1>
                <div class="date">
                   <c:if test="${not empty datePublication}">
                      <fmt:formatDate value="${datePublication.time}" pattern="dd MMMMMMMMMM yyyy" />
                   </c:if>
                </div>
             </div>
             <div class="bloc-une">
                <div class="col-une contenu">
                   <div class="contenu-art">
                      <c:url value="${image.node.url}" var="imageUrl"></c:url>
                      <img src="${imageUrl}" alt="${fn:escapeXml(currentNode.properties['jcr:title'].string)}" width="400" alt="" align="left"/>
                      <b>${chapeau.string}</b><br/><br/>
                      ${corps.string}
                      <br/><br/>
                      <c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:image')}" var="child">
                         <template:module path="${child.path}" editable="true" />
                      </c:forEach>
                      <c:if test="${renderContext.editMode}">
                         <template:module path="*" nodeTypes="lnt:image" />
                      </c:if>
                   </div>
                </div>
             </div>
          </section>
       </c:forEach>
   </c:if>
</c:if>
<c:if test="${renderContext.editMode}">
	<h1>Article</h1>
</c:if>
