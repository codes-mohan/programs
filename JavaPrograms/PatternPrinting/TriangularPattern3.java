package PatternPrinting;
// we have to move the cursor manually
public class TriangularPattern3 {
public static void main(String[] args) {
int n=4;
	
	for(int row=0;row<n;row++)
	{
		for(int col=0;col<n;col++)
		{
			if(row<=col)
			
			System.out.print("* ");
			else
			System.out.print("  ");  // 2 spaces as in the above statement 
			
		
	}
	
		System.out.println();
}
}
}
