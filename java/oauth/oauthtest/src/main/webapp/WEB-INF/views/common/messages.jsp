<%@ page pageEncoding="UTF-8" language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%-- GENERAL MESSAGES --%>
<c:if test="${success != null}">
	<div class="row">
		<div class="col-md-12">
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="success" />
				<c:param name="message" value="${success}" />
			</c:import>
		</div>
	</div>
</c:if>
<c:if test="${information != null}">
	<div class="row">
		<div class="col-md-12">
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="info" />
				<c:param name="message" value="${information}" />
			</c:import>
		</div>
	</div>
</c:if>
<c:if test="${warning != null}">
	<div class="row">
		<div class="col-md-12">
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="warning" />
				<c:param name="message" value="${warning}" />
			</c:import>
		</div>
	</div>
</c:if>
<c:if test="${error != null}">
	<div class="row">
		<div class="col-md-12">
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="danger" />
				<c:param name="message" value="${error}" />
			</c:import>
		</div>
	</div>
</c:if>

<%-- AUTHENTICATION MESSAGES --%>
<c:if test="${param.error != null}">
	<div class="row">
		<div class="col-md-12">
			<c:set var="errorMessage">
				Failed to login.
				<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
					Reason: ${SPRING_SECURITY_LAST_EXCEPTION.message}
				</c:if>
			</c:set>
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="danger" />
				<c:param name="message" value="${ errorMessage }" />
			</c:import>
		</div>
	</div>
</c:if>
<c:if test="${param.logout ne null}">
	<div class="row">
		<div class="col-md-12">
			<c:set var="logoutMessage"><spring:message code="general.loggedOut"/></c:set>
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="success" />
				<c:param name="message" value="${logoutMessage}" />
			</c:import>
		</div>
	</div>
</c:if>
<c:if test="${param.login ne null}">
	<div class="row">
		<div class="col-md-12">
			<c:set var="loginRequiredMessage"><spring:message code="general.loginRequired"/></c:set>
			<c:import url="/WEB-INF/views/common/message.jsp">
				<c:param name="type" value="warning" />
				<c:param name="message" value="${loginRequiredMessage}" />
			</c:import>
		</div>
	</div>
</c:if>