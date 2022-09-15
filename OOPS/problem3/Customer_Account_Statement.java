package com.yash.traning.opps.homeAssignemnt.problem3;

public class Customer_Account_Statement
{
	int CAID, amount, deposit_withdrawl;
	String deposit_date;
	Customer CustId;
	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}
	public Customer_Account_Statement() {}
	public Customer_Account_Statement(int cAID, Customer custId, int amount, int deposit_withdrawl, String deposit_date) {
		super();
		CAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}
}
