<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%--@elvariable id="currentNode" type="org.jahia.services.content.JCRNodeWrapper"--%>
<%--@elvariable id="out" type="java.io.PrintWriter"--%>
<%--@elvariable id="script" type="org.jahia.services.render.scripting.Script"--%>
<%--@elvariable id="scriptInfo" type="java.lang.String"--%>
<%--@elvariable id="workspace" type="java.lang.String"--%>
<%--@elvariable id="renderContext" type="org.jahia.services.render.RenderContext"--%>
<%--@elvariable id="currentResource" type="org.jahia.services.render.Resource"--%>
<%--@elvariable id="url" type="org.jahia.services.render.URLGenerator"--%>

<template:include view="hidden.header" />
<div class="blocshare">
          <ul class="share">
			<li>
				<a id="facebook" href="${facebookShareUrl}" title="facebook" rel="nofollow" target="_blank">
					<i class="fa fa-facebook"></i>
				</a>
			</li>

			<li>
				<a id="twitter" href="${twitterShareUrl}" title="twitter" rel="nofollow" target="_blank">
					<i class="fa fa-twitter"></i>
				</a>
			</li>

			<li>
				<a id="linkedin" href="${linkedinShareUrl}" title="linkedin" rel="nofollow" target="_blank">
					<i class="fa fa-linkedin"></i>
				</a>
			</li>

			<li>
				<a id="viadeo" href="${viadeoShareUrl}" title="viadeo" rel="nofollow" target="_blank">
					<i class="fa fa-viadeo"></i>
				</a>
			</li>
		</ul>
	</div>