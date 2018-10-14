class plant {
	String name;
	plant(String name){
		this.name=name;
	}
	void display()
	{
		System.out.println("method of parent called by chid");
	}
}

class childplant extends plant {
	String name;
	childplant(String parent, String child) {
		super(parent);   //accessing constructor of super class
		name=child;
	System.out.println("<--------in construcor---------->");
	System.out.println("parent: "+super.name+"\n"+"child: "+child);
	
	}

	void detaisl() {
		
		String name = "child plant";
		super.name = "parent plant"; //accessing parent variable
		System.out.println("<----------in method---------->");
		super.display(); //accesing parent method
		System.out.println("child: " + name +"\n" +"plant: " + super.name);
	}
}

public class superDemo {
	public static void main(String[] args) {
		childplant c=new childplant("parent","child");
		c.detaisl();
	}
}
