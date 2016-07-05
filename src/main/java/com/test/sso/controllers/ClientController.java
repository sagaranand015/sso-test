/**
 * 
 */
package com.test.sso.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sanand5
 *
 */
@Controller
public class ClientController {

	@RequestMapping(value = "/test")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("this is the index page. Redirecting to google.com");
		
		return "redirect:https://google.com";
	}
	
}
