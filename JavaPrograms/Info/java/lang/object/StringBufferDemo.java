package Info.java.lang.object;
/*
 * every method present in SreingBuffer is synchronized. at the same time only one thread is allow to operate on the 
 * StringBuffer object. hence StringBuffer object is thread safe. 
 * but increases the waiting time and lowers the performance
 * 
 * to overcome this StringBuilder is introduced in 1.5v
 */

public class StringBufferDemo
{
	
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	// this creates an empty string buffer object with default initial capacity 16
	
	// once the StringBuffer object reaches the maximum capacity a new StringBuffer object will be created with 
	
	// new capacity=(current capacity+1)*2
	
	
	System.out.println("initial capacity: "+sb.capacity());
	
	sb.append("hello world");
	System.out.println("initial word : "+sb);
	
	System.out.println("character at 1st pos: "+sb.charAt(1));
	System.out.println("length of String: "+sb.length());
	System.out.println("reversed string: "+sb.reverse());
	System.out.println("deleted 1st index element: "+sb.deleteCharAt(1));
	
	// to increase the capacity dynamically based on our requirement 
	sb.ensureCapacity(1000);
System.out.println("new capacity: "+sb.capacity());	
System.out.println("deleting from 0th to 4th index values: "+sb.delete(0, 5));
sb.trimToSize(); // to deallocate the extra allocated free memory such that capacity and size are equal

System.out.println("capacity :"+sb.capacity());

sb.setLength(2); //consider only specified number of characters and remove all the remaining characters 
System.out.println(sb);

System.out.println("inserted value at 0th index: "+sb.insert(0,"he"));
}
}

