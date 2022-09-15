package com.yash.exception4;

public class ItemBought {
	private int itemId;
	private int itemQtyLimit;

	public ItemBought() {
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getItemQtyLimit() {
		return itemQtyLimit;
	}


	public void setItemQtyLimit(int itemQtyLimit) {
		this.itemQtyLimit = itemQtyLimit;
	}


	@Override
	public String toString() {
		return "ItemBought [itemId=" + itemId + ", itemQtyLimit=" + itemQtyLimit + "]";
	}


	public ItemBought(int itemId, int itemQtyLimit) {
		super();
		this.itemId = itemId;
		this.itemQtyLimit = itemQtyLimit;
	}

	
	
}
