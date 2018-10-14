package InnerClass;

class outerclass{
	int x=10;
	static int y=10;
	public void method()
	{
		int z=10;
		class inner{
			public void show()
			{
				System.out.println(z);
				System.out.println(x+" "+y);
				
			}
			public void sum(int i,int j)
			{
				
				System.out.println(i+j);
			}
		}
		
		// access this class only inside method
		
		inner i=new inner();
		i.sum(10, 20);
		i.sum(100,500);
		i.sum(500, 500);
		i.show();
	}
	
}
public class MethodLocalInnerClass {
public static void main(String[] args) {
	outerclass obj=new outerclass();
	obj.method();
}
}
