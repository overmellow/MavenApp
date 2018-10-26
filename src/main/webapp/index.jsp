<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h1>Index</h1>
	<s:url action="all" var="notesURL" namespace="/notes" />
	<s:a href="%{notesURL}">Notes</s:a>
	<br />
	<s:url action="doLogin.action" var="loginURL" namespace="auth" />
	<s:url action="doLogout.action" var="LogoutURL" namespace="auth" />

	<s:if test="%{#session.authenticatedUser == null}">
		<s:a href="%{loginURL}">Login</s:a>
	</s:if>
	<s:else>
	    <s:a href="%{LogoutURL}">Logout</s:a>
	</s:else>	
	
	<br/><br/>
	<p>Logged in User: <s:property value="#session.authenticatedUser.username" /></p>
</f:view>
</body>
</html>