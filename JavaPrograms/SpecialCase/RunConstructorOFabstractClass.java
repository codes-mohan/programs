package SpecialCase;

abstract class abstractclass{
	abstractclass()
	{
		System.out.println("inside the constructor");
	}
}
public class RunConstructorOFabstractClass extends abstractclass {
public static void main(String[] args) {
	RunConstructorOFabstractClass obj=new RunConstructorOFabstractClass();
}
}

