//best practice is to handle the exception in main


public class throwsDemo {
	static void method()
	{
		try {
		throw new ArithmeticException();
		
	}catch(ArithmeticException e) {
		System.out.println("exception caught in method");
	}
		
	}
public static void main(String[] args) {
	method();
}
}


/*

public class throwsDemo {
	static void method()
	{
		throw new ArithmeticException();
	}
public static void main(String[] args) {
	try {
		method();
	}catch(ArithmeticException e) {
		System.out.println("exception caught in main");
	}
}
}


*/