package String;

import java.util.Scanner;

public class CountVowels {
public static void main(String[] args) {
	System.out.println("Enter any string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int vowel=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
		switch(str.charAt(i))
		{
		case 'a':
		case 'e':
		case 'u':
		case 'i':
		case 'o':
			vowel++;
		}
	}
	
	
	System.out.println("total vowels: "+vowel);
}
}
