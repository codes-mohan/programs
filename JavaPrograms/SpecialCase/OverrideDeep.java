package SpecialCase;
class parentcls{
	private void show()
	{
		System.out.println("super class");
	}
}
class childcls extends parentcls{
	public void show()
	{
		System.out.println("child class");
	}
}
public class OverrideDeep {
public static void main(String[] args) {
	parentcls p=new childcls();
	p.show();
}
}
