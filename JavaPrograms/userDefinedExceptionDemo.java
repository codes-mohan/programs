// Demonstrate Userdefined Exception

class AgeLimitException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	AgeLimitException(String msg)
	{
		super(msg);
	}
}

public class userDefinedExceptionDemo
{
	public static void main(String []args)
	{
		int age;

		try {
			age = 40;
			if(age>30)
				throw new AgeLimitException("Age should be less than 30");
		} catch(AgeLimitException e)
		{
			System.out.println(e);
		}
	}
}
