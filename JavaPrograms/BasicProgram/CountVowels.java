package BasicProgram;

import java.util.Scanner;

public class CountVowels {
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner s=new Scanner(System.in);
	String string=s.nextLine().toLowerCase();
	char[] ch=string.toCharArray();
	int count=0;
	for (char c : ch) {
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
		
		}
	}
	System.out.println("number of vowels: "+count);
}
}
