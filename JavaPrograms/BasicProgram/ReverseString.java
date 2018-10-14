package BasicProgram;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String str;
	String rev ="";
	System.out.println("enter any string");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	
	//-----------------------first method----------------------------------//
	char[] ch=str.toCharArray();
	/*for(int i=ch.length-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
	System.out.println("reversed string: "+rev);
	//---------second method------------------------------------------//
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("reversed string: "+rev);*/
	
	for(int i=0;i<ch.length/2;i++)
	{
	char temp=ch[i];
		ch[i]=ch[ch.length-1-i];
		ch[ch.length-1-i]=temp;
	}
	String s="";
	for(int i=0;i<ch.length;i++)
	{
		s=s+ch[i];
		
	}
	System.out.println(s);
		
	String s1=String.valueOf(ch);
	System.out.println(s1);
	
}
}
