package PatternPrinting;

public class starANDnumberPyramid {
public static void main(String[] args) {
	int n=5;
	
	for(int row=0;row<n;row++)
	{
	
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		int count=1;
		for(int col=0;2*row>=col;col++)
		{
			/// in odd places put star
			if(col%2!=0)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(count +" ");
				count=count+2;
			}
			
		}
		System.out.println();
	}
}
}
