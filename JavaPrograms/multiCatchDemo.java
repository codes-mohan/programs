public class multiCatchDemo {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			@SuppressWarnings("unused")
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide By 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds : " + e);
		}

		System.out.println("After try/catch blocks");
	}
}
/*
Run this program as follows:

==> java MultiCatch   ---->it will throw ArithmaticException

==> java MultiCatch test  --->it will throw ArrayIndexOutOfBoundsException
since a=1;
since we have passed the argument as test

*/