package com.test;
//sleep method
//sleep method is going to holt the current thread execution 
//
public class Thread3 extends Thread {
public void run()
{
	String name=Thread.currentThread().getName();//predefined method
	System.out.println(name);
}
	public static void main(String[] args) {
		Thread3 t1=new Thread3();
		Thread3 t2=new Thread3();
		Thread3 t3=new Thread3();
		/*t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");*/
		t1.start();//start thread
		try {
			t1.sleep(2000);//it throwing interrupted exception
			//and here handle the exception
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		t3.start();
	}

}
