package InnerClass;



public class demo1 {
	static int a;  // if it is not static, we get errors
	static class inner{
		static int c;
		public static void method() {}
		public inner()
		{
			a=10;
		}
	}
public static void main(String[] args) {
	System.out.println(a);  //10
}
}
