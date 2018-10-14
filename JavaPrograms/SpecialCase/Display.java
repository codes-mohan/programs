package SpecialCase;

public class Display {
public static void main(String[] args) throws InterruptedException {
	//char c[]= {'h','e','l','l','o',' ','s','u','k','u','m','a','r','\n','h','o','w',' ','a','r','e',' ','y','o','u',' ','?'};
	
	String str="hello world!!";
	for(int i=0;i<str.length();i++)
	{
		System.out.print(str.charAt(i));
		Thread.sleep(500);
	}
	
}
}
