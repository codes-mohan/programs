import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadingInputs {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the string");
	System.out.println("you have entered "+"\n"+br.readLine());
	System.out.println("enter a number");
	System.out.println("you have entered the int number "+"\n"+(int)br.read());
	System.out.println("enter a float value");
	float value=(float)br.read();
	System.out.println("you have entered "+"\n"+value);
	
}
}
