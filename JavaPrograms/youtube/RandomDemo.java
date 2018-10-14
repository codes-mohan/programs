package youtube;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		int value;
		Random r = new Random();
		// print the random number in the range of 0-10
		for (int i = 0; i < 10; i++) {
			value = r.nextInt(10);
			System.out.println("random number generated: " + value);
			;
		}
	}
}
