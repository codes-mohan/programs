package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	File f=new File("F:\\My codes\\eclipse java\\My codes\\new.txt");
	if(f.exists()==false)
	{
		f.createNewFile();
		System.out.println("file created.......");
	}
	else {
		System.out.println("file already exists!!");
	}
}
}
