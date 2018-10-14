package pgms.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** * by using FileWriter we can write character data to the file ****/

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	/*these constructor are for overwriting the file
	 * 
	 * 	FileWriter fw=new FileWriter(String name);
		FileWriter fw=new FileWriter(File f);
	*/
	
	FileWriter f=new FileWriter("file.txt") ;  // to append into the file instead of overwriting
	System.out.println("writing into the file........");
	f.write("99");
	f.write("\n"); // next line
	f.write("hello hi");
	f.write("\n");
	char ch[]= {'a','b','c'};
	f.write(ch);
	f.flush();
	f.close();
}
}

/*
	the main problem with FileWriter is, we have to insert the line seperstor manually
	which is difficult to the programmer    ("\n")
	
	And even line seperator varying from system to system

*/