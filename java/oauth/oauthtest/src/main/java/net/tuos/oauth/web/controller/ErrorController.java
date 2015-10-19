package net.tuos.oauth.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Controller
public class ErrorController {
	
	private static Logger logger = Logger.getLogger(ErrorController.class);

	@RequestMapping("/error")
	protected String handleError(Exception e, HttpServletRequest request) {
		logger.error(e.getMessage());
		Object obj = request.getAttribute("javax.servlet.error.status_code");
		logger.error("Server error code: " + obj);
		request.setAttribute("ERROR_MESSAGE", e.getMessage());
		return "error/error";
	}
	
	@ExceptionHandler(PermissionDeniedDataAccessException.class)
	protected String handlePermissionDenied(Exception e, HttpServletRequest request) {
		return handleError(e, request);
	}
	
	@ExceptionHandler(NullPointerException.class)
	protected String handleNullPointer(Exception e, HttpServletRequest request) {
		return handleError(e, request);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	protected String handleHandlerNotFound(Exception e, HttpServletRequest request, HttpServletResponse response) {
		return handleError(e, request);
	}
	
	@ExceptionHandler(NoSuchRequestHandlingMethodException.class)
	protected String handleRequestHandlingMethodNotFound(Exception e, HttpServletRequest request) {
		return handleError(e, request);
	}
	
	@ExceptionHandler(HttpMessageNotWritableException.class)
	protected String handle500(HttpMessageNotWritableException e, HttpServletRequest request) {
		return handleError(e, request);
	}
	
}
