//variable number of arguments
//we can call same method by any number of arguments 
public class VarArgsDemo {
	public static void method(int... x)
	{
	// void method(int ...x)
	// void mehod(int...x)
		System.out.println("var-args method");
}
public static final synchronized strictfp void main(String[] args) {
	
	method();
	method(12);
	method(1,5,1,4);
}
}
