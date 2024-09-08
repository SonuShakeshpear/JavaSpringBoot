package com.example.multithreading;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FactorialThreading {
	static BigInteger factorial(int n) {
		BigInteger mul = BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		return mul;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000);
		//FactorialThreading factorialThreading = new FactorialThreading();
		MyThread[] thread = new MyThread[list.size()];
		//Thread[] arr = new Thread[list.size()];
		
		FactorialThreading obj = new FactorialThreading();
		IntStream.range(0, list.size()).forEach(i -> {
			thread[i] = obj.new  MyThread(list.get(i));
			thread[i].start();
		});
		
		
		
		Arrays.stream(thread).forEach(x-> {
			try {
				x.join();
				System.out.println(x.result);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		});
		 

	}
	
	public class MyThread extends Thread{
		private int num;
		private BigInteger result;
		
		public MyThread(int num) {
			this.num=num;
			this.result=BigInteger.ONE;
		}

		@Override
		public void run() {
			calculate(this.num);
		}

		private BigInteger calculate(int num) {
			System.out.println("Thread"+ Thread.currentThread().getName());
			for (int i = 1; i <=num; i++) {
				this.result= this.result.multiply(BigInteger.valueOf(i));
				
			}
			
			return result;
		}
		
		
	}

}
