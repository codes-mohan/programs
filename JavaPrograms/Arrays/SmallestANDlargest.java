package Arrays;

import java.util.Scanner;

public class SmallestANDlargest {
public static void main(String[] args) {
	int size;
	System.out.println("enter the size of the array");
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	
	int arr[]=new int[size];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the element in "+arr[i]+" th position ");
		arr[i]=sc.nextInt();
	}
	
	int max=arr[0];
	int min=arr[0];
	int i;
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
	}
	System.out.println("max: "+max);
	System.out.println("min : "+min);
	
}
}
