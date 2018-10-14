package youtube;


class animal{
	int a;
	animal(){
		System.out.println("parent constructor invoked");
	}
}
class dog extends animal{
	int b;
	dog()
	{
		System.out.println("child constructor is invoked");
		System.out.println("<-------class names-------->");
		System.out.println(this.getClass()+":"+super.getClass());
		System.out.println("<--------hash codes----->");
		System.out.println(this.hashCode()+":"+super.hashCode());
		}
}
public class InheritanceProof {
	public static void main(String[] args) throws InterruptedException {
	
		dog d=new dog();
	System.out.println(d);
	System.out.println("sleeping............"); // check in visual JVM
	Thread.sleep(10*60*1000);
	System.out.println("sleeping ended");

}
}