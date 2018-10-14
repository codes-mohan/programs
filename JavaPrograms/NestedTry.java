// Nested try block is used when a part of a block may cause one error 
//while entire block may cause another error
public class NestedTry {
public static void main(String[] args) {
	try //entire block causing error
	  {
	   int arr[]={5,0,1,2};
	   try
	   {     // part of block causes error
	    @SuppressWarnings("unused")
		int x=arr[3]/arr[1];
	   }
	   catch(ArithmeticException ae)
	   {
	    System.out.println("divide by zero");
	   }
	   arr[4]=3;
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	   System.out.println("array index out of bound exception");
	  }
	 }
	}
