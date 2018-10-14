package Multithreading;


class circle{
	float radius=0.0f;
	synchronized void output() throws InterruptedException
	{
		System.out.println("output method invoked for displaying area of circle.........");
		if(radius==0.0)
		{
			System.out.println("waiting for input radius....");
			wait();
			
		}
	System.out.println("Area= "+3.142*radius*radius);
	}
	
	synchronized void input(float r)
	{
		System.out.println("inputting radius.....");
		radius=r;
		System.out.println("radius value received........");
		notify();
		
	}
	
}


public class InterThreadCommunication {
public static void main(String[] args) {
	final circle c =new circle();
	
//************anonymous classes******************************//	
	
	new Thread()
	{
		public void run()
		{
			try {
				c.output();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.start();
	
/************************************************************************/
	
	
	new Thread()
	{
		public void run()
		{
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.input(15.24f);
		}
	}.start();
	

/**************************************************************************/

}
}
