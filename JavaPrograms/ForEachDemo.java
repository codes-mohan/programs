import java.util.HashSet;
import java.util.Set;

// this is used to access elements of collections
//if we don't need to alter the elements, and 
// if we don't need reverse access
//if we simply neeed to print elements
//then use for each loop
public class ForEachDemo {
public static void main(String[] args) {
	Set<String>s=new HashSet<>();
	s.add("this");
	s.add("that");
	s.add("then");
	for(String value:s) {
		System.out.println(value);
	}
}
}
