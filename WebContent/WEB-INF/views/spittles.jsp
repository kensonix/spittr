<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spittles</title>
</head>
<body>
	<c:foreach items = "${spittleList}" var = "spittle">
	<li id = "spittle_<c:out value="spittle.id" />">
		<div class = "spittleMessge">
			<c:out value = "${spittle.message} }" />
		</div>
		<div>
			<span class = "spittleTime">
				<c:out value="${spittle.time}"/>
			</span>
			<span class = "spittleLocation">
				<c:out value="${spittle.latitude}" />
				<c:out value="${spittle.longtitude }" />
			</span>
		</div> 
	</li>
	</c:foreach>
</body>
</html>