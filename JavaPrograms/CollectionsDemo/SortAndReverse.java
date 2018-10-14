package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndReverse {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	String[]names= {"smith","jones","brown","able","smith"};
	for(String values:names)
		al.add(values);
	Collections.sort(al);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
}
}
