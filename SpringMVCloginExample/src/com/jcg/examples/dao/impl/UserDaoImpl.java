package com.jcg.examples.dao.impl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.jcg.examples.dao.UserDao;


/**
 * @author CENTAUR
 */
public class UserDaoImpl implements UserDao
{

		DataSource dataSource;

		public DataSource getDataSource()
		{
				return this.dataSource;
		}

		public void setDataSource(DataSource dataSource)
		{
				this.dataSource = dataSource;
		}

		public boolean isValidUser(String username, String password) throws SQLException
		{
				String query = "Select count(1) from user_details where username = ? and password = ?";
				PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
				pstmt.setString(1, username);
				pstmt.setString(2, password);
				ResultSet resultSet = pstmt.executeQuery();
				if (resultSet.next())
						return (resultSet.getInt(1) > 0);
				else
						return false;
		}

		public boolean saveUser(String firstName, String lastName, String address, String age) throws SQLException {
			String query ="insert into REGISTRATION(firstname, lastname, address, age) values " +"(?,?,?,?)";
			PreparedStatement statement = dataSource.getConnection().prepareStatement(query);
			statement.setString(1, firstName);
			statement.setString(2, lastName); 
			statement.setString(3, address);
			statement.setString(4, age);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.rowInserted())
				return (resultSet.getInt(1)>0);
			else
				return false;
		}

}