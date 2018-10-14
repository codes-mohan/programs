package Multithreading;

class Pyramid {
	synchronized void drawPyramid(char ch) {
		for (int row = 0; row < 4; row++) {
			for (int space = 0; space < 4 - 1 - row; space++) {
				System.out.print("  ");
			}
			for (int star = 0; 2 * row >= star; star++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}

class DrawerA extends Thread {
	// Pyramid p=new Pyramid();

	Pyramid p;

	DrawerA(Pyramid p) {
		this.p = p;
	}

	public void run() {
		p.drawPyramid('*');
	}
}

class DrawerB extends Thread {
	// Pyramid p=new Pyramid();

	Pyramid p;

	DrawerB(Pyramid p) {
		this.p = p;
	}

	public void run() {
		p.drawPyramid('#');
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		Pyramid pyr = new Pyramid();
		DrawerA a = new DrawerA(pyr);
		DrawerB b = new DrawerB(pyr);
		a.start();
		b.start();
	}
}
 