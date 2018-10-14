package SpecialCase;

public class StaticControlFlow {

	static int i = 10;
	static {
		method();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		method();
		System.out.println("main method");
	}

	public static void method() {
		System.out.println(j);
	}

	static {
		System.out.println("second satic block");
	}
	static int j = 20;
}
