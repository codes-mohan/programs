package PatternPrinting;

public class TriangularPattern4 {
public static void main(String[] args) {
int n=4;
	
	for(int row=0;row<n;row++)
	{
		for(int col=0;col<n;col++)
		{
			if(row+col>=n-1)
			
			System.out.print("* ");
			else
			System.out.print("  ");  // 2 spaces as in the above statement 
			
		
	}
	
		System.out.println();
}
}
}
