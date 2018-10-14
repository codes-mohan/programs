package BasicProgram;

public class printprime {
public static void main(String[] args) {
	int upperlimit=10;
	int sum=0;
	for(int i=1;i<=upperlimit;i++)
	{
		int count=0;
		for(int j=i;j>=1;j--)
		{
			if(i%j==0)
				count+=1;
		}
		if(count==2)
			sum+=i;
			System.out.println(i);
			
	}
	
	// sum of first 10 prime numbers
	
	System.out.println(sum);
	/*for(int i=2;i<upperlimit;i++)
	{
		boolean isprime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				
				isprime=false;
			break;
		}
		if(isprime)
		{
			System.out.println(i);
		}
	}*/
}
}
