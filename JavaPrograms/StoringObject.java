import java.util.ArrayList;
import java.util.List;

// Collections can be used to stro the object


public class StoringObject {
public static void main(String[] args) {
	StoringObject s1=new StoringObject();
	StoringObject s2=new StoringObject();
	StoringObject s3=new StoringObject();
	StoringObject s4=new StoringObject();
	StoringObject s5=new StoringObject();
	List<StoringObject > l=new ArrayList<>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
	System.out.println(l);
	
}
}
