<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>


<section class="bloc-raisons" role="contentinfo" aria-label="${currentNode.properties['jcr:title']}">
            <h2 class="bloc-titre">${currentNode.properties['jcr:title']}</h2>

             <jcr:sql var="query" sql="select * from [lnt:raison] as elements order by [j:lastPublished] asc" />
	         <c:forEach items="${query.nodes}" var="child">
                   <template:module path="${child.path}" editable="true" view="detail"/>
             </c:forEach>
             <c:if test="${renderContext.editMode}">
                 <template:module path="*" nodeTypes="lnt:raison" />
             </c:if>
</section>