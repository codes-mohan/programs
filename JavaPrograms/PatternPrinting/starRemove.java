package PatternPrinting;

public class starRemove {
public static void main(String[] args) {
	int n=5;
	for(int row=0;row<n;row++)
	{
		for(int col=0;row>=col;col++)
		{
			if(col==0||row==col||row==n-1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
