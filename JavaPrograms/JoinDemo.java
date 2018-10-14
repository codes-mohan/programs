class mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		mythread t = new mythread();
		mythread t2 = new mythread();
		t.start();

//		t.join(); // t2 waits until t finishes
t.join(1000);  // waits for 1s and then t2 will join
		
		t2.start();

	}
}
