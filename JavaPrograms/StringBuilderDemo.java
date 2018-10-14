
public class StringBuilderDemo {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	sb.append("hello").append(" ").append("how are you");
	System.out.println(sb);
	System.out.println(sb.delete(0, 5));
	System.out.println(sb.reverse());
	System.out.println(sb.length());
	System.out.println(sb.equals(sb));

}
}
