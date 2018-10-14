class outerClass {
	
	public void message()
	{
		System.out.println("method");
	}
class innerClass {
		public innerClass() {
			System.out.println("in inner class constructor");
		}
	}
}

public class inheritInnerClass1 extends outerClass.innerClass{
	
	
	
	public inheritInnerClass1(outerClass oc){
		oc.super();
	
}

	public static void main(String[] args) {
		
		outerClass oc=new outerClass();
		@SuppressWarnings("unused")
		inheritInnerClass1 iic=new inheritInnerClass1(oc);
		
	
}}




