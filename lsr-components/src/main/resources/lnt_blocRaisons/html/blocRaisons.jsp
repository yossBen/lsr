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

<c:set var="index" value="0" scope="page" />

<section class="bloc-raisons" role="contentinfo" aria-label="${currentNode.properties['jcr:title']}">
            <h2 class="bloc-titre">${currentNode.properties['jcr:title']}</h2>

             <c:forEach items="${jcr:getChildrenOfType(currentNode,'lnt:raison')}" var="child">
                   <template:module path="${child.path}" editable="true" view="detail">
                        <c:set var="index" value="${index + 1}" scope="page"/>
                        <template:param name="listSize" value="${functions:length(jcr:getChildrenOfType(currentNode,'lnt:raison'))}"/>
                        <template:param name="index" value="${index}"/>
                   </template:module>
             </c:forEach>
             <c:if test="${renderContext.editMode}">
                 <template:module path="*" nodeTypes="lnt:raison" />
             </c:if>
</section>