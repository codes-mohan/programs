package SpecialCase;
public class LambdaExpressionDemo{
	public static void main(String[] args) {
		Runnable r1=() ->
		{
			//System.out.println("first thread");
		};
		Runnable r2 =() ->
		{
			//System.out.println("second thread");
		};
		Thread t1=new Thread(r1);
		Thread t2 =new Thread(r2);
		t1.start();
		//t1.start(); ----->IllegalThreadStateException
		 //t2.start();
		t1.setPriority(4);
		t1.setName("thread");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		
	//	t1.setPriority(15); -------> IllegalArgumentException 
	}
}




/*class threadsample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
public class LambdaExpressionDemo {
public static void main(String[] args) {
	Thread t=new Thread(new threadsample());
	t.start();
}
}
*/