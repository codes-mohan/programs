package PatternPrinting;

public class ReversePyramid {
public static void main(String[] args) {
	int n=3;
	for(int row=n-1;row>=0;row--)
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
 *             * * * * *
 *               * * *
 *                 *
 */


