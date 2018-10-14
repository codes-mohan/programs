
public class finallyDemo {
public static void main(String[] args) {
	try {
		System.out.println(7/0);
	}finally {
		System.out.println("finally block always executed \n whether the exception occured or not ");
	}
}
}
