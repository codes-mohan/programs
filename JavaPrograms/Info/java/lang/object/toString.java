package Info.java.lang.object;

public class toString {
	String name;
	int age;
	public toString(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	/*
	 default toString method is like following
	 
	 public String toString()
	 {
	 	return getClass.getName()+"@"+Integer.toHexString(hasCode());
	 	
	 		 }
	 */
	public String toString()
	{
		return name+"is "+age+"years old";
		
	}
	public static void main(String[] args) {
	toString t=new toString("mohan",21);
	
	System.out.println(t.hashCode());
	System.out.println(t.getClass());
	// since we have overriden the toString method we get same output for both followint statement
	
	System.out.println(t.toString());
	System.out.println(t);
	
}
}
