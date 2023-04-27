/*package com.test;

public class TestDeadlock {

	public static void main(String[] args) {	
	
final String r1="Student";
final String r2="Teacher";
//t1 is try to lock r1 and r2
Thread t1=new Thread() {
public void run()
{
	Synchronized(r1)
	{
		System.out.println("Thread locked r1");
		try
		{
			t1.sleep(400);
		}catch(InterruptedException i)
		{
			i.printStackTrace();
		}
	}
	Synchronized(r2)
	{
		System.out.println("Thread locked r1");
		t1.sleep(400);
	}

}
};
Thread t2=new Thread() {
public void run()
{
	Synchronized(r1)
	{
		System.out.println("Thread locked r1");
		t2.sleep(4000);
	}
	Synchronized(r2)
	{
		System.out.println("Thread locked r1");
		t2.sleep(4000);
	}

}
};

t1.start();
t2.start();
}

	
}*/
