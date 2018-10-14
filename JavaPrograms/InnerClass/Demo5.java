package InnerClass;
class outer1{
	int a=10;
	private void show()
	{
		System.out.println("hello");
	}
	public void method()
	{
		int b=20;
		class inner{
			public inner()
			{
				show(); // method-local inner class can access private members of outer class
				System.out.println(b+" "+a);
			}
		}
		inner i=new inner();// if we won't write this, we get no output
	}
	
}
public class Demo5 {
public static void main(String[] args) {
	outer1 obj=new outer1();
	obj.method();
}
}
