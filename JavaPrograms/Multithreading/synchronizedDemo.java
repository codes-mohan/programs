package Multithreading;
class syncthread extends Thread {
	public synchronized void run() {
		System.out.print("[");
	
		System.out.println("]");
	}
}

public class synchronizedDemo {
public static void main(String[] args) {
	syncthread t=new syncthread();
	t.start();
	syncthread t1=new syncthread();
	t1.start();
}
}
