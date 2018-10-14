//for static and instance variable if those are not initialized then
	// jvm provides the default value for them.
	// but for final variables jvm doesn't provide default variable, we have to initialize them



public class FinalVariables {
	 int instancevar;  //this is instance variable , all modifiers are allowed 
	 							// which are allowed for variables
	 final int instancevar2;   // if instance variable is final we have to initialize at 
	 								//the place where they declared or in a instance block
	 {  // instance block
		 instancevar2=10;
	 }
	 
	 
	 static int staticvar;  // this is class variable, all modifiers which are allowed for 
	 							//variables are allowed here
	 
	 final static int staticvar2; // must initialize here or in static block
	 
	 static {  // static block
		 staticvar2=10;
	 }
	 
	
	
	
public static void main(String[] args) {
	int localvar1;   // this is local variable the only modifier for this is //final
	final int localvar2; //  if we don't initialize we don't get compile time error
	
	// jvm doesn't provide any default value for local variables
	// to print values we have to initialize them
	localvar1=50;
	System.out.println(localvar1);

}
}
