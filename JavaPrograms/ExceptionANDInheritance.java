class parentclass{
	void show() throws ArithmeticException{
		System.out.println(7/0);
	}
}

class childclass{
	//here overriden method either can throw the same exception thrown by super class
	// or can throw no exception
	//but it must never throw object of exception class
	//or super class of exception thrown in super class
	void show() {
		
	}
}

public class ExceptionANDInheritance {
public static void main(String[] args) {
	parentclass p=new parentclass();
	p.show();
}
}
