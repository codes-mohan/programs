package PatternPrinting;

public class Pyramid {
public static void main(String[] args) {
	int n=4;
	for( int row=0;row<n;row++)
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

/*
 *              *
 *            * * *
 *          * * * * * 
 */

