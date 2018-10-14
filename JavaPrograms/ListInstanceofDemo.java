import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ListInstanceofDemo {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList();
	LinkedList<String> l=new LinkedList<String>();
	System.out.println(" \n <------checking for arraylist-----------------> \n");
	System.out.print("ArratList implements Serializable---->");
	System.out.println(a instanceof Serializable);
	System.out.print("ArrayList implements Cloneable--->");
	System.out.println(a instanceof Cloneable);
	System.out.print("ArrayList implements RandomAccess--->");
	System.out.println(a instanceof RandomAccess);
	System.out.println("\n <--------------------checking for LinkedList----------> \n");
	System.out.print("LinkedList implements Serializable--->");
	System.out.println(l instanceof Serializable);
	System.out.print("LinkedList implements Cloneable--->");
	System.out.println(l instanceof Cloneable);
	System.out.print("LinkedList implements RandomAccess--->");
	System.out.println(l instanceof RandomAccess);
	
}
}
