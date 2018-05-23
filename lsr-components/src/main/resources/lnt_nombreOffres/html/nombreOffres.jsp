<%@include file="../../common/declarations.jspf"%>
<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageRechercheSimple" var="pageRechercheSimple" />

<c:set var="count" value="${lsr:countAdvertisements()}" />
<div class="nboffre">
	<div class="jour">
		<span>Aujourd'hui</span>
	</div>
	<div class="compte">
		<div class="nbcompte">${count}</div>
		<div class="textcompte">
			<fmt:message key="nombreOffres.titre" />
		</div>
	</div>
	<a href="${pageRechercheSimple.node.url}" class="btposte">
		<fmt:message key="nombreOffres.postuler.label" />
	</a>
</div>