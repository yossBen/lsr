<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>

<nav class="nav-bottom" role="navigation">
	<template:include view="hidden.lsr-simple">
		<template:param name="class" value="nav navbar-nav" />
		<template:param name="linkClass" value="dropdown-toggle" />
		<template:param name="id" value="menumob" />
	</template:include>
</nav>