package com.sivalabs.login;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.contacts.Contact;

@Repository
@Transactional
public class LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public boolean isValidUser(String username, String password) throws SQLException
	{

		List<LoginBean> results = new ArrayList<LoginBean>();
		String hql = "FROM LoginBean E WHERE E.username = '"+username +"' and E.password = '"+password +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 results = query.list();
		for (LoginBean object : results) {
			System.out.println("Result :"+object);
			if(object.getUsername().equals(username) && object.getPassword().equals(password) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	/*Criteria criteria = sessionFactory.getCurrentSession().createCriteria(LoginBean.class);
		criteria.add(Restrictions.eq("username", username+"%"));
		criteria.add(Restrictions.eq("password", password+"%"));
		return criteria.list();*/
	
	/*String hql = "Select count(1) from USER_DETAILS where username = "+username+" and password = "+password;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List results = query.list();
		return results != null; */
	
	/*Query query = sessionFactory.getCurrentSession().createQuery("select count(1) from LoginBean where username = :username and password =:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		int result = query.executeUpdate();
		if(result>0)
			return true;
		else
			return false;*/
	/*String query = "Select count(1) from user_details where username = ? and password = ?";
			PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next())
					return (resultSet.getInt(1) > 0);
			else
					return false;*/

}
