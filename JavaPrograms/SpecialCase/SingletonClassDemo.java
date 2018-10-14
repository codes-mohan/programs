package SpecialCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// ensures that only one object is created
class singleton implements Cloneable
{
	static singleton instance = null; // or new singleton();

	private singleton() {
		if(instance!=null)
		{
			throw new RuntimeException("new instance can't be created");
		}
		System.out.println("object creating.....");
	}

	static singleton getInstance() {
		if(instance==null)
		{
			instance=new singleton();
		}
		return instance;

	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return getInstance();
}
	
}

public class SingletonClassDemo{
	public static void main(String[] args) throws Exception {
		/*Class clazz =Class.forName("SpecialCase.singleton"); // load class
		Constructor<singleton> ctor=clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		singleton s2=ctor.newInstance();*/
		
		singleton s = singleton.getInstance();
/*		singleton s1 = singleton.getInstance();
		
		
		
		// violating singleton classes
		// By serialization
			
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\My codes\\eclipse java\\My codes\\singleton.ser"));
		oos.writeObject(s);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:\\My codes\\eclipse java\\My codes\\singleton.ser"));
		singleton s2= (singleton)ois.readObject();
		if(s!=s2)
		{
			System.out.println("violate by serialization and deserialization \n new object created and singleton class is violated");
		}
		
		// By reflection
*/		
		
	// By clone
		
		singleton s3=(singleton)s.clone();
		if(s!=s3)
		{
			System.out.println(" by cloning \n new object created and singleton is violated");
		}
	
	}
	
	
	
}
