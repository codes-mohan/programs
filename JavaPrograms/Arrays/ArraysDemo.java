package Arrays;
import java.util.Arrays;
public class ArraysDemo {
public static void main(String[] args) {
	int[]arr1=new int[] {10,0,2,20};
	int[]arr2=new int[] {10,10,20,20};
	System.out.println("<----------array printing--------->");
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println("<---------compare arrays------------>");
	System.out.println("two are equal------>"+Arrays.equals(arr1, arr2));
	System.out.println("<--------------Array sorting--------------------->");
	Arrays.sort(arr1);
	System.out.println("<----------sorted array------------> \n" + Arrays.toString(arr1));
	System.out.println("<--------array assigning---------->");
	int a[]=new int[3];
	int b[]=new int[] {40,50,4,1,2,1,4};
	a=b;   // compiler checks only for type , not size
	System.out.println(Arrays.toString(a));
	
}
}
