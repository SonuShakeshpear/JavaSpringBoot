package com.examples.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class Example2 {
	public static int computeVal(int n) {
		System.out.println("current thread: "+ Thread.currentThread());
		return n*n+1;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Future<Integer> future ;
		// TODO Auto-generated method stub
	  int num=10;
	  ExecutorService esobj = Executors.newSingleThreadExecutor();
	  ExecutorService esobj1 = Executors.newFixedThreadPool(10);
	  future = esobj.submit(()-> computeVal(num));
	  System.out.println(future.get());
	  System.out.println("is done "+ future.isDone());
	  
	  //list.stream().map(n->esobj1.submit(()->computeVal(n))).forEach(x->System.out.println(x));
	  list.stream().forEach(n->esobj1.submit(()->computeVal(n)));
	  
	  
	  
	  
	  
	  
	  esobj.shutdown();

	}

}

