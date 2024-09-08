package com.hashmaphashcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExamples {
	

	
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(null, null);
		map.put(1, "Sonu");
		map.put(2, "Ranu");
		map.put(3, "Mohit");
		map.put(3, "Sweety");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String > entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
 		}
		
		
		HashMap<Person, Boolean> hashMap = new HashMap<Person, Boolean>();
		Person person1 = new Person();
		person1.address = "Delhi";
		person1.age=29;
		person1.name = "Sonu";
		
		
		Person person2 =  new Person();
		person2.address = "Delhi";
		person2.age=29;
		person2.name = "Sonu";
		
		hashMap.put(person2, true);
		hashMap.put(person1, true);
		System.out.println(hashMap.toString());
		
		
		
	}

}
