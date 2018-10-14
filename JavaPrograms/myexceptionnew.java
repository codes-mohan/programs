
public class myexceptionnew  {
public static void main(String[] args) throws exceptionthis {
	throw new exceptionthis("errror");
}
}
class exceptionthis extends Exception{
	public exceptionthis(String msg)
	{
		System.out.println(msg);
	}
}