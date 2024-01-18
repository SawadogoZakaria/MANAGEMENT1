package com.manage.Dto;

import org.springframework.stereotype.Component;

public class EmployeeDto {

	private int employeeId;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	/*
	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}*/
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public EmployeeDto(int employeeId, String employeeName, String address, int mobile) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.mobile = mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	private String employeeName;
	private String address;
	private int mobile;


}
