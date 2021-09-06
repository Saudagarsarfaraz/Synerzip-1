package com.synerzip.emp;

import org.springframework.beans.factory.annotation.Autowired;

import com.synerzip.add.Address;

public class Employee {
	private int empId;
	private String empName;
	@Autowired
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	

}
