class superclass{
	void show() {
		System.out.println("in super class");
	}
}
class subclass extends superclass{
	// method of super class doesnot declare exceptions
	//so during overriding , this method cannot declare checked exception
	// but it can declare unchecked exception
	void show() throws RuntimeException
	{
		throw new ArithmeticException();
		// unreachable code
		//System.out.println("in sub class");
	}
}


public class MethodOverridingANDExceptionHandling {
public static void main(String[] args) {
	superclass s=new subclass();
	s.show();
}
}
