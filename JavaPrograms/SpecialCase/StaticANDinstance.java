package SpecialCase;

public class StaticANDinstance {
	StaticANDinstance ()
	{ /// executed after instance block
		System.out.println("constructor");
	}
	static
	{ // static block will be executed during class loading
		// static block will be executed before main
		System.out.println(" first static block");
	}
	{ // instance block will be called whenever the object is created
		// and before the constructor
		System.out.println("first instance block");
	}
	
	static {
		System.out.println("second static block");
	}
	{
		System.out.println("second instance block");
	}
public static void main(String[] args) {
	StaticANDinstance  o=new StaticANDinstance();
	
	System.out.println("main method");
}
}
