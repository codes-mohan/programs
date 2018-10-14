class thread1 extends Thread{
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("first thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}


class thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("second thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class MultiThreadDemo {
public static void main(String[] args) throws InterruptedException {

	thread1 t1=new thread1();
	Thread t2=new Thread(new thread2());
	t1.start(); 
	
	
		t2.start();
	/*
	System.out.println("<-----properties of first thread------->");
	System.out.println("\n");
	System.out.println("name: "+t1.getName());
	System.out.println("priority: "+t1.getPriority());
	t1.setName("first thread");
	System.out.println("name after modyfying: "+t1.getName());
	System.out.println(t1.isAlive());
*/
}
}
