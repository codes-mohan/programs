package Multithreading;
 /*multithreading
  executing several tasks at the same time simultaneously,
  where tasks are independent part of the same program(thread)
  
  if multiple threads are waiting to execute then which thread will execute
  first is decided by thread scheduler which is a part of JVM
*/
/*
 *  advantages
 *    to implement multimedia graphics 
 *    to develop animations
 *    to develop video games
 *    to develop web and application servers
 *    
 *     to improve the performance of the system by reducing responce time
 */

/*this is not recommonded, because here we have to extend Thread class
and there is no chance to extend any other class
and hence we are missing the inheritance benifits*/

public class ExtendingThreadDemo extends Thread {
	
	public void run()
	{  // if we won't override this method, there will be no output
		System.out.println("in run method");
	}
	public void start()
	{
		
		super.start(); // if we won't add it, run method will never be called
		// and entire output will be produced b main thread
		// it is not good practice to override start method
		System.out.println("in start method");
	}
	
public static void main(String[] args) {
	 ExtendingThreadDemo t=new  ExtendingThreadDemo();
	 
	 t.start();  // it will create new thread which is responsible for execution of run()
	//  t.run(); // it won't create new thread, it's normal method calling
	 
}
}
