package Multithreading;
/*methods to prevent thread from execution
1. yield()
2. join()
3.sleep();*/

/*<-----yield()------->
1. pauses the current execution thread and provide the chance for remeining thread of same priority
2. if the waiting thread has low priority or if there is no waiting thread 
   then the same thread continue its execution.
3. if several waiting thread has same priority then we can't expect exact which thread will get chance for execution

*/
class yield extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class YieldDemo {
public static void main(String[] args) {
	yield t=new yield();
	t.start();
	yield t1=new yield();
	t1.start();
	
	
	
}
}
 