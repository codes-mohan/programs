package Multithreading;
class join extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			try
			 {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class JoinDemo {
public static void main(String[] args) throws InterruptedException {
	join t=new join();
	t.start();
	  // main method will wait until this thread is completed its execution
	
	for(int i=0;i<5;i++)
	{
		System.out.println(t.isAlive());
		Thread.sleep(2000);
		System.out.println("main");
	}
}
}
