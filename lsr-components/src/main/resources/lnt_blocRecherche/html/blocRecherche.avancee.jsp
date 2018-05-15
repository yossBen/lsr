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

<section class="blocresultat-recherche" role="search" aria-label="Que recherchez-vous ?">
	<div class="bloc-titre">
		<h1>${title.string}</h1>
	</div>
	<div class="row">
		<form action="<c:url value='${!empty pageResultat ? pageResultat.node.url : renderContext.mainResource.node.url}'/>" method="get">
			<div class="col-sm-12">
				<h3>Type d'organisme</h3>
			</div>

			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<c:set var="filtersParams" value="${fn:escapeXml(param['regime'])}"></c:set>
				<label for="regimeSelect" id="regimeLabel" class="control-label">Régime</label>
				<select id="regimeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="regimeLabel" onchange="$('#regimeSelectHidden').val($(this).val());" multiple>

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

			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<c:set var="filtersParams" value="${fn:escapeXml(param['typeOrganisme'])}"></c:set>
				<label id="typeOrganismeLabel" for="typeOrganismeSelect" class="control-label">Organisme</label>
				<select id="typeOrganismeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="typeOrganismeLabel" onchange="$('#typeOrganismeSelectHidden').val($(this).val());" multiple>

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
			<div class="clearfix"></div>
			<div class="col-sm-12">
				<h3>Type d'emploi</h3>
			</div>
			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<c:set var="filtersParams" value="${fn:escapeXml(param['jobFamily'])}"></c:set>
				<label for="jobFamilySelect" id="jobFamilyLabel" class="control-label">Famille de métiers</label>
				<select class="selectpicker show-menu-arrow form-control" id="jobFamilySelect" aria-labelledby="jobFamilyLabel" onchange="$('#jobFamilySelectHidden').val($(this).val());" multiple>

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
			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<c:set var="filtersParams" value="${fn:escapeXml(param['contractType'])}"></c:set>
				<label for="contractTypeSelect" id="contractTypeLabel" class="control-label">Type de contrat</label>
				<select id="contractTypeSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="contractTypeLabel" onchange="$('#contractTypeSelectHidden').val($(this).val());" multiple>

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
			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<c:set var="filtersParams" value="${fn:escapeXml(param['classification'])}"></c:set>
				<label for="classificationSelect" id="classificationLabel" class="control-label">Grille de classification</label>
				<select id="classificationSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="classificationLabel" onchange="$('#classificationSelectHidden').val($(this).val());" multiple>

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
			<div class="clearfix"></div>
			<div class="col-sm-12">
				<h3>Localisation</h3>
			</div>
			<c:set var="filtersParams" value="${fn:escapeXml(param['region'])}"></c:set>
			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<label for="regionSelect" id="regionLabel" class="control-label">Région</label>
				<select id="regionSelect" class="selectpicker show-menu-arrow form-control" aria-labelledby="regionLabel" onchange="$('#regionSelectHidden').val($(this).val());" multiple>

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
			<div class="clearfix"></div>
			<div class="col-sm-12">
				<h3>Recherche par mots clés</h3>
			</div>
			<div class="form-group col-sm-12 col-md-6 col-lg-6">
				<label for="keywordsSelect" id="keywordsLabel" class="control-label">Recherche par mots clés</label>
				<input class="form-control" id="keywordsSelect" type="text" value="${fn:escapeXml(param['keywords'])}" aria-labelledby="keywordsLabel" name="keywords">
			</div>
			<div class="clearfix"></div>
			<div class="row ">
				<div class="col-lg-6 col-lg-offset-6">
					<div class="col-lg-6 nopadd">
						<button type="button" class="bt">Créer une alerte mail</button>
					</div>
					<div class="col-lg-6 nopadd">
						<button type="submit" role="button" class="bt">Rechercher</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</section>
<c:set var="pageRechercheSession" value="${renderContext.mainResource.node.url}" scope="session" />