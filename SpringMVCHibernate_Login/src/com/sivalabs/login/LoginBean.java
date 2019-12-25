package com.sivalabs.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER_DETAILS")
public class LoginBean
{
		@Id
	//	/@GeneratedValue(strategy = GenerationType.AUTO)
		@GenericGenerator(name="anna" , strategy="increment")
		@GeneratedValue(generator="anna")
		private int id;
	
		@Column
		private String username;

		@Column
		private String password;

		
		public LoginBean() {
			
		}

		public LoginBean(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPassword()
		{
				return this.password;
		}

		public String getUsername()
		{
				return this.username;
		}

		public void setUsername(String username)
		{
				this.username = username;
		}

		public void setPassword(String password)
		{
				this.password = password;
		}


}
