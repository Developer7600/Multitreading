package com.test;

//
public class ExamplePriority extends Thread {
	public void run()
	{
		System.out.println("inside the run method");
	}
	public static void main(String[] args) {
		ExamplePriority t1=new ExamplePriority();
		ExamplePriority t2=new ExamplePriority();
		ExamplePriority t3=new ExamplePriority();
		System.out.println("priority thread:"+t1.getPriority());
		System.out.println("priority thread:"+t2.getPriority());
		System.out.println("priority thread:"+t3.getPriority());
		//set priority
		t1.setPriority(6);
		t2.setPriority(7);
		t3.setPriority(10);
		//get priority
		System.out.println("priority thread:"+t1.getPriority());
		System.out.println("priority thread:"+t2.getPriority());
		System.out.println("priority thread:"+t3.getPriority());
	}
}
