package Multithreading;

public class ThreadPriority  {
public static void main(String[] args) {

	
	Runnable r=() ->
	{
		System.out.println(Thread.currentThread().getName()+" is running"+" and priority is "+Thread.currentThread().getPriority());
		
	};
	
	 Thread t=new Thread(r);
	 t.setName("first thread");
	 Thread t1=new Thread(r);
	 t1.start();
	 t1.setPriority(Thread.MAX_PRIORITY);
	 t1.setName("second thread");
	 t.setPriority(Thread.MIN_PRIORITY);
	
	 // 1-10 priority
	 /*1---->min priority
	 10--->max priority
	 5---->normal priority*/
	 t.start();
	 
		System.out.println(Thread.currentThread().getName()+" is running"+"and priority is "+Thread.currentThread().getPriority());
		
}
}
