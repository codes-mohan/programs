package Multithreading;

class MyThreadA extends Thread {
	public void run() {
		System.out.println("Thread A started");
		for (int i = 1; i <= 4; i++) {
			System.out.println("\t from thread A: i= " + i);

		}
		System.out.println("Exit from A");
	}
}

class MyThreadB extends Thread {
	
		public void run() {
		System.out.println("Thread B started");
		for (int j = 1; j <= 4; j++) {
			System.out.println("\t from thread A: j= " + j);

		}
		System.out.println("Exit from B");
	}
	
}

class MyThreadC extends Thread{
	public void run() {
		System.out.println("Thread C started");
		for (int k = 1; k <= 4; k++) {
			System.out.println("\t from thread C: k= " + k);

		}
		System.out.println("Exit from C");
	}

}

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThreadA A=new MyThreadA();
		MyThreadB B=new MyThreadB();
		MyThreadC C=new MyThreadC();
		
		C.setPriority(Thread.MAX_PRIORITY);
		
		B.setPriority(A.getPriority()+1);
		
		A.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Start thread A");
		A.start();
		
		System.out.println("start thread B");
		B.start();
		
		System.out.println("start thread C");
		C.start();
		
		System.out.println("end of main thread");

	}
}
