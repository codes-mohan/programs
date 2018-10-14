/*Use of assertions in code.*/

// Demonstrate assert.

//Assertion is a statement in java. It can be used to test your assumptions about the program.

//While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError. It is mainly used for testing purpose.

//Advantage of Assertion:

//It provides an effective way to detect and correct programming errors.
public class assertionDemo {
	static int value = 3;
 // Return an integer.
static int getnum() {
		return value--;
	}
	public static void main(String args[]) {
		int n;
		for(int i=0; i < 10; i++) {
			n = getnum();
		assert n ==0:"error";                             // will fail when n is 0
			System.out.println("n is " + n);
		}
	}
 }

