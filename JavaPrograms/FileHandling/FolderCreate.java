package FileHandling;
import java.io.File;

public class FolderCreate {
	public static void main(String[] args) {
		File f = new File("F:\\My codes\\eclipse java\\My codes\\folder");
		if (f.exists() == false) {
			f.mkdir();
			System.out.println("folder created....");
		} else {
				System.out.println("folder already exist");
		}
	}
}
