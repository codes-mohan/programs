

// Demonstrate finally.

public class finallyDemo {
	@SuppressWarnings("finally")
	public static void main(String args[]) throws ClassNotFoundException {
		try {
			throw new ClassNotFoundException("demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
		// whatever may be the condition finally block will execute unless
		// System.exit() exits //or finally itself throws exception

		finally {
			System.out.println("hi");
			throw new ArithmeticException();

			// if we declare some statement here it will throw an error saying
			// unreachable statement
		}
	}
}
