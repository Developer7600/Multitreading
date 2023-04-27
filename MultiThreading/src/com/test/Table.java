package com.test;
//without sysnchrinization
public class Table {
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(n*i);	
		}
	}

}
class MyThread extends Thread{
     Table t1;

	MyThread(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.printTable(5);
	}
}
class MyThread1 extends Thread{
	Table t1;

	MyThread1(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.printTable(2);
	}
}
class MyThread2 extends Thread{
	public static void main(String[] args) {
		Table t=new Table();
		MyThread m1=new MyThread(t);
		MyThread1 m2=new MyThread1(t);
		m1.start();
		m2.start();
		
	}
}
