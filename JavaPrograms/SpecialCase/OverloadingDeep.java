package SpecialCase;

public class OverloadingDeep {
	public void display(double i,float j)
	{
		System.out.println("double float");
		
	}
	public void display(double i,double j)
	{
		System.out.println("double double");
		
	}
public static void main(String[] args) {
	OverloadingDeep o=new OverloadingDeep();
	o.display(10,20.0);
}
}
