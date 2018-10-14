package youtube;
class myclass{
	public void finalize()
	{
		System.out.println("collected");
		System.out.println(10/0);
	}
}
public class Garbage {
public static void main(String[] args) {
	myclass m=new myclass();
	m.finalize();
	m=null;
	System.gc();
}
}
