package com.yash.traning.opps.homeAssignemnt.problem3;

public class Branch 
{
	int branch_id;
	String branch_name, branch_address;
	public Branch() {}
	public Branch(int branch_id, String branch_name, String branch_address) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ "]";
	}
}
