<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:useBean id="lovBean" scope="page" class="fr.lsr.jahia.modules.bean.LovBean" />
<jcr:nodeProperty node="${currentNode.resolveSite}" name="pageResultat" var="pageResultat" />
<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="title" />
<jcr:nodeProperty node="${currentNode}" name="displayResultat" var="displayResultat" />

<section class="bloc-recherche" role="search" aria-label="Que recherchez-vous ?">
	<h2>${title.string}</h2>
	<form id="filterForm" action="<c:url value='${!empty pageResultat ? pageResultat.node.url : renderContext.mainResource.node.url}'/>" method="get">

		<c:set var="filtersParams" value="${fn:escapeXml(param['jobFamily'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<!-- Debut listing-->
				<label for="jobFamilySelect" id="jobFamilyLabel" class="control-label">Famille de métiers</label>
				<div>
					<select class="selectpicker show-menu-arrow form-control" id="jobFamilySelect" aria-labelledby="jobFamilyLabel" onchange="$('#jobFamilySelectHidden').val($(this).val());"  multiple>
						<option value=""></option>
						<c:forEach items="${lovBean.jobFamily}" var="item">
							<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
								<c:if test="${filter eq item.lovId}">
									<c:set var="selected" value="selected" />
								</c:if>
							</c:forEach>
							<option value="${item.lovId}" ${selected}>${item.translation}</option>
							<c:set var="selected" value="" />
						</c:forEach>
					</select>
					<input id="jobFamilySelectHidden" type="hidden" value="${filtersParams}" name="jobFamily">
				</div>
			</div>
		</div>
		<c:set var="filtersParams" value="${fn:escapeXml(param['typeOrganisme'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label id="typeOrganismeLabel" for="typeOrganismeSelect" class="control-label">Type d'organisme</label>
				<select id="typeOrganismeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="typeOrganismeLabel" onchange="$('#typeOrganismeSelectHidden').val($(this).val());" multiple>
					<option value=""></option>
					<c:forEach items="${lovBean.typeOrganisme}" var="item">
						<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
							<c:if test="${filter eq item.lovId}">
								<c:set var="selected" value="selected" />
							</c:if>
						</c:forEach>
						<option value="${item.lovId}" ${selected}>${item.translation}</option>
						<c:set var="selected" value="" />
					</c:forEach>
				</select>
				<input id="typeOrganismeSelectHidden" type="hidden" value="${filtersParams}" name="typeOrganisme">
			</div>
		</div>

		<c:set var="filtersParams" value="${fn:escapeXml(param['contractType'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label for="contractTypeSelect" id="contractTypeLabel" class="control-label">Type de contrat</label>
				<select id="contractTypeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="contractTypeLabel" onchange="$('#contractTypeSelectHidden').val($(this).val());" multiple>
					<option value=""></option>
					<c:forEach items="${lovBean.contractType}" var="item">
						<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
							<c:if test="${filter eq  item.lovId}">
								<c:set var="selected" value="selected" />
							</c:if>
						</c:forEach>
						<option value="${item.lovId}" ${selected}>${item.translation}</option>
						<c:set var="selected" value="" />
					</c:forEach>
				</select>
				<input id="contractTypeSelectHidden" type="hidden" value="${filtersParams}" name="contractType">
			</div>
		</div>
		<c:set var="filtersParams" value="${fn:escapeXml(param['region'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label for="regionSelect" id="regionLabel" class="control-label">Région</label>
				<div>
					<select id="regionSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="regionLabel" onchange="$('#regionSelectHidden').val($(this).val());" multiple>
						<option value=""></option>
						<c:forEach items="${lovBean.region}" var="item">
							<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
								<c:if test="${filter eq item.codes}">
									<c:set var="selected" value="selected" />
								</c:if>
							</c:forEach>
							<option value="${item.codes}" ${selected}>${item.name}</option>
							<c:set var="selected" value="" />
						</c:forEach>
					</select>
					<input id="regionSelectHidden" type="hidden" value="${filtersParams}" name="region">
				</div>
			</div>
		</div>

		<c:set var="filtersParams" value="${fn:escapeXml(param['classification'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label for="classificationSelect" id="classificationLabel" class="control-label">Grille de classification</label>
				<div>
					<select id="classificationSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="classificationLabel" onchange="$('#classificationSelectHidden').val($(this).val());" multiple>
						<option value=""></option>
						<c:forEach items="${lovBean.classification}" var="item">
							<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
								<c:if test="${filter eq item.lovId}">
									<c:set var="selected" value="selected" />
								</c:if>
							</c:forEach>
							<option value="${item.lovId}" ${selected}>${item.translation}</option>
							<c:set var="selected" value="" />
						</c:forEach>
					</select>
					<input id="classificationSelectHidden" type="hidden" value="${filtersParams}" name="classification">
				</div>
			</div>
		</div>

		<c:set var="filtersParams" value="${fn:escapeXml(param['regime'])}"></c:set>
		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label for="regimeSelect" id="regimeLabel" class="control-label">Grille de regime</label>
				<div>
					<select id="regimeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="regimeLabel" onchange="$('#regimeSelectHidden').val($(this).val());" multiple>
						<option value=""></option>
						<c:forEach items="${lovBean.regime}" var="item">
							<c:forEach items="${fn:split(filtersParams , ',')}" var="filter">
								<c:if test="${filter eq item.lovId}">
									<c:set var="selected" value="selected" />
								</c:if>
							</c:forEach>
							<option value="${item.lovId}" ${selected}>${item.translation}</option>
							<c:set var="selected" value="" />
						</c:forEach>
					</select>
					<input id="regimeSelectHidden" type="hidden" value="${filtersParams}" name="regime">
				</div>
			</div>
		</div>

		<div class="col-lg-2 paddno">
			<div class="form-group">
				<label for="keywordsSelect" id="keywordsLabel" class="control-label">Recherche par mots clés</label>
				<div>
					<input class="form-control" id="keywordsSelect" type="text" value="${fn:escapeXml(param['keywords'])}" aria-labelledby="keywordsLabel" name="keywords">
				</div>
			</div>
		</div>

		<div class="col-lg-2 btform">
			<button type="submit" role="button" class="btn btn-primary btorange" autofocus>Rechercher</button>
		</div>
	</form>
</section>