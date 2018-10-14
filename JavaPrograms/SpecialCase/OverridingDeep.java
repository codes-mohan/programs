package SpecialCase;
class parentclass{
	 void show()
	{
		System.out.println("super class");
	}
}


class childclass extends parentclass{
	
	/*void show()
	{
		// it is error we must put public   if parent method has public 
	}*/
	public void show()  // overrided
	{
		System.out.println("sub class");
	}
}
public class OverridingDeep {

	public static void main(String[] args) {
	parentclass p=new childclass();
	p.show();
}
}
