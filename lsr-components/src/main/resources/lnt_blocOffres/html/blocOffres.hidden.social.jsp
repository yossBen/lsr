<%@include file="../../common/declarations.jspf"%>

<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageFichePoste" var="pageFichePoste" />
<c:set var="page" value="${renderContext.mainResource.node}" scope="request" />

<c:url var="parentPageFullUrl" value="${url.server}${pageFichePoste.node.url}?posteId=${posteId}" />
<c:set var="parentPageTitle" value="${fn:escapeXml(posteTitle)}" />

<fmt:message key="facebook.url.share" var="facebookShareUrl" />
<c:set var="facebookShareUrl" value="${fn:replace(facebookShareUrl,'[url]',parentPageFullUrl)}" />
<c:set var="facebookShareUrl" value="${fn:replace(facebookShareUrl,'[title]',parentPageTitle)}" />
<c:url var="facebookShareUrl" value="${facebookShareUrl}" scope="request" />

<fmt:message key="twitter.url.share" var="twitterShareUrl" />
<c:set var="twitterShareUrl" value="${fn:replace(twitterShareUrl,'[url]',parentPageFullUrl)}" />
<c:set var="twitterShareUrl" value="${fn:replace(twitterShareUrl,'[title]',parentPageTitle)}" />
<c:url var="twitterShareUrl" value="${twitterShareUrl}" scope="request" />

<fmt:message key="linkedin.url.share" var="linkedinShareUrl" />
<c:set var="linkedinShareUrl" value="${fn:replace(linkedinShareUrl,'[url]',parentPageFullUrl)}" />
<c:set var="linkedinShareUrl" value="${fn:replace(linkedinShareUrl,'[title]',parentPageTitle)}" />
<c:url var="linkedinShareUrl" value="${linkedinShareUrl}" scope="request" />