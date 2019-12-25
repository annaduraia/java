package com.jcg.examples.dao;

import java.sql.SQLException;

/**
 * @author CENTAUR This interface will be used to communicate with the Database
 */
public interface UserDao {
	public boolean isValidUser(String username, String password) throws SQLException;

	public boolean saveUser(String firstName, String lastName, String address, String age) throws SQLException;
}
