import java.util.Scanner;

public class arrayMaxMin {
public static void main(String[] args) {
	System.out.println("enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int [] arr=new int [size];
	for (int i=0;i<arr.length;i++) {
	System.out.println("enter the element at "+i+"th postition");
	arr[i]=sc.nextInt();
	
	}
	System.out.println("<---------elements of array-------------->");
	display(arr);
	int max=arr[0];
	int min=arr[0];
	for( int i=1;i<arr.length;i++)
	{
		if(arr[i]>max) {
			max=arr[i];
		
		}
		
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		
	}
	
	

System.out.println("maximum: "+max+"\n minimum: "+min);

}
static void display(int[] arr) {
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
	}
}
}
