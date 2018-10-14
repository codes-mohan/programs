package Revision;

public class pyramidDemo {
public static void main(String[] args) {
	int n=5;
	// upward 
	for(int row=0;row<n;row++)
	{
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int star=0;2*row>=star;star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	// downward
	// to get diamond remove 1 iteration
	// n-1    become   n-2
	for(int row=n-2;row>=0;row--)
	{
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int star=0;2*row>=star;star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}

}
