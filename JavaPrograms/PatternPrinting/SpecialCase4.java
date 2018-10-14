package PatternPrinting;

public class SpecialCase4 {
public static void main(String[] args) {
	int n=4;
	char ch='A';
	for(int row=0;row<n;row++)
	{
		for(int col=0;row>=col;col++)
		{
			System.out.print(ch--+" ");
		}
		System.out.println();
		ch+=(char)(2*row+3);
	}
}
}
