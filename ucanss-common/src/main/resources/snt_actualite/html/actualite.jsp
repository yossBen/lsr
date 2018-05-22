<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>

<jcr:nodeProperty node="${currentNode}" name="contenu" var="contenu" />
<jcr:nodeProperty node="${currentNode}" name="dateActu" var="dateActu" />

<fmt:formatDate value="${dateActu.date.time}" pattern="dd/MM/yyyy" />
<div class="test">${contenu.string}</div>
