package PatternPrinting;

public class charpyramid {
public static void main(String[] args) {
	int n=3;
	for(int row=0;row<n;row++)
	{
		char c1='A';
		char c2='a';
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int col=0;2*row>=col;col++)
		{
			System.out.print(c1++);
			System.out.print(c2+++" ");
		}
	System.out.println();	
	}
}
}

 /*  output
   Aa 
 Aa Bb Cc 
Aa Bb Cc Dd Ee 
*/