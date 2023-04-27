package com.test;

public class Thread2 implements Runnable {
	public void run()
	{
		System.out.println("thread running");
	}
	public static void main(String[] args) {
		Thread2 t2=new Thread2();
		Thread t3=new Thread(t2);
		t3.start();//thread method
	}

}
