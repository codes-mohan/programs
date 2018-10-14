public class ExceptionDemo
{
        public static void main(String []args)
        {
 		@SuppressWarnings("unused")
		int d,a;
		try {	//monitor a block of code
	        	d=0;
                	a=42/d;
			System.out.println("This will not be printed");
		}
		catch(ArithmeticException e)
		{
		//	System.out.println("Division by Zero");
			//System.out.println("Division by Zero."+e);
			//System.out.println("Division by Zero."+e.getMessage());
		e.printStackTrace();

		}
		
        }
}
