package SpecialCase;
/*
 * once we created an object we can't perform any changes in the existing object
 * 
 * if we are trying to perform any changes with those changes a new object will be created
 * 
 * if there is no change in the content then existing object will be reused
 * 
 * this is called as immutability
 */


public class CreateImmutableObjects {
	private int i;
	CreateImmutableObjects(int i)
	{
		this.i=i;
	}
	private CreateImmutableObjects modify(int i)
	{
		if(this.i==i)
			return this;
		else
			return (new CreateImmutableObjects(i));
	}
public static void main(String[] args) {

CreateImmutableObjects c1=new CreateImmutableObjects(10);
CreateImmutableObjects c2=c1.modify(10);
CreateImmutableObjects c3=c1.modify(100);
if(c1.hashCode()==c2.hashCode())
	System.out.println("C1 and c2 are pointing to same object");
if(c2==c3);
System.out.println("c2 and c3 pointing to different objects");
}
}
