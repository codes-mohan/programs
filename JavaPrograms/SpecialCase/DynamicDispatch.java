package SpecialCase;

class SuperCls{
	void Method()
	{
		System.out.println("Super Method");
	}
	
}

class SubCls extends SuperCls{
	@Override
	void Method()
	{
		System.out.println("Subclass method");
	}
}

public class DynamicDispatch {
public static void main(String[] args) {
	SuperCls s=new SubCls();
	s.Method();
}
}
