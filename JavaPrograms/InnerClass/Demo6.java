package InnerClass;

public class Demo6 {
	class inner{
			void show()
			{
				System.out.println("inner class");
			}
	}
public static void main(String[] args) {
	Demo6 o=new Demo6();
	inner obj=o.new inner();
	
	// or
	//  inner obj=new Demo6.new inner().show();
	obj.show();
}
}
