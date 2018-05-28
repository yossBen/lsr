<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>


<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="titre" />
<jcr:nodeProperty node="${currentNode}" name="datePublication" var="datePublication" />
<jcr:nodeProperty node="${currentNode}" name="image" var="image" />
<jcr:nodeProperty node="${currentNode}" name="chapeau" var="chapeau" />
<jcr:nodeProperty node="${currentNode}" name="corps" var="corps" />

<section class="bloc-a-la-une">

             <div class="bloc-titre">A la une</div>

             <div class="bloc-une">
               <div class="col-une">
                  <c:url value="${image.node.url}" var="imageUrl"></c:url>
                  <img src="${imageUrl}" alt="${fn:escapeXml(currentNode.properties['jcr:title'].string)}" width="400" alt="" align="left"/>
               </div>
               <div class="col-une contenu">
                <h1>${titre.string}</h1>
                <div class="date">
                    <c:if test="${not empty datePublication}">
                        <fmt:formatDate value="${datePublication.time}" pattern="dd MMMMMMMMMM yyyy" />
                     </c:if>
                </div>
                <div class="contenu-art">
                      <b>${chapeau.string}</b><br/><br/>
                      ${fn:substring(corps.string, 0, 400)}
                </div>
                <a href="${url.base}${currentNode.parent.parent.path}.html?articleId=${currentNode.identifier}" class="lire" role="link">Lire l’article</a>
              </div>
             </div>

</section>
