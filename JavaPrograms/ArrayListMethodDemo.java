import java.util.ArrayList;

public class ArrayListMethodDemo {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>();
	ArrayList<String> a2=new ArrayList<>();
	
	a1.add("html");
	a1.add("css");
	a1.add("js");
	a1.add("java");
	a2.add("java");
	a2.add("c");
	a2.add("python");
	System.out.println(a2);
	// print common to both list
	System.out.println("<---------common to both using retailAll()----------> \n");
	
	ArrayList<String> common=new ArrayList<>(a1);
	common.retainAll(a2);
	System.out.println(common);
	
	System.out.println("\n <---elements in first list which is not in second--------->");
	ArrayList<String> differ=new ArrayList<String>(a1);
	differ.removeAll(a2);
	System.out.println(differ);
	

}
}
