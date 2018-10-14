package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
public static void main(String[] args) throws IOException {
	FileInputStream sourcefile=new FileInputStream("file1");
	FileOutputStream targetfile=new FileOutputStream("new.txt");
	int bytevalue;
	while((bytevalue=sourcefile.read())!=-1) {
		targetfile.write(bytevalue);
		sourcefile.close();
		targetfile.close();
		System.out.println("file copied successfully");
	}
}
}
