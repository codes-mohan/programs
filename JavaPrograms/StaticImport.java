import static java.lang.System.out;
import static java.lang.Math.sqrt;
public class StaticImport {
public static void main(String[] args) {
	out.println("hello");
	out.println((sqrt(9)));  // instead of Math.sqrt()
}
}
