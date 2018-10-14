class Superclas{
	int x;
	Superclas(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("super class value= " +x);
	}
}
class Subclas extends Superclas{
	int y;
	Subclas(int x,int y) {
		super(x);
		this.y=y;
	}
	
	@Override
	void display()
	{
		System.out.println("sub class value= "+y);
		System.out.println("super class value= "+x);
	}
	
}
public class OverrideTest {
public static void main(String[] args) {
	Subclas s=new Subclas(10,20);
	
	s.display();
	Superclas s1=new Superclas(40);
	s1.display();
	
}
}
