
public class checkedException {


	public static void main(String args[]) 
	{
		try {
			throw  new  ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("errors");
		}
	//	System.out.println("After throw");
	}
}


