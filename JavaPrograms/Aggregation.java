class student {
	String name;
	address a;
	

	student(String name, address a)
	{
		this.a=a;
		this.name=name;
	}
	void display()
	{
		System.out.println("Student name: "+name);
		System.out.println("Address: "+a.getAddress());
	}
	
	
}

class address {
	String address;
address(String a)
{
address=a;

}
public String getAddress() {
	return address;
}



}

public class Aggregation {
	public static void main(String[] args) {
		address a=new address("shimoga");
	
		student s=new student("mohan",a);
		s.display();

	}

}

