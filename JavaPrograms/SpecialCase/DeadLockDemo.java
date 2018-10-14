package SpecialCase;

public class DeadLockDemo {
public static void main(String[] args) {
	System.out.println("main starts......");
	Object obj1=new Object();
	Object obj2=new Object();
	Runnable r1=() ->
	{
		synchronized (obj2)
		{
			System.out.println("thread1 acquire the lock of obj1");
			System.out.println("thread1 waiting to acquire the lock of obj2");
		}
		synchronized (obj1)
		{
			System.out.println("thread1 acquired lock of obj1");
		}
	};
	Runnable r2=() ->
	{
		synchronized (obj2)
		{
			System.out.println("thread2 acquire the lock of obj1");
			System.out.println("thread2 waiting to acquire the lock of obj2");
		}
		synchronized (obj1)
		{
			System.out.println("thread2 acquired lock of obj1");
		}
	};
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
System.out.println("main ending.........");
}
}
