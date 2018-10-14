import java.io.IOException;

// allows us to relate to one exception with another exception
// one exception describes the cause of another exception

public class ChainedException {

	static void divide(int a, int b) {
		if (b == 0) {
			ArithmeticException ae = new ArithmeticException();
			// set the underlying cause by invoking exception 
			ae.initCause(new IOException());
			throw ae;
		} else {
			System.out.println(a / b);
		}
	}

	public static void main(String[] args) {
		try {
		divide(5,0);
		}catch(ArithmeticException ae) {
			System.out.println("caught exceptio is : "+ae );
			System.out.println("actual cause is: "+ae.getCause());
			
		}
	}
}
