package SpecialCase;

public class FloatDivideByZero {
public static void main(String[] args) {
	// in float and double, there is no ArithmeticException for indeterminate form and divide by zero
	
	System.out.println(10/0f);  // infinity
	System.out.println(0/0f); // NaN
	System.out.println(0/0d); //NaN
}

}
