
public class sololearn {

	
	public static void main(String args[]) {

}
}

/*
 * 	int n=0;
	int []a={2,0};
	n++;
	a[n]=n;
	System.out.println(a[0]+a[1]);
	
	output---->3
 */
/*
 * public class sololearn {
static int rect(int m,int n){
	if(m%n==0){
		return n;
	}else{
		return rect(n,m%n);
	}
}
	
	public static void main(String args[]) {
System.out.println(rect(15,9));
	}
}

output----->3
 */
/*
 * 
 * public class sololearn {
	public String a1;
	public sololearn(String a1){
		this.a1=a1;
		}
	public static void main(String args[]) {
sololearn a=new sololearn("1");
sololearn c=a;
a=new sololearn("3");
System.out.println(a.a1);
System.out.println(c.a1);
	}
}

output--->31
 */

/*
 * public class sololearn { public static void main(String args[]) {
 * System.out.println((int)true>(int)false); } }
 * 
 * error
 * 
 * cannot cast boolean to int
 */

/*
 * 
 * int x=4; do{ System.out.println(x); x++; if(x<7) continue; }while(false);
 * 
 * output--->4
 */

/*
 * 
 * 
 * int j=6; int i=1; while(i<j){ System.out.println("*"); i++; }
 * 
 * 
 * output-->4
 */
/*
 * int k=0; while(k!=9){ if(k%2==0) System.out.println(k); k++; }
 * 
 * output--->02468
 */
/*
 * 
 * int n=15,s=0,x; for(int i=0;i<=n;i++ ){ x=n%10; s=s+x; n=n/10; }
 * System.out.println(s);
 * 
 * output-->6
 */

/*
 * 
 * int a=1; for(a=5;a<5;a++){}
 * 
 * System.out.println(a); output--->5
 */
/*
 * for(int i=0;i<2;i++)
 * 
 * System.out.println(i);
 * 
 * output--->01
 */

/*
 * 
 * 
 * int x=4; int y=0; switch(--x){ case 3: y+=x; case 4: y+=x; default: y++;
 * break; } System.out.println(y);
 * 
 * output-->7
 */
/*
 * int i=0; boolean a=true; boolean b=true; boolean c=(a&&(i++)==0);
 * c=(b&&(i+=2)>0); System.out.print(i); output------>3
 */

/*
 * 
 * public static void main(String a[]) {
 * 
 * System.out.print(c(4,7)); } private static String c(int f,int t){ String
 * s=""; while(f<=t) s+=f++; return s; }
 * 
 * output-------->4567
 * 
 * 
 * 
 * public class sololearn { public static void main(String a[]) { a a1=new a();
 * System.out.print(a1.x); } }
 * 
 * class a{ public int x=2; a(){ x++;
 * 
 * 
 * output---->3
 */