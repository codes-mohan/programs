package PatternPrinting;

public class SpecialCase5 {
	public static void main(String[] args) {
		int n = 4;
		int count = 1;
		for (int row = 0; row < n; row++) {

			for (int col = 0; row >= col; col++) {

				if (count % 2 == 0) {

					System.out.print("1 ");

				} else {
					System.out.print("0 ");

				}

			}
			count++;
			System.out.println();

		}
	}
}
