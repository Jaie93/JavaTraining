package com.yash.traning.opps.homeAssignemnt.problem11;

import java.util.Date;

public class Employee 
{
	int empid;
	String empname,empaddress;
	double empsalary; 
	Date emp_dob, emp_doj;
	public Employee() {}
	public Employee(int empid, String empname, String empaddress, double empsalary, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empsalary="
				+ empsalary + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
}
