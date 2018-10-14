// join methods used to make one thread wait till another thread completes its task
public class ThreadJOinDemo {
public static void main(String[] args) {
	thread1 t1=new thread1();
	thread2 t2=new thread2(t1);
	t1.start();
	t2.start();
	
}
}

class thread1 extends Thread{
	thread1(){
		super("first thread");
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class thread2 extends Thread{
	thread1 t1;
	thread2(thread1 t1){
		super("second thread");
		this.t1=t1;
	}
	public void run(){
		try {
			t1.join();
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
