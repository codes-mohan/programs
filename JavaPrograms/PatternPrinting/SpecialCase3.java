package PatternPrinting;

public class SpecialCase3 {
public static void main(String[] args) {
	int n=4;
	int count=1;
	for(int row=0;row<n;row++)
	{
		
		for(int col=0;row>=col;col++)
		{	
				System.out.print(count++ +" ");
			count+=2;
		
			
				
		}
	
	count=row+2;
		System.out.println();
		
	}
}
}
