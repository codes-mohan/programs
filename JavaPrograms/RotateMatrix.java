
public class RotateMatrix {
	

public static void print(int m[][]) {
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(m[i][j]+"  ");
			
		}
	System.out.print("\n\n");
	}
}
public static void main(String[] args) {

	int count = 0;
	
	int m[][]= new int[2][2];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m.length;j++)
		{
			
			m[i][j]=count++;
		}
	}
	
	System.out.println("<--------original matrix------------>");
print(m);

int last=1;
for(int i=0;i<last;i++) {
	swap(m[i][i],m[i][last]);
	swap(m[i][i],m[last][last]);
	swap(m[i][i],m[last][i]);
	
	
	
}
System.out.println("<---------swapped matrix------>");
print(m);




}
private static  void swap(int i, int j) {
	
	
	
	
	
	
}



	
}







	