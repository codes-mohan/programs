package Info.java.lang.object;

/*
 *  the process of creating exactly duplicate object is called cloning
 *  main objective of this is to maintain backup
 *  we can perform cloning for Cloneable objects, so the corresponding class must implement clonable interface
 *  Cloneable interface is a maker interface it does not contain any method, 
 *  the required ability will automatically provided by jvm
 *  if we are trying to perform cloning on non-clonable object we get CloneNotSupportedException
 */
public class clone implements Cloneable {
	void method() {
		System.out.println("method is called");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		clone original = new clone();
		clone duplicate = (clone) original.clone();
		duplicate.method();
		System.out.println(original.getClass());

	}
}

