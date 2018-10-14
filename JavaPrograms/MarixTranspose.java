
public class MarixTranspose {
	static int n=2;
public static void main(String[] args) {

	int count = 0;
	int matrix[][]=new int[n][n];
	int transpose[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			matrix[i][j]=count++;
		}
	}
	System.out.println("<-------------original matrix-------------->");
	print(matrix);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			transpose[i][j]=matrix[j][i];
		}
	}
	System.out.println("<-------------Transpose matrix-------------->");
	print(transpose);
		
		
}

private static void print(int[][] matrix) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++)
		{
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.println("\n");
	}
	
}

	
}
