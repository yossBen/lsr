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
<%@include file="../../common/common.jspf"%>
</head>
<body role="document">
	<header role="banner">
	<div class="container-fluid">
		<div class="container ${renderContext.editMode ? 'edit' : ''}">
			<div class="row headbandeau">
				<template:area path="header" moduleType="absoluteArea" level="0" />
				<template:area path="menu" />
			</div>
		</div>
	</div>
	</header>
	<div class="container">
		<div class="row jepostule">
			<div class="col-lg-9 col-md-8 col-sm-12">
				<template:area path="file-d-ariane" moduleType="absoluteArea" level="0" />
				<template:area path="pagecontent" />
			</div>
			<div class="col-lg-3 nopadd">
				<template:area path="droite" />
			</div>
		</div>
	</div>
	<footer> <template:area path="footer" moduleType="absoluteArea" level="0" /> </footer>
</body>
</html>