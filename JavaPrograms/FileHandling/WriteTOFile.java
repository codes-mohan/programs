package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTOFile {
private static BufferedReader br;

public static void main(String[] args) throws IOException {
	BufferedWriter bw=new BufferedWriter(new FileWriter("newfile.txt"));
	bw.write("hi this is mohan");
	bw.close();
	br = new BufferedReader(new FileReader("newfile.txt"));
	String str;
	while((str=br.readLine())!=null)
	{
		System.out.println(str);
	}
	br.close();
}
}
