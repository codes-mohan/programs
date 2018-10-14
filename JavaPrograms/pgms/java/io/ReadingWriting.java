package pgms.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWriting {
public static void main(String[] args) throws IOException {
	
	
	FileReader fr=new FileReader("F:\\My codes\\eclipse java\\My codes\\read.txt");
	
	FileWriter fw=new FileWriter("F:\\My codes\\eclipse java\\My codes\\write.txt");
	int ch;
	
	while( (ch=fr.read())!=-1)
	{
		System.out.println("writing file...");
		fw.write(ch);
	}
	
	fr.close();
	fw.close();
}
}
