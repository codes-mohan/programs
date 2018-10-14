package SpecialCase;

public class CovarientReturnType extends parentclass {
	public CovarientReturnType get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}


	public static void main(String args[]) {
		new CovarientReturnType().get().message(); 
		// we can do this only if main is in child class
	}
}

class ParentClass {
	public ParentClass get() {
		return this;
	}
}
