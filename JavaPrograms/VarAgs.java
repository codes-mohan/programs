
public class VarAgs {
	
	public static void WelcomeMsg(String...name)
	{
		for(String value:name)
		{
			System.out.println("Welcome "+value);
		}
		
	}
public static void main(String[] args) {
	WelcomeMsg("mohan","amit","sukku");
}
}
