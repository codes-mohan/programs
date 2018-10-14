package Revision;

public class Charpattern {
public static void main(String[] args) {
	int n=4;
	for(int row=0;row<n;row++)
	{
		char ch='A';
		char ch1='a';
		for(int col=0;row>=col;col++)
		{
			System.out.print(ch++);
			System.out.print(ch1++ +" ");
		}
		System.out.println();
	}
}
}
