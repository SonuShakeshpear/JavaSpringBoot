package com.examples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3);
		List<List<Integer>> list2 = Arrays.asList(list, Arrays.asList(4,5,6));
		System.out.println(list2);
		List<Integer> list3=   list2.stream().flatMap(x->x.stream()).toList();
		System.out.println(list3);
		
		List<Integer> list4 = list2.stream().flatMap(x->{
			
			System.out.println(x);
		return x.stream();
		}).toList(); 
		
		
		
		
	}

}
