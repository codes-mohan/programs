// another way

public class userDefinedException{
	public static void main(String[] args) {
		try {
			throw new MyException("Exception handled");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

@SuppressWarnings("serial")
class MyException extends Exception{
	String msg;
	
MyException(String msg){
	this.msg=msg;
}
	@Override
	public String toString() {
		return msg;
	}
	
}


/*//another type
public class userDefinedException{
	public static void main(String[] args) throws MyException {
		throw new MyException(); // we can also put try-catch
	}
}


@SuppressWarnings("serial")
class MyException extends Exception{
	
}

*/
/*   one type

 
public class userDefinedException {
public static void main(String[] args) {
try {
	throw new MyException("my exception");
} catch (MyException e) {
	// TODO Auto-generated catch block
	System.out.println("Exception handled");
}
}
}

@SuppressWarnings("serial")
class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}
*/