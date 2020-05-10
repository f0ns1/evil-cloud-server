package com.evil.cloud.server.evilserver.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ApplicationController {
	
	//@Autowired
	//private AppService appservice;
	
	@RequestMapping("/login.html")
	public String getLoginPage() {
		System.out.println("Login.html .... application");
		return "login";
	}

}
