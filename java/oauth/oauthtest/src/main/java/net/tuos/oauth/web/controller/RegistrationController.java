package net.tuos.oauth.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(
			final HttpServletRequest request,
			final ModelMap model) {
		
		return "index";
	}
	
}

