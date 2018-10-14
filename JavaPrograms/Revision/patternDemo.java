package Revision;

public class patternDemo {
public static void main(String[] args) {
	int n=4;

for(int row=0;row<n-1;row++)
	{
	
		for(int col=0;col<n;col++)
		{
			if(row<=col)
					
			System.out.print("* ");
			else
				System.out.print("  ");
	
			
		}
		System.out.println();
		}
	
	
	
	for(int row1=0;row1<n;row1++)
	{
		for(int col1=0;col1<n;col1++)
		{
			if((row1+col1)>=n-1)
				
					
			System.out.print("* ");
			else
				System.out.print("  ");
			
		}
		System.out.println();
	}

}
}
