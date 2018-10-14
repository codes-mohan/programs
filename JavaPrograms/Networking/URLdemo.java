package Networking;
import java.net.MalformedURLException;
import java.net.URL;
public class URLdemo {
public static void main(String[] args) throws MalformedURLException {
	URL url=new URL("http://www.studytonight.com/java/networking-in-java.php");
	System.out.println(url.getProtocol());
	System.out.println(url.getFile());
	System.out.println(url.getHost());
	System.out.println(url.getPath());
	System.out.println(url.getPort());
	System.out.println(url.getClass());
	System.out.println();
}
}
