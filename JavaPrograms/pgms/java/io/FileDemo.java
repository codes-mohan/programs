package pgms.java.io;
import java.io.*;
public class FileDemo {
public static void main(String[] args) throws IOException {
	/** file creation  **/
	
	File f=new File("file.txt");
/*
 * it checks whether file.txt file is already available or not,
 *  if it's already present hen f simply refer that fil
 *  
 *  if it is not already present then it won't create any physical file
 *  	just creates a java File object represents the name of the file
 */
	
	System.out.println(f.exists());  //false  if  16th line is deleted
	
	f.createNewFile();
	
	System.out.println(f.exists());
	
	/*** java file object can represent a directory also */
	
	File d=new File("directory");
	System.out.println(d.exists());
	
	d.mkdir();
	
	System.out.println(d.exists());
	
	/** creating file in another directory **/
	File file =new File("F:\\My codes\\eclipse java\\My codes\\directory","file.txt");
	file.createNewFile();
	
/********************printing file names and count*************************/
	
	File files=new File("F:\\My codes\\eclipse java\\My codes");
	String[] str=files.list();
	int file_count=0;
	System.out.println("<********************files*************************>");
	for(String value:str)
	{
		File f1=new File(files,value);
		if(f1.isFile())
		{
			file_count++;
			System.out.println(value);
		}
		
	}
	System.out.println("total number of files: "+file_count);
	

/********printing directory names and counts*********************************/
	
	
	

	File dir=new File("F:\\My codes\\eclipse java\\My codes");
	String[] str1=files.list();
	System.out.println("<------------------directories---------------------->");
	int dir_count=0;
	for(String value:str1)
	{
		File f1=new File(files,value);
	 if(f1.isDirectory())
		{
			dir_count++;
			System.out.println(value);
		}	

	}
	

	System.out.println("total number of directories: "+dir_count);

}

}
