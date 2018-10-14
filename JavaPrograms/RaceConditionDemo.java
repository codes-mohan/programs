// multiple threads trying to access same resources at the same time
// we can overcome it by using synchronized blocks or synchronized methods
public class RaceConditionDemo {
public static void main(String[] args) {
	// only one printer so create only one object
	printer p=new printer();
	Runnable r1=() ->
	{
		p.printDoc("t1 data");
	};
	Runnable r2=() ->
	{
		p.printDoc("t2 data");
		
	};
	Runnable r3=() ->
	{
		p.printDoc("t3 data");
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t1.start();
	t2.start();
	t3.start();
	
}
}


class printer {
	synchronized public void printDoc(String data){
		for(int i=1;i<=3;i++) {
			System.out.println(data);
		}
	}
}