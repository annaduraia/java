package com.javatpoint;
import javax.persistence.*;

@Entity
@Table(name="emp220")
public class Employee {  
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
private int employeeId;  
private String name,email;  
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address")
private Address address;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}  
}  
