package PatternPrinting;

public class MakespaceINtriangular {
public static void main(String[] args) {
	int n=10;
	for(int row=0;row<n;row++)
	{
		for(int star=0;row>=star;star++)
		{
			if(star==0||row==star||row==n-1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
