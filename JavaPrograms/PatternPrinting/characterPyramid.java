package PatternPrinting;

public class characterPyramid {
public static void main(String[] args) {
	int n=3;
	for(int row=0;row<n-1;row++)
	{
		char ch='A';
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int character=0;2*row>=character;character++)
		{
			if(character<row)
			{
				System.out.print(ch++ +" ");
			}
			else
				System.out.print(ch-- +" ");
		}
		System.out.println();
	}
	for(int row=n-1;row>=0;row--)
	{
		char ch='A';
		for(int space=0;space<n-1-row;space++)
		{
			System.out.print("  ");
		}
		for(int character=0;2*row>=character;character++)
		{
			if(character<row)
			{
				System.out.print(ch++ +" ");
			}
			else
				System.out.print(ch-- +" ");
		}
		System.out.println();
	}
}
}
