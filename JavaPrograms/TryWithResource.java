import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//using try with resources
public class TryWithResource{
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		String str;
		try(BufferedReader br=new BufferedReader(new FileReader("F:\\My codes\\eclipse java\\practice\\src\\file.txt")))
		{
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
		}
				
	}
}
/*
//without try with resources
public class TryWithResource {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("F:\\My codes\\eclipse java\\practice\\src\\file.txt"));
	String str ;
	while((str=br.readLine())!=null)
	{
		System.out.println(str);
	}
	br.close();
	
}
}
*/
