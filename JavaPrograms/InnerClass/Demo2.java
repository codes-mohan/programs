package InnerClass;

public class Demo2 {
	
	 
		static class inner{
			int a;    
			static int b;  // if inner class is not static, we cannot have static members
			public inner()
			{
				a=10;
				System.out.println(a);
				b=20;
			}
		}
	public static void main(String[] args) {
		System.out.println(inner.b);  //0
	}
	}


