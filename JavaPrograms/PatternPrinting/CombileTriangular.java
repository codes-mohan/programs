package PatternPrinting;

// if one pattern is below the other or above the other 
// then only we can combine
// if not, we have to find the new logic

public class CombileTriangular {
public static void main(String[] args) {
int n=4;
	
	for(int row=0;row<n;row++)
	{
		for(int col=0;row>=col;col++)
		{
			
			System.out.print("* ");
		}
	
		System.out.println();
}
	
	for(int row=1;row<n;row++)
	{
		for(int col=0;(row+col)<=(n-1);col++) 
		{

			System.out.print("* ");
			
		}
		System.out.println();
	}
}
}
