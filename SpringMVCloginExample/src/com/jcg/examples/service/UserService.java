/**
 *
 */
package com.jcg.examples.service;

import java.sql.SQLException;

/**
 * @author CENTAUR
 *
 */
public interface UserService
{
	public boolean isValidUser(String username, String password) throws SQLException;

	public boolean saveUser(String firstName, String lastName,String address, String age) throws SQLException;
}
