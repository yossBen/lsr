<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>

<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="titre" scope="request" />
<jcr:nodeProperty node="${currentNode}" name="corps" var="corps" scope="request" />
<jcr:nodeProperty node="${currentNode}" name="chapeau" var="chapeau" scope="request" />
<jcr:nodeProperty node="${currentNode}" name="image" var="image" scope="request" />
<jcr:nodeProperty node="${currentNode}" name="j:lastPublished" var="lastPublished" scope="request" />
<c:set var="currentPage" value="${jcr:getParentOfType(currentNode,'jnt:page' )}" scope="request" />