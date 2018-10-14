class base{
	void method() {
		System.out.println("base method");
	}
	
}

class child extends base{
	void method()
	{
		System.out.println("child method");
	}
	
}

public class InheritanceDemo {
public static void main(String[] args) throws InterruptedException {
/*
base b=new base();
child c=new child();
b=c;   // upcasting
b.method();
*/
/*
	base b=new child();
    child c=(child)b;
    c.method();
	*/
	base b=new base();
	child c=new child();
	System.out.println("sleeping......");
	//Thread.sleep(30*10*5000);
	System.out.println("ended");
}
}
