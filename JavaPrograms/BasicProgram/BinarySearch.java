package BasicProgram;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("enter the size of aray");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the numbet at " + i + "th index");
			int num = sc.nextInt();
			arr[i] = num;
		}
		display(arr);
//--------------------------worst method--------------------------------------//
		int searchnum = 20;
		for (int i = 0; i < size; i++) {
			if (searchnum == arr[i]) {
				System.out.println("\n number found at location "+i);
				
			break;}
			else {
				System.out.println("\n number not found");
			}
		}
		
//----------------------------------best method------------------------------------------//
		
		System.out.println("enter the search value");
		int item=sc.nextInt();
		int first=0;
		int last=size-1;
		int middle;
		while(first<=last)
			
		{
			middle=(first+last)/2;
			if(arr[middle]<item)
				first=middle+1;
			else if( arr[middle]==item)
			{
				System.out.println(item+" found at the location "+(middle)+".");
				break;
				
			}
			else
			{
				last=middle-1;
				
			}
		
			
		}
		if(first>last)
		{
			System.out.println(item+" not found");
		}
		
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
