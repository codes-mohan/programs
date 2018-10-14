package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {
public static void main(String[] args) throws IOException {
	PrintWriter pw=new PrintWriter("file3.txt");
	BufferedReader br=new BufferedReader(new FileReader("F:\\My codes\\eclipse java\\My codes\\file1.txt"));
	String line=br.readLine();
	while(line!=null)
	{
		pw.println(line);
		line=br.readLine();
	}
	BufferedReader br1=new BufferedReader(new FileReader("F:\\My codes\\eclipse java\\My codes\\file2.txt"));
	String line1=br1.readLine();
	while(line1!=null)
	{
		pw.println(line1);
		line1=br.readLine();
	}
	pw.flush();
	br.close();
	br1.close();
	pw.close();
}
}
