package com.qapitol.threads;

public class Thread2 implements Runnable {
	
	public void run() {
		for (int i = 0; i<=15; i++) {
			System.out.println("Running Thread2 "+i+ " Thread Name-2:: "+Thread.currentThread().getName());
		}
	}

}
