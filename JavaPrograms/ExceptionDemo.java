import java.io.IOException;
class test1{
	public static  void method() throws MyException
	{
		throw new MyException("errror!!");
	}
}
public class ExceptionDemo {
public static void main(String[] args) throws MyException {
int a=10;
int b=8;
test1.method();

}	
	
	
}
	
	class MyException extends Exception{
		MyException(String msg)
		{
			super(msg);
		}
	}
	
/*}
@SuppressWarnings("finally")
public static void main(String[] args) {
	try {
	throw new IOException();
	//in checked exception throws keyword is must
	}
	finally {
		// for  unchecked exception throws keyword is not required 

	try {
	System.out.println(4/0);

	} 
}*/

