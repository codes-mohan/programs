
/*
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
    
	list.add(1);
	list.add(80);
	list.add(54);
	list.add(985);
	list.add(25);
	// print list
	System.out.println("list at first-->"+list);
    //get value at index 0
	System.out.println("value at index 0-->"+list.get(0));
	// sort list
	Collections.sort(list);
	//print sorted list
	System.out.println("ordered list values-->"+list);
	//remove value at index0
	list.remove(0);
	System.out.println("after removing ordered list-->"+list);
	//create second list
	ArrayList<Integer>list1=new ArrayList<Integer>();
	list1.add(80);
	list1.add(54);
	list1.add(56);
	list1.add(150);
	// create list which interfaces two list
	ArrayList<Integer>common=new ArrayList<Integer>(list);
	//find values common to both list
	common.retainAll(list1);
	//print common values
	System.out.println("common to both lists"+common);
	ArrayList<Integer>difference=new ArrayList<Integer>(list);
	//find the unique value in list1
	difference.removeAll(list1);
	// print unique value
	System.out.println("unique values in list-->"+difference);
	//clear the values in the list
	list.clear();
	//check if list empty
	if(list.isEmpty());
	// if true print 
	System.out.println("list is empty");
}
}
*/

//Demonstrate ArrayList.
import java.util.*;
class ArrayListDemo 
{
@SuppressWarnings("unchecked")
public static void main(String args[]) 
{
  // create an array list
  @SuppressWarnings("rawtypes")
ArrayList al = new ArrayList();
  System.out.println("Initial size of al: " +al.size());
  
  // add elements to the array list
  al.add("C");
  al.add("A");
  al.add("E");
  al.add("F");
  al.add("B");
  al.add("D");
  al.add("F");
  al.add(1, "A2");
  al.add(new Integer(1));
  al.add(new Double(10.0));
  System.out.println("Size of al after additions: " +al.size());
  
  // display the array list
  System.out.println("Contents of al: " + al);
  
  // Remove elements from the array list
  al.remove("F");
  al.remove(2);
  System.out.println("Size of al after deletions: " +
  al.size());
  System.out.println("Contents of al: " + al);
 
  
}
}