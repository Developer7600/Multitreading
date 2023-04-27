package com.test;

public class Customer {
int amount=1000;
void withdrow(int amount)
{
	System.out.println("withdrow");
	if(this.amount<amount)
	{
		System.out.println("less balance waiting for deposit");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.amount-=amount;
		System.out.println("withdrow completed");
	}
}

void deposit(int amount)
{
System.out.println(" deposit");
this.amount+=amount;
System.out.println("deposit completed");
notifyAll();
}
}
class Test
{
	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread() {
			public void run()
			{
				c.withdrow(3000);
			}
			}.start();
		new Thread() {
		public void run()
		{
			c.deposit(6000);
		}
		}.start();
	}
}
