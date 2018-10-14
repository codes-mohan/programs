
public class ThreadSynchronization {
public static void main(String[] args) {
	mythread1 t1=new mythread1();
	t1.start();
	mythread1 t3=new mythread1();
	t3.start();
	mythread1 t2=new mythread1();
	t2.start();

}
}

class mythread1 extends Thread{
	synchronized public void run(){
		for(int i=0;i<2;i++){
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
