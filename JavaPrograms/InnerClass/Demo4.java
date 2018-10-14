package InnerClass;
// method local inner class

public class Demo4 {
static int a=10;
public static void main(String[] args) {
	int b=20;
	class inner{
	
		public inner()
		{
			
			System.out.println(a); // if a is not static, it will give error
			System.out.println(b);
		}
	}
	inner n=new inner();
}
}
