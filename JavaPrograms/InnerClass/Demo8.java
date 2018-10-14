package InnerClass;

public class Demo8 {
int x=10;
class inner{
	int x=100;
	void show()
	{
		int x=1000;
		System.out.println(x);  //1000
		System.out.println(this.x); //100
 		System.out.println(Demo8.this.x); //10
	}
}
public static void main(String[] args) {
	new Demo8().new inner().show();
}07
}
