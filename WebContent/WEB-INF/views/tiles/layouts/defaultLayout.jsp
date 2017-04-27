<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	<title><tiles:getAsString name="title" /></title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	
    <header id="header">
        <tiles:insertAttribute name="header" />
    </header>
 
    <section id="sidemenu">
        <tiles:insertAttribute name="menu" />
    </section>
         
    <section id="site-content">
        <tiles:insertAttribute name="body" />
    </section>
     
    <footer id="footer">
        <tiles:insertAttribute name="footer" />
    </footer>
</body>

</html>