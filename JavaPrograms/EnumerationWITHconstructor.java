enum person {
	mohan(22), amit(23), sukumar(23);
	private int age;

	person(int age) {
		this.age = age;

	}

	int getage() {
		return age;
	}

}

public class EnumerationWITHconstructor {
public static void main(String[] args) {
	System.out.println("age of "+person.mohan+" is "+person.mohan.getage());
}
}
