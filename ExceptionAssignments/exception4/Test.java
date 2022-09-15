package com.yash.exception4;

import java.util.*;

public class Test {

	public static void main(String[] args) throws ItemPurchaseLimitExceed {
		System.out.println("----------------Welcome To D-Mart-------------------");
		float bill =0;
		Scanner sc = new Scanner(System.in);
		List<Item> items = new ArrayList<>();
		System.out.println("Enter no of items you want to purchase");
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter item details(name,price,no of item bought,Item Bought,category)");
			Item item = new Item(sc.next(),sc.nextFloat(),sc.nextInt(),new ItemBought(sc.nextInt(),sc.nextInt()),
					new Category(sc.nextInt(),sc.nextLine()));
			items.add(item);
		}
		for (Item i :items)
		{
			if(i.getMaximum_no_of_item()>i.getItem_bought().getItemQtyLimit())
				throw new ItemPurchaseLimitExceed("You have exceeded item purchase limit");
			else
				bill = bill + (i.getPrice()*i.getMaximum_no_of_item());
		}
		System.out.println("total bill is:"+bill);
	}

}
