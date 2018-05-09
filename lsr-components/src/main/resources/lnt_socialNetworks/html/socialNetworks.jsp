<%@include file="../../common/declarations.jspf"%>
<template:include view="hidden.header" />

<template:addResources type="css" resources="partage.css" />

<div class="bloc-partage">
	<div class="${cssClass}">
		<div class="partage-contenu">
			<fmt:message key="socialNetworks.title" />
		</div>
		<div class="partage-link">
			<ul>
				<li>
					<a id="facebook" href="${facebookShareUrl}" title="<fmt:message key="facebook"/>" rel="nofollow" target="_blank" data-category="Partage" data-action="Social_Facebook::Haut"
						data-label="${parentPageFullUrl}">
						<i class="icon-fb"></i>
					</a>
				</li>
				<li>
					<a id="twitter" href="${twitterShareUrl}" title="<fmt:message key="twitter"/>" rel="nofollow" target="_blank" data-category="Partage" data-action="Social_Twitter::Haut"
						data-label="${parentPageFullUrl}">
						<i class="icon-tw"></i>
					</a>
				</li>
				<li>
					<a id="linkedin" href="${linkedinShareUrl}" title="<fmt:message key="linkedin"/>" rel="nofollow" target="_blank" data-category="Partage" data-action="Social_Linkedin::Haut"
						data-label="${parentPageFullUrl}">
						<i class="icon-in"></i>
					</a>
				</li>
			</ul>
		</div>
	</div>
</div>