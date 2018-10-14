
public class derivedClassReferenceInTheBaseClassVariable {
public static void main(String[] args) {
	vehicle vehicle=new car();
	vehicle.message();
}
}

class vehicle{
	void message()
	{
		System.out.println("vehicle message");
	}
}

class car extends vehicle{
	void message(){
		System.out.println("car message");
	}
}
