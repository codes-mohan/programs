package SpecialCase;



public class CloneDemo implements Cloneable{
	String name;
	int age;
	
	CloneDemo(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
public static void main(String[] args) throws CloneNotSupportedException {
	CloneDemo c1=new CloneDemo("mohan",21);
	CloneDemo c2=(CloneDemo) c1.clone();
	
	System.out.println(c1.name+" "+c1.age);
	System.out.println(c2.name+" "+c2.age);
}
}
