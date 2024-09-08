package com.examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsExamples {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,30,40,50,60);
		list.stream().filter(x->(x>50)).forEach((n)->System.out.println(n));
	
		list.stream().filter(x-> {
			System.out.println(x);
			return (x>50);
		}).forEach((y)->System.out.println(y));
		
		//short-circuting stop when find the result
		Optional<Integer> valOptional=    list.stream().filter(x->{
			System.out.println(x);
			return (x>=30);
		}).findFirst();
		
		//
		
		Optional objOptional = Optional.of("test");
		Optional objOptional2 = Optional.empty();
		if(objOptional.isPresent()) {
			System.out.println(objOptional.toString());
		}
		if(objOptional2.isPresent()) {
			System.out.println(objOptional2.toString());
		}
		else {
			System.out.println("null");
		}
		
		
		valOptional.ifPresent((x)->System.out.println(x));
		
		Optional objOptional3 = Optional.ofNullable(5);
		System.out.println(objOptional3.get());
		
		List<Integer> list2 = Arrays.asList(20,30,40,50,60);
		int min = list2.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		
		
		
	}

}
