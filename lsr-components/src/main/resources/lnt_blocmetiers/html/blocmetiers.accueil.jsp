<%@include file="../../common/declarations.jspf"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<jcr:nodeProperty var="pageTous" node="${currentNode}" name="pageTousLesMetiers" />
<jcr:nodeProperty var="titre" node="${currentNode}" name="jcr:title" />

<section class="bloc-metiers" role="contentinfo"aria-label="${titre}">
    <h2 class="bloc-titre">${titre}</h2>
	<c:set var="nodes" value="${lsr:getRandomNodes(currentNode.resolveSite, 'lnt:famillemetier', 5)}" />
	<c:forEach items="${nodes}" var="node">
		<jcr:nodeProperty var="titre" node="${node}" name="jcr:title" />
		<jcr:nodeProperty var="link" node="${node}" name="link" />
		<jcr:nodeProperty var="image" node="${node}" name="image" />
		<c:url value="${image.node.url}" var="imageUrl"></c:url>
        <c:url value="${link.node.url}" var="linkURL"></c:url>

		<a href="${linkURL}" class="metier col-lg-4 col-md-4 col-xs-12" style="background-image: url('${imageUrl}');" role="link" aria-label="${titre}">
			<span>${titre}</span>
		</a>
	</c:forEach>
	<a href="${pageTous.node.url}" class="metier link col-lg-4 col-md-4 col-xs-12" role="link" aria-label="Voir plus de métiers">
		<span class="fleche">Voir plus de m&eacute;tiers</span>
	</a>
</section>
<section  class="bloc-metiers-home-mobile">
              <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                  <li data-target="#myCarousel" data-slide-to="1"></li>
                  <li data-target="#myCarousel" data-slide-to="2"></li>
                  <li data-target="#myCarousel" data-slide-to="3"></li>
                  <li data-target="#myCarousel" data-slide-to="4"></li>
                  <li data-target="#myCarousel" data-slide-to="5"></li>
                  <li data-target="#myCarousel" data-slide-to="6"></li>
                  <li data-target="#myCarousel" data-slide-to="7"></li>
                  <li data-target="#myCarousel" data-slide-to="8"></li>
                  <li data-target="#myCarousel" data-slide-to="9"></li>
                </ol>
            <div class="carousel-inner">
            <c:set var="nodes" value="${lsr:getRandomNodes(currentNode.resolveSite, 'lnt:famillemetier', 9)}" />


            <c:forEach items="${nodes}" var="node"  varStatus="loop">
                    <jcr:nodeProperty var="titre" node="${node}" name="jcr:title" />
                    <jcr:nodeProperty var="link" node="${node}" name="link" />
                    <jcr:nodeProperty var="image" node="${node}" name="image" />
                    <c:url value="${image.node.url}" var="imageUrl"></c:url>

                    <div class="item ${loop.first ? 'active' : ''}">
                                <a href="${link.node.url}"><img src="${imageUrl}" alt="${titre}"></a>
                                <div class="carousel-caption">
                                  <p>${titre}</p>
                                </div>
                              </div>
            </c:forEach>


                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                  <span class="glyphicon glyphicon-menu-left"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                  <span class="glyphicon glyphicon-menu-right"></span>
                  <span class="sr-only">Next</span>
                </a>
              </div>
</section>