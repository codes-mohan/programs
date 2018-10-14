package Revision;

public class Pyramid1 {
	public static void main(String[] args) {
		int a=5;
		++a;
		System.out.println(a);
		
		
		
		
		
		
		char a1='A';
		char b1=(char) (a1+1);
		char c=a1++;
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		/*int n = 5;
		for (int row = 0; row < n-1; row++) {
			char ch = 'A';
			for (int space = 0; space < n - 1 - row; space++) {
				System.out.print("  ");
			}
			for (int col = 0; 2 * row >= col; col++) {
				if (col < row)
					System.out.print(ch++ + " ");
				else {
					System.out.print(ch-- + " ");

				}
			}
			System.out.println();
		}
		for (int row = n-1; row>=0; row--) {
			char ch = 'A';
			for (int space = 0; space < n - 1 - row; space++) {
				System.out.print("  ");
			}
			for (int col = 0; 2 * row >= col; col++) {
				if (col < row)
					System.out.print(ch++ + " ");
				else {
					System.out.print(ch-- + " ");

				}
			}
			System.out.println();
		}*/
	}
}
