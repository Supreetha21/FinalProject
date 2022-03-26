package com.CollegeBusFacility.service;

import org.springframework.stereotype.Component;

@Component
public interface LoginService {
	public boolean validateAdmin(String userid,String password);

	boolean validatestudent(String userid, String password);

}
