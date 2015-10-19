<%@ page pageEncoding="UTF-8" language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<sec:authorize access="authenticated" var="authenticated" />
<c:set var="path" value="${requestScope['javax.servlet.forward.servlet_path']}" />

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Sitwell DJ</title>
		<meta charset="utf-8">
		<meta name="description" content="Sitwell DJ">
		<meta name="author" content="Sitwell DJ">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>"/> 
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" rel="stylesheet">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	</head>
	<body class="${ pageclass }">
		<c:if test="${authenticated}">
			<div class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="<c:url value="/" />">Sitwell DJ</a>
					</div>
					<div class="navbar-collapse collapse">
						<sec:authorize access="hasRole('ROLE_ADMIN')">
							<ul class="nav navbar-nav">
								<li <c:if test="${ fn:startsWith(path,'/admin/event') }">class="active"</c:if>><a href="<c:url value="/admin/event" />"><i class="fa fa-music fa-fw"></i> Events</a></li>
								<li <c:if test="${ fn:startsWith(path,'/admin/dj') }">class="active"</c:if>><a href="<c:url value="/admin/dj" />"><i class="fa fa-group fa-fw"></i> DJs</a></li>
								<li <c:if test="${ fn:startsWith(path,'/admin/venue') }">class="active"</c:if>><a href="<c:url value="/admin/venue" />"><i class="fa fa-building fa-fw"></i> Venues</a></li>
							</ul>
						</sec:authorize>
						<ul class="nav navbar-nav navbar-right">
							<li <c:if test="${ fn:startsWith(path,'/settings') }">class="active"</c:if>><a href="<c:url value="/settings" />"><i class="fa fa-cog fa-fw"></i> Settings</a></li>
							<li><a href="<c:url value="/logout" />"><i class="fa fa-power-off fa-fw"></i> Logout</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div style="height:60px"></div>
		</c:if>
	
		<div class="container separate" id="wrapper">
		
			<c:import url="/WEB-INF/views/common/messages.jsp"/>
	
			${content}
			
		</div>
		
		<div id="footer">
			<div class="container">
				<hr />
				<c:if test="${authenticated}">
					<div class="pull-right">
						<small>Logged in as: <b><i><sec:authentication property="name" /></i></b></small>
					</div>
				</c:if>
				
			</div>
		</div>
		
		<script type="text/javascript" src="<c:url value="/resources/js/moment.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap3-datetimepicker.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/modernizr.js" />"></script>
	</body>
</html>