package InnerClass;

public class Demo7 {
	class inner{
		void innermethod()
		{
			System.out.println("inner method");
		}
		
	}
	// better one
	void outermethod()
	{
		inner i=new inner();
		i.innermethod();
	}
public static void main(String[] args) {
	Demo7 d=new Demo7();
	d.outermethod();
}
}
