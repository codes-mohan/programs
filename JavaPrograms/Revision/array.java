package Revision;

public class array {
public static void main(String[] args) {
	int a[]= {4,86,5,74,56};
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		max=a[i];
	}
	
	System.out.println(max);
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=max;
	}
	
	for(int value:a)
	{
		System.out.println(value);
	}
		
			
}
}
