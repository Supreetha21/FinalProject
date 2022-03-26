package com.CollegeBusFacility.serviceimpl;

import org.springframework.stereotype.Component;

import com.CollegeBusFacility.service.LoginService;
@Component
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean validateAdmin(String userid, String password) {
		
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean validatestudent(String userid, String password) {
		
		// TODO Auto-generated method stub
		return false;
	}
}
