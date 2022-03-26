package com.CollegeBusFacility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.CollegeBusFacility.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService la;

	@GetMapping("viewprofile")
	public String showviewPage(){
	return "viewprofile";
	}

	@GetMapping("enrollbusroute")
	public String showenrollbusPage() {
	return "enrollbusroute";
	}
	
	
	@GetMapping("payfees")
	public String showpayfeesPage() {
	return "payfees";
	}



}
