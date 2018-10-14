package Networking;
import java.net.*;
public class InetAddressdemo {
public static void main(String[] args) throws UnknownHostException {
	InetAddress address=InetAddress.getLocalHost();
	System.out.println(address);
	address=InetAddress.getByName("www.google.com");
	System.out.println(address);
	address=InetAddress.getByName("www.studytonight.com");
	System.out.println(address);
	}
	
	
}



