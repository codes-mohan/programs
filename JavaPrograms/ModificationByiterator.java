import java.util.ArrayList;
import java.util.Iterator;

// if we want to access all elements in an collection and modify it
// then use iterator
//here we are printing even and femoving odd
public class ModificationByiterator {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			a.add(i);
		}
		System.out.println("<--------printing objects---------> \n");
		for (int value : a) {
			System.out.println(value);
		}

		System.out.println("\n<-----removing odd using iterator-------->\n");
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Integer value = (Integer) it.next();
			if (value % 2 == 0) {
				System.out.println(value);
			} else {
				it.remove();
			}

		}

	}
}
