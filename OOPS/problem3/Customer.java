package com.yash.traning.opps.homeAssignemnt.problem3;

import java.util.Date;

public class Customer 
{
	int CustId, accountno;
	String custname, cust_address, cust_dob,cust_account_opening_date;
	Branch Branch_Obj;
	
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", Branch_Obj=" + Branch_Obj + "]";
	}
	public Customer() {}
	public Customer(int custId, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch branch_Obj) {
		super();
		CustId = custId;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		Branch_Obj = branch_Obj;
	}
	
}
