package com.test;

//join is stop the current thread and wait to execute the other thread
//
public class ExampleJoin extends Thread {
	public void run()
	{ String name=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)// thread execute multiple time
		{
		try {
			System.out.println(name);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		}
	}
	public static void main(String[] args) {
		ExampleJoin t1=new ExampleJoin();
		ExampleJoin t2=new ExampleJoin();
		ExampleJoin t3=new ExampleJoin();
		t1.start();
		
		t2.start();
		try {
			t1.join(1500);//after t2 ,t1 is join
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
