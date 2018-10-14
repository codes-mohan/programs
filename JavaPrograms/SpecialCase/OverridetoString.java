package SpecialCase;

public class OverridetoString {
	public static class Student 
	{
	    private String studentname;
	    private int studentage;
	    Student(String name, int age)
	    {
	         this.studentname=name;
	         this.studentage=age;
	    }
	    @Override
	    public String toString() {
	       return "Name is: "+this.studentname+" & Age is: "+this.studentage;
	    }
	}
	
	public static void main(String[] args) {
		OverridetoString.Student o=new OverridetoString.Student("mohan", 21) ;
		System.out.println(o);
	}
}
