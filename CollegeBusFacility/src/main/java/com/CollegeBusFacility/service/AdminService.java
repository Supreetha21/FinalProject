package com.CollegeBusFacility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.Register;
import com.CollegeBusFacility.model.User;



@Service
public interface AdminService {
	
	
	
	public List<User> showuser();
	public String Addbus(Bus bus);
	public String Adduser(User user);
	

	

}