package com.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
//import java.util.stream.Collectors;
//import java.util.*;


public class TypesOfFuncytionalInterfaces {
	
	public static int addOneToValue(int x) {
		return x+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Consumer
		Consumer<String> consumer = (c)->{
			String val="";
			for(int i=0;i<4;i++) {
				val+=c;
			}
			
			System.out.println("Value is " +val);
		};
		
		consumer.accept("Divya");
		
		
		
		//Supplier

		Supplier<String> supplier = ()->"This is the value from supplier";
		
		System.out.println(supplier.get());
		
		Supplier<String> supplier2 = ()-> UUID.randomUUID().toString();
		System.out.println("supplier 2    " +  supplier2.get());
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int sumEven=0;
		int sumOdd=0;
		for(Integer n: arrayList){
			if(n%2==0) {
				sumEven+=n;
			}
			else {
				sumOdd+=n;
			}
		}
		
		System.out.println("odd "+sumOdd);
		System.out.println("even "+ sumEven);
		
		//use streams api now
		arrayList.stream().forEach(x->System.out.println(x));
		arrayList.stream().filter(new Predicate<Integer>()
		{

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
			
		}).forEach(x->System.out.println(x));
		
		arrayList.stream().filter((n)->(n%2==0)).forEach(x->System.out.println(x));
		
		arrayList.stream().map((n)->addOneToValue(n)).forEach((n)->System.out.println(n));
		//System.out.println(arrayList.stream().map(n->  addOneToValue(n)).collect(Collectors.toList()));
		
		List<Person> personList = Arrays.asList(new Person(1, 29, "Sonu", "Delhi"), new Person(2, 25, "Ranu", "Godda"),
				new Person(1, 23, "Ana", "Manali"), new Person(2, 22, "Chandni", "Kashmir"),
				new Person(1, 25, "Sweety", "Shimla"), new Person(2, 21, "Rohit", "Srinagar"));
		
		System.err.println(personList.size());
		
		System.out.println(personList.stream().filter(x->x.getName().equals("Ranu")).findFirst());
		System.out.println(personList.stream().filter(x->x.getName().equals("Ranu")).findFirst().get().getName());
		
		Person person3 = new Person(100, -1, "Defaultt", "Default");
		Optional optional = Optional.of(person3);
		
		System.out.println(personList.stream().filter(x->x.getName().equals("Chan")).findFirst().orElse(person3));
		
		ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(10,202,30,40));
		System.err.println(arrayList2.stream().sorted(Collections.reverseOrder()).skip(1).findFirst());
		
		
		
		
		}

}
