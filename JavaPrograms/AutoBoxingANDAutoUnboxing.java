
public class AutoBoxingANDAutoUnboxing {
	 public static void main(String[] args)
	 {
	  Integer iob = 100; //Auto-boxing of int i.e converting primitive data type int to a Wrapper class Integer
	  int i = iob;   //Auto-unboxing of Integer i.e converting Wrapper class Integer to a primitve type int
	  System.out.println(i+" "+iob);

	  Character cob = 'a';  //Auto-boxing of char i.e converting primitive data type char to a Wrapper class Character
	  char ch = cob;  //Auto-unboxing of Character i.e converting Wrapper class Character to a primitive type char
	  System.out.println(cob+" "+ch);
	 }

	
}


