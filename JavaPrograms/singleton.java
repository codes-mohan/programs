public class singleton{

	public static void main(String[] args) {
	mycls m=mycls.getInstance();
	mycls m1=mycls.getInstance();
	System.out.println(m.hashCode());
	System.out.println(m1.hashCode());
	}
}

class mycls{
	static mycls instance=null;
	private mycls()
	{
		
	}
	static mycls getInstance()
	{
		if(instance==null)
			instance=new mycls();
		return instance;
	}
}