package PatternPrinting;
public class TriangularPattern2{
public static void main(String[] args) {
	int n=4;
	
	for(int row=0;row<n;row++)
	{
		for(int col=0;(row+col)<=(n-1);col++) 
		{

			System.out.print("* ");
			
		}
		System.out.println();
	}
	
	
}
}
