<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<title>${fn:escapeXml(renderContext.mainResource.node.displayableName)}</title>

<template:addResources type="javascript" resources="jquery.min.js" />
<template:addResources type="javascript" resources="bootstrap.min.js" />
<template:addResources type="javascript" resources="bootstrap-select.js" />
<template:addResources type="javascript" resources="script.js" />
<template:addResources type="css" resources="master.css" />
<template:addResources type="css" resources="base-secu.css" />
<template:addResources type="css" resources="custom.css" />
<link href="https://fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">
	<c:if test="${renderContext.editMode}">
		<template:addResources type="css" resources="edit.css" />
	</c:if>
	<template:addResources type="css" resources="960.css,01web.css" />
</head>

<body role="document">
	<header role="banner">
	<div class="container-fluid">
		<div class="container">
			<div class="row headbandeau">
				<template:area path="header" />
			</div>
		</div>
	</div>
	</header>
	<div class="container">
		<div class="bodywrapper">
			<template:area path="pagecontent" />
		</div>
	</div>
	<footer> <template:area path="footer" /> </footer>
</body>
</html>