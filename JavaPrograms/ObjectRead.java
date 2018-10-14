import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {

@SuppressWarnings("static-access")
public static void main(String[] args) throws IOException, ClassNotFoundException {
	studentDetails s=null;
	FileInputStream fis=new FileInputStream("object.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	s=(studentDetails) ois.readObject();

	ois.close();
	fis.close();
	//use toString method to print details
	System.out.println(s);
	
	
	
	//or use following
	
System.out.println(s.age);
System.out.println(s.name);
System.out.println(s.course);
System.out.println(s.rollno);   //transient and static won't participate in serialization
	
}
}
