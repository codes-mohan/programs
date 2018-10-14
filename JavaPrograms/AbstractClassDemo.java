abstract class parentabstact{
	abstract void abstractmethod();  //abstract method can never have  a bodt

void concretemethod()
{
	System.out.println("in concrete method");
}
}
class childabstract extends parentabstact{

	@Override
	void abstractmethod() {
		super.concretemethod();
		System.out.println("in abstract method");
		
	} //we have to make class this abstract if we won't override unimplemented method
	
}
public class AbstractClassDemo {
public static void main(String[] args) {
	childabstract c=new childabstract();
	c.abstractmethod();
}
}
