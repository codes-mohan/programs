import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTOset {
public static void main(String[] args) {
	Integer array[]= {1,2,3};
	Set<Integer>s=new HashSet<Integer>(Arrays.asList(array));
	System.out.println(s);
}
}
