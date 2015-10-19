<%@page pageEncoding="UTF-8"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="icon">
	<c:choose>
		<c:when test="${ param.type == 'warning' }">
			fa-warning
		</c:when>
		<c:when test="${ param.type == 'info' }">
			fa-info-circle
		</c:when>
		<c:when test="${ param.type == 'danger' }">
			fa-exclamation-circle
		</c:when>
		<c:when test="${ param.type == 'success' }">
			fa-check-square
		</c:when>
		<c:otherwise>
			fa-bullhorn
		</c:otherwise>
	</c:choose>
</c:set>

<div class="alert alert-${ param.type }">
	<i class="fa ${ icon } fa-fw"></i> <c:out value="${ param.message }"/><!-- <a href="#" class="close" data-dismiss="alert"><i class="fa fa-times"></i></a> -->
</div>
