<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Hopper's Receipt</title>
</head>
<body>

<h1> Customer name :   <c:out value="${name_render}"/>  </h1>

<h1>Item name :    <c:out value="${itemname_render }"/> </h1>

<h1>Price:$<c:out value="${price_render }"/></h1>

<h1>Description:  <c:out value="${description_render }"/> </h1>

<h1>Vender: <c:out value="${vendor_render}"/></h1>


</body>
</html>