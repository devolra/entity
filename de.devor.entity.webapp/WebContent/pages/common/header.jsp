<%@page import="de.devor.pageflow.mvc.core.PageModel"%>
<%@page import="de.devor.pageflow.mvc.core.PageHelper"%>
<%@page import="de.devor.pageflow.mvc.core.ApplicationContext"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	ApplicationContext headerApplicationContext = (ApplicationContext) session.getAttribute(ApplicationContext.APPLICATION_CONTEXT);
	PageHelper headerPageHelper = headerApplicationContext.getPageHelper();
	String headerPageTitle = headerPageHelper.getPageTitle();
	String headerPageDescription = headerPageHelper.getPageDescription();
	PageModel headerPageModel = headerApplicationContext.getPageModel();
	
	request.setAttribute(ApplicationContext.APPLICATION_CONTEXT, headerApplicationContext);
	request.setAttribute(PageHelper.PAGE_HELPER, headerPageHelper);
	request.setAttribute(PageModel.PAGE_MODEL, headerPageModel);
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><%=headerPageTitle%></title>
		<link rel="stylesheet" type="text/css" href="<%=ApplicationContext.BASE_URL%>/semanticui/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="<%=ApplicationContext.BASE_URL%>/css/page.css">
		<script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
		<script src="<%=ApplicationContext.BASE_URL%>/semanticui/semantic.min.js"></script>
	</head>
	<body>
		<div class="ui inverted segment">
			 <h1 class="ui blue inverted header center aligned"><%=headerPageTitle%></h1>
		</div>
		<div class="ui inverted segment">
			<h2 class="ui blue inverted header center aligned"><%=headerPageDescription%></h2>
		</div>