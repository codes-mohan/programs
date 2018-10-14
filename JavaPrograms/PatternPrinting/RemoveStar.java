package PatternPrinting;

public class RemoveStar {
public static void main(String[] args) {
	int n=8;
	for(int row=0;row<n;row++)
	{
		for(int star=0;star<n;star++)
		{

			if(row+star>=n-1)
			{
				if(row+star==n-1 || row==n-1 || star==n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			
			else
			System.out.print("  ");
		}
		System.out.println();
	}
		
}
}
