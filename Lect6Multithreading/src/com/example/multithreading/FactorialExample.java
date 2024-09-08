package com.example.multithreading;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class FactorialExample {
	static BigInteger factorial(int n) {
		BigInteger mul = BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		return mul;
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(100,2000,300,40000,50000);
		// TODO Auto-generated method st
		
		long startTime1=System.currentTimeMillis();
		list.parallelStream().map(n->{
			System.out.println(Thread.currentThread());
		return factorial(n); 
		}).forEach(x->System.out.println(x));
		
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1);
		
		
		
		long startTime=System.currentTimeMillis();
		list.stream().map(n->{
			System.out.println(Thread.currentThread());
			return factorial(n);
			}).forEach(n->System.out.println(n));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		

	}

}
