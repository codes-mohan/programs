package SpecialCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;

public class DifferentTypesOfObjectCreation implements Cloneable,Serializable{
	void method(String msg)
	{
		System.out.println(msg);
	}
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, FileNotFoundException, IOException {
	// in normal way
	DifferentTypesOfObjectCreation o1=new DifferentTypesOfObjectCreation();
	o1.method("using normal way object is created");
	
	// using reflection
	
	DifferentTypesOfObjectCreation o2=(DifferentTypesOfObjectCreation) Class.forName("SpecialCase.DifferentTypesOfObjectCreation").newInstance();
	o2.method("using reflection object is created");
	
	//using clone
	
	DifferentTypesOfObjectCreation o3=(DifferentTypesOfObjectCreation)o1.clone();
	o3.method("using clone object is created");

	// using Factory Methods
	
	Runtime r=Runtime.getRuntime();
	//System.out.println(r.availableProcessors());
	DateFormat df=DateFormat.getInstance();
	
	//// using Serialization and Deserialization
	
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("in.ser"));
	oos.writeObject(o1);
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("in.ser"));
	DifferentTypesOfObjectCreation o4=(DifferentTypesOfObjectCreation)ois.readObject();
	o4.method("using deserialization object is created");
	
	
	
}
}
