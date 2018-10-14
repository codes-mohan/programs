package PatternPrinting;

public class SpecialCase {
public static void main(String[] args) {
	int n=4;
	int count=1;
	for(int row=0;row<n;row++)
	{
		for(int col=0;col<n;col++)
		{
			if(row+col>=n-1)
				System.out.print(count--+" ");
			else
				System.out.print("  ");
		}
		count+=(2*row)+3;
		System.out.println();
	}
}
}
