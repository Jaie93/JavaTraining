package com.yash.exception4;

public class Item {
	private String item_name;
	private float price;
	private int maximum_no_of_item;
	private ItemBought item_bought;
	private Category category;

	public Item() {
		super();
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getMaximum_no_of_item() {
		return maximum_no_of_item;
	}

	public void setMaximum_no_of_item(int maximum_no_of_item) {
		this.maximum_no_of_item = maximum_no_of_item;
	}

	public Item(String item_name, float price, int maximum_no_of_item, ItemBought item_bought, Category category) {
		super();
		this.item_name = item_name;
		this.price = price;
		this.maximum_no_of_item = maximum_no_of_item;
		this.item_bought = item_bought;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [item_name=" + item_name + ", price=" + price + ", maximum_no_of_item=" + maximum_no_of_item
				+ ", item_bought=" + item_bought + ", category=" + category + "]";
	}

	public ItemBought getItem_bought() {
		return item_bought;
	}

	public void setItem_bought(ItemBought item_bought) {
		this.item_bought = item_bought;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
