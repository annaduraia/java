package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.UserService;

public class RegistrationDelicate {

	private UserService userService;

	public UserService getUserService()
	{
			return this.userService;
	}

	public void setUserService(UserService userService)
	{
			this.userService = userService;
	}

	public boolean saveUser(String firstName, String lastName,String address, String age) throws SQLException
	{
		return userService.saveUser(firstName, lastName, address, age);
	}
}
