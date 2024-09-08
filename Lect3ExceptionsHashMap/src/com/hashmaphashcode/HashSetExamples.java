package com.hashmaphashcode;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashSetExamples {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hSet = new HashSet<>();
		hSet.add(12);
		hSet.add(13);
		hSet.add(14);
		
		Iterator<Integer> iterator = hSet.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println(integer);
		}
		
		for (Integer integer : hSet) {
			System.out.println(integer);
		}
		
		
	}

}
