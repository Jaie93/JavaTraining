package com.yash.exception4;

public class Category {

	private int catid;
	private String categoryname;

	public Category() {

	}

	public Category(int catid, String categoryname) {
		super();
		this.catid = catid;
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Category [catid=" + catid + ", categoryname=" + categoryname + "]";
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
}
