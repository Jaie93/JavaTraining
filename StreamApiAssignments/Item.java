package StreamApiAssignments;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class Item {

	int itemid; 
	String iname; 
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;

	
	
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}


	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getIname() {
		return iname;
	}


	public void setIname(String iname) {
		this.iname = iname;
	}


	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}


	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}


	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}


	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> items = new ArrayList<>();
		items.add(new Item(1,"sunscreen",LocalDateTime.of(2019, 02, 28, 14, 33, 48, 640000),LocalDateTime.of(2020, 02, 28, 14, 33, 48, 640000),200));
		items.add(new Item(1,"car seats",LocalDateTime.of(2019, 03, 24, 14, 33, 48, 640000),LocalDateTime.of(2021, 03, 28, 14, 37, 48, 640000),500));
		items.add(new Item(1,"water bottle",LocalDateTime.of(2019, 03, 28, 14, 33, 48, 640000),null,50));
		items.add(new Item(1,"dress",LocalDateTime.of(2019, 03, 28, 14, 33, 48, 640000),null,300));
		items.add(new Item(1,"mascara",LocalDateTime.of(2018, 03, 26, 14, 33, 48, 640000),LocalDateTime.of(2020, 03, 26, 14, 33, 48, 640000),200));
		items.add(new Item(1,"bleach",LocalDateTime.of(2019, 06, 28, 14, 33, 48, 640000),LocalDateTime.of(2021, 06, 28, 14, 37, 48, 640000),450));
		Double price = items.stream().collect(Collectors.averagingDouble(item->item.getPrice()));
		System.out.println("-------------1.Avarage price of items-----------"+price);
		System.out.println("-------------2.Item with highet price------------"+items.stream().max(Comparator.comparing( Item::getPrice )).get().iname);
		System.out.println("-------------3.Item with lowest price------------"+items.stream().min(Comparator.comparing( Item::getPrice )).get().iname);
		//System.out.println("-------------4.Item with no exp date and max price"+items.stream().filter(item->item.getDate_of_expiry().equals(null)).max(Comparator.comparing(item->item.getPrice())).get());
		System.out.println("-------------5.set of Item names------------"+(items.stream()).map(item->item.getIname()).collect(Collectors.toSet()));
		System.out.println("-------------6.set of item price------------"+(items.stream()).map(item->item.getPrice()).collect(Collectors.toSet()));
		System.out.println("-------------7.removing duplicate prices"+items.stream().map(item->item.getPrice()).distinct().collect(Collectors.toList()));
	}

}
