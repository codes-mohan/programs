/*Creation of an Inner Class.*/

class Bulb {
	boolean status = false;
	class BulbSwitcher {
	void switchOn() {
		status = true;
		}
	}
	void useBulbSwitcher() {
		// We can create the object of inner class within outer class only
		BulbSwitcher bs = new BulbSwitcher();
		bs.switchOn();
		System.out.println("Bulb is On.");
	}
}
public class InnerClassCreation {
	public static void main(String args[]) {
		Bulb bulb = new Bulb();
		bulb.useBulbSwitcher();
	}
}

