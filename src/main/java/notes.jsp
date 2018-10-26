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
<h1>Notes</h1>
<table>
	<tr>
		<th>Id</th>
		<th>Title</th>
	</tr>
	<s:iterator value="notes" var="note">
		<tr>		
			<%-- <s:url anchor="notes/#note.key"></s:url> --%>
			<td><s:property value="#note.key" /></td>
			<td><s:property value="#note.value.title" /></td>		
		</tr> 
	</s:iterator>
		
</table>
<br /><br />

<s:url action="create" var="createNoteURL" namespace="/notes" />
<s:a href="%{createNoteURL}">Create New Note</s:a>
<s:url action="index" var="indexURL" namespace="/" />
<s:a href="%{indexURL}">Main Page</s:a>
</body>
</html>