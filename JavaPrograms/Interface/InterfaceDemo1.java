package Interface;

interface inter1{
	void show();
	
}
interface inter2{
	void show();
	
}

public class InterfaceDemo1 implements inter1,inter2{
public static void main(String[] args) {
	inter1 obj1=new InterfaceDemo1();
	inter2 obj2=new InterfaceDemo1();
	
	obj1.show();
	obj2.show();
}

@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("in method");
}
}
