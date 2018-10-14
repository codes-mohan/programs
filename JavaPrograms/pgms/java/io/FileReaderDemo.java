package pgms.java.io;
import java.io.*;
/** by using FileReader we can read character data from file ***/

public class FileReaderDemo
{
public static void main(String[] args) throws IOException {
	/*
	 * constructors
	 * FileReader fr=new FileReader(String name);
	 * FileReader fr=new FileReader(File f);
	 */
	
	FileReader fr=new FileReader("file.txt");
	int i=fr.read(); 
	/*
	 * it attempts to read next character from file and returns its unicode value
	 * if next character is not available it returns -1
	 *  
	 */
	while(i!=-1)  
	{
		System.out.println((char)i);
		i=fr.read();
	}
}
}
