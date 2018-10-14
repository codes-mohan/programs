package Revision;

public class pyramid {
	public static void main(String[] args) {
		int n = 20;
		for (int row = 0; row < n; row++) {
			for (int space = row; space < n; space++) {
				System.out.print("  ");
			}
			for (int star = 0; star <= row * 2; star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
