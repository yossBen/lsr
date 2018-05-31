<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="page" value="${renderContext.mainResource.node}" scope="request" />

<c:url var="parentPageUrl" value="${url.baseLive}${page.path}.html" />
<c:set var="parentPageFullUrl" value="${url.server}${parentPageUrl}" scope="request" />
<c:set var="parentPageTitle" value="${page.properties['jcr:title'].string}" />

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

<fmt:message key="viadeo.url.share" var="viadeoShareUrl" />
<c:set var="viadeoShareUrl" value="${fn:replace(viadeoShareUrl,'[url]',parentPageFullUrl)}" />
<c:set var="viadeoShareUrl" value="${fn:replace(viadeoShareUrl,'[title]',parentPageTitle)}" />
<c:url var="viadeoShareUrl" value="${viadeoShareUrl}" scope="request" />
