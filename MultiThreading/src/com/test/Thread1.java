package com.test;
public class Thread1 extends Thread{
public void run()
{
	System.out.println("thread running");
}
	public static void main(String[] args) {
		System.out.println("main Running");
		Thread1 t1=new Thread1();
		t1.start();

	}

}
