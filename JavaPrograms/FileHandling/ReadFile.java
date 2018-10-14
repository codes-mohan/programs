package FileHandling;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("F:\\My codes\\eclipse java\\practice\\src\\file.txt"));
	String str;
	while((str=br.readLine())!=null)
	{
		System.out.println(str);
	}
	br.close();
}
}
