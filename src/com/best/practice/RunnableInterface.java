package com.best.practice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started running...");
	}
	 
 }


public class RunnableInterface 
{
	public static void main(String[] args) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new ThreadDemo(), 0, 2,TimeUnit.SECONDS);
	}
}
