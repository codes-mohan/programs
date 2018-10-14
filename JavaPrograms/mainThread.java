
public class mainThread {
public static void main(String[] args) {
	Thread thread=Thread.currentThread();
	System.out.println("<---------before modyfying------->");
	System.out.println("thread name: "+thread.getName());
	
	System.out.println("<-------after modyfying--------->");
	thread.setName("main thread");
	System.out.println("name of the thread: "+thread.getName());
	
}
}
