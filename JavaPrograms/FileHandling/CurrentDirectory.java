package FileHandling;

public class CurrentDirectory {
public static void main(String[] args) {
	String path=System.getProperty("user.dir");
	System.out.println("current working directory: "+path);
}
}
