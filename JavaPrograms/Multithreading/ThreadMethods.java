package Multithreading;

class ThreadA extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (i == 1)
				yield();
			System.out.println("\t from thread A:i= " + i);
		}
		System.out.println("exit from A");
	}
}

class ThreadB extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			if (j == 3)
				stop();
			System.out.println("\t from thread B:j= " + j);
		}
		System.out.println("exit from B");
	}
}

class ThreadC extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("\t from thread C:k= " + k);
			if (k == 1)
				try {
					sleep(1000);
				} catch (Exception e) {

				}

		}
		System.out.println("exit from C");
	}
}

public class ThreadMethods {
	public static void main(String[] args) {
		ThreadA A = new ThreadA();
		ThreadB B = new ThreadB();
		ThreadC C = new ThreadC();

		System.out.println("Thread A started");
		A.start();
		System.out.println("Thread B started");
		B.start();
		System.out.println("Thread C started");
		C.start();
		System.out.println("end of main");
	}
}
