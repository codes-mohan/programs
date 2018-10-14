package BasicProgram;

public class StringDemo {
public static void main(String[] args) throws Exception {
	
	//-------------------String splitting-----------------------------------//
	
	String str="www.google.com";
	String [] arrstr=str.split("\\.");

	for(int i=0;i<arrstr.length;i++)
	{
		System.out.println(arrstr[i]);
	}
	
	
	//------------------------char array to string-------------------------------------------------------------//
	
	char [] ch= {'g','o','o','d',' ','m','o','r','n','i','n','g'};
	String string=new String(ch);
	System.out.println(string);
	System.out.println("--------valueOf ---------another method-----------------------");
	String string1=String.valueOf(ch);
	System.out.println(string1);
}
}
