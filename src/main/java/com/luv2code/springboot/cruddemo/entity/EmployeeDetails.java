package com.luv2code.springboot.cruddemo.entity;

import lombok.Data;


@Data
public class EmployeeDetails {

	private String fName;
	
	private String lName;
	
	private String city;
	
	public EmployeeDetails(String firstName, String lastName, String county) {
		this.fName=firstName;
		this.lName=lastName;
		this.city=county;
	}
}
