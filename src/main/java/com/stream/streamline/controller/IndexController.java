package com.stream.streamline.controller;

import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stream.streamline.model.LogInModel;
import com.stream.streamline.model.SignUpModel;
import com.streamline.service.impl.StreamlineServiceImpl;



@Controller
public class IndexController {
	

	private StreamlineServiceImpl service;
	
	@GetMapping("/")
	public String homepage() {
		return "login";
	}
	
	@RequestMapping("/signUp")
	public String signUp(){
		return "signUp";
	}
	
	@PostMapping(path="/logIn",produces=MediaType.TEXT_HTML_VALUE)
	public String registeration(@RequestBody SignUpModel signmodel) {
		/*String name = signmodel.getName();
		String DOB = signmodel.getDOB();
		String email = signmodel.getEmail();
		String password = signmodel.getPassword();*/
		
		System.out.println(signmodel);
		service.addUser(signmodel);
		return "logIn";
	}

	@PostMapping("/home")
	public String logIn(@RequestBody LogInModel loginmodel )
	{
		
		String email = loginmodel.getEmail();
		String passwd = loginmodel.getPassword();

		System.out.println(loginmodel);
		
		return "index";
	}
}