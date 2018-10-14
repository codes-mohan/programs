import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Myst{
	public void finalize() throws Throwable
	{
		System.out.println("garbage collected");
	}
}

	

public class GarbageColection {
public static void main(String[] args) {
	GarbageColection gb=new GarbageColection();
	
	System.out.println(gb);
	System.out.println(gb.hashCode());
	// once objet is used reinitialized it to null
	gb=null;  // derefferencing
	
	/*Myst m=new Myst();
	System.out.println(m);
	m=null*/;
	System.gc();
	
}
public void finalize() 
{
	System.out.println("garbage collected");
}


}


