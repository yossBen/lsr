<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>

<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageFichePoste" var="pageFichePoste" />
<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageResultat" var="pageResultat" />
<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="title" />
<jcr:nodeProperty node="${currentNode}" name="nombre" var="number" />
<jcr:nodeProperty node="${currentNode}" name="typesContrat" var="contractTypes" />
<jcr:nodeProperty node="${currentNode}" name="metiers" var="jobsFamily" />
<jcr:nodeProperty node="${currentNode}" name="metierSpec" var="jobs" />

<c:forEach items="${contractTypes}" var="item" varStatus="loop">
	<c:set var="contractTypesList" value="${contractTypesList}${!loop.first ? ',' : ''}${item.string}" />
</c:forEach>

<c:set var="countJobs" value="0" />
<c:forEach items="${jobsFamily}" var="item">
	<c:set var="jobsFamilyList" value="${jobsFamilyList}${countJobs gt 0 ? ',' : ''}${item.string}" />
</c:forEach>
<c:forEach items="${jobs}" var="item">
	<c:set var="jobsFamilyList" value="${jobsFamilyList}${countJobs gt 0 ? ',' : ''}${item.string}" />
</c:forEach>

<c:set var="number" value="${!empty number ? number.long : 4}" />
<section class="bloc-offres" role="contentinfo" aria-label="Consultez les dernières offres">
	<h2 class="bloc-titre">${title.string}</h2>
	<c:if test="${!renderContext.editMode}">
		<c:set var="searchResult" value="${lsr:getLastAdvertisements(fn:split(jobsFamilyList,','),fn:split(contractTypesList,','),number)}" />
		<c:forEach items="${searchResult}" var="adv">
			<div class="offre col-lg-12">
				<div class="recruteur">${adv.organisme}</div>
				<div class="titreoffre">
					<c:url var="pageFichePosteURL" value="${pageFichePoste.node.url}?posteId=${adv.id}"/>

					<a href="${pageFichePosteURL}" role="link" aria-label="${adv.title}">${adv.title}</a>
				</div>
			</div>
		</c:forEach>
	</c:if>
	<div class="col-lg-12 touteslesoffres">
	    <c:url var="pageResultatURL" value="${pageResultat.node.url}"/>
		<a href="${pageResultatURL}" class="btoffres" role="link" aria-label="Voir toutes les offres">Voir toutes les offres</a>
	</div>
</section>