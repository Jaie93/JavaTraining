package com.yash.collection;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSortingAccKey {

			static Map<String, Integer> map = new HashMap<>();

			public static void sortbykey()
			{
			TreeMap<String, Integer> sortAccKeys
					= new TreeMap<>(map);

				for (Map.Entry<String, Integer> entry :
					sortAccKeys.entrySet())
					System.out.println("Key = " + entry.getKey()
									+ ", Value = "
									+ entry.getValue());
			}

			public static void main(String args[])
			{
				map.put("Jaie", 80);
				map.put("Piyush", 90);
				map.put("Tanmay", 80);
				map.put("Sunidhi", 75);
				map.put("Monika", 40);

				sortbykey();
			}
		}

