package SpecialCase;

class Address {
	String city;
	int zipcoode;
	Address(String city,int zipcode)
	
	{
		this.city=city;
		this.zipcoode=zipcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcoode=" + zipcoode + "]";
	}
	
}

class Employees {
	String name;
	int age;
	Address a;

	Employees(String n, int ag, Address ad) {
		name = n;
		age = ag;
		a = ad;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + a.toString();
	}

	
}

public class AggregationDemo {
	public static void main(String[] args) {
		Address obj=new Address("tth",577432);
		Employees e = new Employees("mohan",21,obj);
		System.out.println(e.toString());
		
	}

}