package BasicProgram;

public class swap {
private static int a=10;
static int b=20;

public static void main(String[] args) {
	swap swap=new swap();
	swaping(swap, swap);
	System.out.println(a+" "+b);
	
	// other swapping
  int c=50;
  int d=60;
  c=c+d;
  d=c-d;
  c=c-d;
  System.out.println(c+" "+d);
  ///--------------------------------------///
  int e=80;
  int f=90;
  e=e*f;
  f=e/f;
  e=e/f;
  System.out.println(e+" "+f);
  //-----------------------------------------//
  e=e^f;
  f=e^f;
  e=e^f;
  System.out.println(e+" "+f);
}
/// swap with temp
private static void  swaping(swap a,swap b) {
	// TODO Auto-generated method stub
	int tmp;
	tmp=swap.a;
	swap.a=swap.b;
	swap.b=tmp;
	
	
}
}
