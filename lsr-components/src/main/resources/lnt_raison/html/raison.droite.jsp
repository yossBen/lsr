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

<jcr:nodeProperty var="titre" node="${currentNode}" name="titre"/>
<jcr:nodeProperty var="link" node="${currentNode}" name="link"/>

<c:url var="linkURL" value="${link.node.url}"/>

<a href="${linkURL}" class="nbraison col-md-12">
   <i class="${titre}" data-line="${index}"></i>
   <span><jcr:nodePropertyRenderer node="${currentNode}" name="titre" renderer="resourceBundle"/></span>
</a>
