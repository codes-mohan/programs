package PatternPrinting;

public class TriangularPatern1 {
public static void main(String[] args) {
	int n=5;
	for(int row=0;row<n;row++)
	{
		for(int col=0;row>=col;col++)
		{
			// or
			// since else part is not there we have combined the condition in for loop only
			
			/*for(int col=0;col<n;col++) {
				if(row>=col)
				{
					System.out.print("* ");

				}
			}
*/			
			System.out.print("* ");
			
		}
		System.out.println();
	}
}
}
