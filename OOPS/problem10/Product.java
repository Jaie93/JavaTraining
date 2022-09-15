package com.yash.traning.opps.homeAssignemnt.problem10;

public class Product implements Cloneable
{
	public Product(int pid, int price, int unitOfMeasurement, String pname) {
		super();
		this.pid = pid;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
		this.pname = pname;
	}
	private int pid, price,unitOfMeasurement;
	private String pname; 
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(int unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

/*	public Product clone() throws CloneNotSupportedException
	{
		return (Product) super.clone();
		
	}
*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", unitOfMeasurement=" + unitOfMeasurement + ", pname="
				+ pname + "]";
	}
	
}
