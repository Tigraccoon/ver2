package com.sj.ver2.Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sj.ver2.Service.LoginService;

@Controller
@RequestMapping("/*")
public class SurveyController {

	@Inject
	LoginService loginService;
	
	@RequestMapping("login.go")
	public String loginGo() {
		
		return "etc/Login";
	}
	
	
}
