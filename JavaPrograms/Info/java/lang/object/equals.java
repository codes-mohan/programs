package Info.java.lang.object;
/*
 * we can use equals method to check equivalence of two objects
 * 
 *  if we don't override equals method in our class then Object class equlas mehod will be called
 *  which is always meant for referencce comparision
 *  i.e if two references pointing to same object then only equals method returns true
 	when we override the equals method it will compare based on content of object
 	
 */


public class equals {
	String name;
	int age;
	public equals(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	/*
	 * Object class equals method is meant for reference level comparision
	 * which is implpemented as fallows
	 * 
	 * public boolean equals(Object obj)
	 * {
	 * 	return(this==obj);
	 * }
	 */
	
	// efficient way of using equals method
	
	public boolean equals(Object o)
	{
		if(this==o) // if both references pointing to same same object return true
					// so that further comparision will be reduced and perormance increased
			return true;
		if(o instanceof equals)
		{
			equals e2=(equals)o;
			String name1=e2.name;
			int age1=e2.age;
			if(name.equals(name1) && age==age1)
				return true;
			else
				return false;
		}
		return false;
	}
	
/*	public boolean equals(Object obj)
	{	try {
		String name1=this.name;
		int age1=this.age;
		equals e2=(equals) obj;
		String name2=e2.name;
		int age2=e2.age;
		if(name.equals(name2) && age==age2 )
			return true;
		else
			return false;
	}catch(ClassCastException c)
	{
		// if we are passing different types of objects
		// instead of throwing exception we return false
		return false;
	}
	catch(NullPointerException e1)
	{
		// if we are passing null arguments we retun false
		return false;
	}
	}*/

	
public static void main(String[] args) {
	equals e1=new equals("mohan",21);
	equals e2=new equals("mohan",21);
	equals e3=new equals("mohan",21);
	equals e4=new equals("mohan",21);
	// e1=e2;
	 //System.out.println(e1==e2);
	System.out.println(e1.equals(e2));
	
	
	



}
}

    