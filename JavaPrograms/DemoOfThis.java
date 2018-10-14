class sample {
	void getname() {
		System.out.println("in getname method calling by another method");
	}

	sample() {
		this("calles by another constructor");
	}

	sample(String s) {
		System.out.println(s);
	}

	void display() {
		this.getname();
	}
}

public class DemoOfThis {
	public static void main(String[] args) {
		
		sample s = new sample();
		s.display();
	}
}
