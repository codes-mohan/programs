package SpecialCase;
// subclass type referred to super class object

class superclass{
	
}
 
class subclass extends superclass{
	static void method(superclass s)
	{
		//if(s instanceof superclass) {
			
		subclass sub=(subclass)s;
		System.out.println("casting is done");
	}//}
}
public class DownCasting {
	public static void main(String[] args) {
	//	subclass o=new superclass(); // error
		
		superclass obj=new subclass();
		
		subclass.method(obj);
	}

}
