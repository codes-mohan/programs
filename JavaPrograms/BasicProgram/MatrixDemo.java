package BasicProgram;

public class MatrixDemo {
	static int rows=2, columns=3;
public static void main(String[] args) {
	
	int matrix1[][]= {{1,2,3},{4,5,6}};
	int matrix2[][]= {{-5,8,6},{5,-2,4}};
	System.out.println("<---------------first matrix------------------->");
	display(matrix1);
	System.out.println("<---------------second matrix------------------>");
	display(matrix2);
	int sum[][]=new int[rows][columns];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			sum[i][j]=matrix1[i][j]+matrix2[i][j];
		}
		
	}
	System.out.println("<----------------sum of two matrix------------------>");
	display(sum);
	int transpose[][]=new int[columns][rows];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			transpose[j][i]=matrix1[i][j];
			
		}
		
	}
	System.out.println("<------------transpose of first matrix----------->");
	for(int i=0;i<columns;i++)
	{
		for(int j=0;j<rows;j++)
		{
			System.out.print(transpose[i][j]+ "  ");
		}
		System.out.println();
	}
System.out.println("<------------------multiplication of matrix---------------->");
int r1=2,c1=3;
int r2=3,c2=2;
int [][]m1= {{2,4,6},{3,2,4}};
int [][]m2= {{1,2},{3,5},{6,8}};
int [][]product=new int[r1][c2];
for(int i=0;i<r1;i++)
{
	for(int j=0;j<c2;j++)
	{
		for(int k=0;k<c1;k++)
		{
			product[i][j]+=m1[i][k]*m2[k][j];
		}
	}
}
for(int i=0;i<r1;i++)
{
	for(int j=0;j<c2;j++)
	{
		System.out.print(product[i][j]+"  ");
	}
	System.out.println();
}
}
private static void display(int[][] matrix)
{
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			System.out.print(matrix[i][j]+"  ");
		}
		System.out.println();
	}
}
}
