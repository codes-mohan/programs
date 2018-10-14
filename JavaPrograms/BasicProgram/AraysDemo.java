package BasicProgram;

import java.util.Scanner;

public class AraysDemo {
	static int[] replace(int [] array,int pos,int elem)
	{
		if(pos>array.length)
		{
			System.out.println("enter the valid index");
		}
		else {
			array[pos]=elem;
		}
		return array;
	}
	
	static int[] delete(int[] array,int index)
	{
		int [] newarr=new int[array.length-1];
		for(int i=0;i<index;i++)
		{
			newarr[i]=array[i];
		}
		for(int i=index;i<newarr.length;i++)
		{
			newarr[i]=array[i+1];
		}
	
		return newarr;
	}
	static int[] insert(int[] array,int element,int index)
	{
		int [] newarr=new int[array.length+1];
		for(int i=0;i<index;i++)
		{
			newarr[i]=array[i];
		}
		for(int i=index+1;i<newarr.length;i++)
		{
			newarr[i]=array[i-1];
		}
		newarr[index]=element;
		return newarr;
	}
	private static void countRepitition(int [] array)
	{
		int n=array.length;

		for(int i=0;i<n-1;i++)
		{
			 int count=1;
			for(int j=i+1 ; j<n;j++)
			{
				int  k=j;
				if(array[i]==array[j])
				{
					count++;
					while(k<n-1)
					{
						array[k]=array[k+1];
						k++;
					}
					n--;
					j--;
			
				}
			
			}
			System.out.println(array[i] +" is repeated "+count+" times");	
		}
	
	}
	private static void deleteRepitition(int [] array)
	{
		int n=array.length;

		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1 ; j<n;j++)
			{
				int  k=j;
				if(array[i]==array[j])
				{
					while(k<n-1)
					{
						array[k]=array[k+1];
						k++;
					}
					n--;
					j--;
			
			}
		}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
			
		}
	}
	public static void reverse(int[] a)
	{
		for(int i=0;i<a.length/2;i++) {
			a[i]=a[i] ^ a[a.length-1-i];
			
			a[a.length-1-i]=a[i]^a[a.length-1-i];
			a[i]=a[i]^a[a.length-1-i];
			/*int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;*/
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void  missing(int [] arr)
	{
		int i,j;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=arr[i]+1;j<arr[i+1];j++)
			{
				System.out.println(j);
			}
		}
		
	}
	
	public static int[] ascend(int[] newarr)
	{
		int i,j;
		for(i=0;i<newarr.length-1;i++)
		{
			for(j=i+1;j<newarr.length;j++)
			{
				if(newarr[i]>newarr[j])
				{
					int temp=newarr[i];
					newarr[i]=newarr[j];
					newarr[j]=temp;
				}
			}
		}
		return newarr;
	}
	public static int[] descend(int[] newarr)
	{
		int i,j;
		for(i=0;i<newarr.length-1;i++)
		{
			for(j=i+1;j<newarr.length;j++)
			{
				if(newarr[i]<newarr[j])
				{
					int temp=newarr[i];
					newarr[i]=newarr[j];
					newarr[j]=temp;
				}
			}
		}
		return newarr;
	}

	/*public static void maximum(int [] a) {
		int max=a[0];
		int pos=0;
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
			{
				max=a[i];
				pos=i;
			}
		}
		System.out.println("maximum is= "+max);
		System.out.println("position is= "+pos);
	}

public static int sum(int[] a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	return sum;
	
}*/

public static void main(String[] args) {
	System.out.println("Enter the length of the arrary");
	Scanner s =new Scanner(System.in);
	int size=s.nextInt();
	int []arr=new int[size];
	
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the value at "+i+ "th position");
		arr[i]=s.nextInt();
	}
	//----------------------------------------------------//
	/*System.out.println("elements of array are: ");
	for(int i=0;i<size;i++)
	{
		
		System.out.println("arr[" +i+"]="+arr[i]);
	}
	//----------------------------------------------------//
	int sum=sum(arr);
	System.out.println("sum of array elements= "+sum);
	//---------to find the max ----------------------------------//
  
	maximum(arr);*/
	
	
	//----bubble sort technique and find nth maximum-----------------------------------------------------------//
	/* ascend(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
// to objtain nth max and min
System.out.println("enter which maximum you want to know");
int nth=s.nextInt();
System.out.println("enter which minimum you want to know");
int nthmin=s.nextInt();
if(nth<arr.length)
{
	System.out.println("nth max: "+arr[arr.length-nth]);
	System.out.println("nth min: "+arr[nthmin-1]);
}
else {
	System.out.println("enter the valid index");
}*/

/*	int []sortedarray=ascend(arr);
	for(int values:sortedarray)
	System.out.println(values);*/

//--------printing missing elements--------------------------------------------------------------//
	  //missing(arr);
	
	//------------to delete repeated elements-----------------------------//
//deleteRepitition(arr);
//countRepitition(arr);
	//reverse(arr);

	
//----------------insert element--------------------------------//
	/*System.out.println("enter the element you want to insert");
	int element=s.nextInt();
	System.out.println("enter the index to which you want to insert");
	int index=s.nextInt();
	if(index>arr.length-1)
	{
		System.out.println("enter valid index");
		
		
	}
	else {
	int [] res=replace(arr,element,index);
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
}
*/
	
	//-----------delete element-------------------//
/*	System.out.println("enter the position of the element you want to remove");
	int position=s.nextInt();
	if(position>arr.length)
	{
		System.out.println("enter the valid index");
	} 

	else {
		int [] res=delete(arr,position);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}*/
	
	//----------replace elements-----------------------------//
	System.out.println("enter the position of the element you want to replace");
	int pos=s.nextInt();
	System.out.println("enter the element");
	int elem=s.nextInt();
	
	int [] result=replace(arr,pos,elem);
	for(int i=0;i<result.length;i++)
	{
		System.out.println(result[i]);
	}
	
}
}
