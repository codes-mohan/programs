//non static class inside the another class present outside the method------>inner member class

class outer{
	void method()
	{
		inner in=new inner();
		in.show();
	}
	class inner{
		public void show() {
			System.out.println("in inner class");
		}
	}
}
public class InnerMemberClass {
public static void main(String[] args) {
	outer outer=new outer();    //if we declare inner class as static we need not to do this
	//initialize as
	//outer.inner o=new outer.inner();
	//inner.show();
	outer.method();
}
}
