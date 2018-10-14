package Multithreading;

// this is recommonded because we can extend some other classes in addition to Thread class
// we can apply functional programming
public class ImplementsThread implements Runnable
{
public static void main(String[] args) {
	Thread t=new Thread(new ImplementsThread());
	t.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("in run method");
}
}
