
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization
//converting object into sequence of bytes.
// class must must implement serializable in serialization

class studentDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	static String course;
	transient int rollno;

	@SuppressWarnings("static-access")
	studentDetails(String name, int rollno, int age, String course) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.course=course;

	}

	@Override
	public String toString() {
		return "studentDetails [name=" + name + ", age=" + age + ", rollno=" + rollno + ",course=" +course+"]";
	}
	

}

public class ObjectWrite {
	public static void main(String[] args) throws IOException {
		studentDetails s = new studentDetails("mohan", 100, 22, "engg");
		FileOutputStream fos=new FileOutputStream("object.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.println("writing the object......");
		oos.writeObject(s);
		oos.close();
		fos.close();
	}
}
