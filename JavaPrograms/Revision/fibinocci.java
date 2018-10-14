package Revision;

public class fibinocci {
public static void main(String[] args) {
	int limit=10;
	for(int i=0;i<limit;i++)
	{
		System.out.println(fib(i));
		
	}
}

private static int fib(int i) {
	// TODO Auto-generated method stub
	if(i==0)
	return 0;
	if(i==1)
		return 1;
	else
		return fib(i-1)+fib(i-2);
}

}
