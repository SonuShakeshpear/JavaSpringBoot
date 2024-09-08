package com.examples.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExamples {
	public static int computeVal(int n) {
		System.out.println("current thread: "+ Thread.currentThread());
		return n*n+1;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Future<Integer> future ;
		// TODO Auto-generated method stub
	  int num=10;
	  ExecutorService esobj = Executors.newSingleThreadExecutor();
	  ExecutorService esobj1 = Executors.newFixedThreadPool(10);
	  future = esobj1.submit(()-> computeVal(num));
	  System.out.println(future.get());

	}

}
