package PatternPrinting;

public class Specialcase2 {
public static void main(String[] args) {
	int n=4;
	int count=1;
	for(int row=0;row<n;row++)
	{
		for(int col=0;row>=col;col++)
		{
				System.out.print(col+1 +" ");
		}
		System.out.println();
		//count+=(2*row)+3;
	}
}


}

/*
1 
1 2 
1 2 3 
1 2 3 4 */
