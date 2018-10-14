
public class SwapNumbers {
	
	private int a;

	private int b;
	
	public SwapNumbers(int i, int j) {
		a=i;
		b=j;
		
	}

public static  void swap(SwapNumbers sn)
{
	int temp;
	temp=sn.a;
	sn.a=sn.b;
	sn.b=temp;
}


	
	
	
    public static void main(String args[])

    {
SwapNumbers sn=new SwapNumbers(10,20);

System.out.println("<---------------before swapping-------------->");
System.out.println(sn.a+":"+sn.b);

swap(sn);
System.out.println("<-----------after swapping----------------->");
System.out.println(sn.a+":"+sn.b);
    
    }

}


/*
a=a+b;
b=a-b;
a=a-b;
*/