package com.CollegeBusFacility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.CollegeBusFacility.service.LoginService;



@Controller
public class LoginController {
	@Autowired
	LoginService lr;
	
	
	@GetMapping(value="mlogin")
	public String showLoginPage(){
		return "login";
	}
	@GetMapping(value="adminlogin")
	public String showAdminLoginPage() {
		return "adminlogin";
	}
	@GetMapping(value="studentfaclogin")
	public String showstudentPage(){
		return "studentfaclogin";
	}
	
	@PostMapping("adminlogin")
	public String loginProcess(@RequestParam String userid,@RequestParam String password,Model m)
	{
		try {
		if(userid.equals("smmadmin")&&password.equals("smmadmin"))
		{
			return "adminhome";
		}
		else
			m.addAttribute("msg","Userid or password is incorrect");
		    return "adminlogin";
		}
		catch(Exception e) {
			return "adminlogin";
		}
	}
	
	
	
	
	@PostMapping("studentfaclogin")
	public String loginProcess1(@RequestParam String userid,@RequestParam String password,Model m)
	{
		try {
		if(userid.equals("smmstudent")&&password.equals("smmstudent"))
		{
			return "studentfachome";
		}
		else
			m.addAttribute("msg","Userid or password is incorrect");
		return "login";
		}catch(Exception e) {
			return "login";
		}
	}
	
	@GetMapping(value="register")
	public String showsregisterPage(){
		return "Register1";
	}
	
	
	
	
	
	

}
