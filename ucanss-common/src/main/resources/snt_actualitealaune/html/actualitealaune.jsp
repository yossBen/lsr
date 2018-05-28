<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.jahia.org/tags/utilityLib" prefix="utility"%>
<%@ taglib uri="http://www.jahia.org/tags/uiComponentsLib" prefix="ui"%>
<%@ taglib uri="http://www.LaSecuRecrute.fr/lsr-components/tags" prefix="lsr"%>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions"%>
<jcr:nodeProperty node="${currentNode}" name="actu" var="actu" />

<template:module node="${actu.node}" view="alaune" />