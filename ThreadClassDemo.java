package Test100;

class MyThread1 extends Thread
{
	MyThread1()
	{
		super("Using Thread Class");
		System.out.println("Child thread: "+this);
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child thread: "+i);
				
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{  }
			
		System.out.println("Exiting child thread:");
		
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		
		new MyThread1();
		
		try
		{
			for(int k=5;k>0;k--)
			{
				System.out.println("Runnable main thread: "+k);
				
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{ }
		
		System.out.println("Exiting main thread:");

	}

}

