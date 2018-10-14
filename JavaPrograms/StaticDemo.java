
public class StaticDemo {
public static void main(String[] args) {
	//static variables and methods can be accessed without creating the object of that class
	staticClass.i=14;
	System.out.println("value of static int i-->"+staticClass.i);
	
	staticClass.amethod();
	
	
}

}
//method with static variables and static methods
class staticClass{
	static int i;
	static void amethod(){
		System.out.println("in static method");
	}
}
