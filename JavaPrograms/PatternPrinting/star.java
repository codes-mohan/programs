package PatternPrinting;

public class star {
public static void main(String[] args) {
	int n=5;
	for(int row=1;row<=n;row++)
	{
		for(int space=n-1;space>=row;space--)
		{
			System.out.print("  ");
		}
		for(int star=1;star<=(2*row-1);star++)
		{
			System.out.print("* ");
		}
		System.out.println("  ");
	}
}
}
