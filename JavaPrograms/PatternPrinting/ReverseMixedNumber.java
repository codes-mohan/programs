package PatternPrinting;

public class ReverseMixedNumber {
public static void main(String[] args) {
	int n=4;
	for(int row=0;row<n-1;row++)
	{
		int count=1;
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int number=0;2*row>=number;number++)
		{
			if(number<row)
			{
				System.out.print(count+++" ");
			}
			else
				System.out.print(count-- +" ");
		}
		System.out.println();
	}
	
	for(int row=n-1;row>=0;row--)
	{
		int count=1;
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int number=0;2*row>=number;number++)
		{
			if(number<row)
			{
				System.out.print(count+++" ");
			}
			else
				System.out.print(count-- +" ");
		}
		System.out.println();
	}

}
}
