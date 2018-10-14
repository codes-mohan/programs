package BasicProgram;



public class CountingInString {
public static void main(String[] args) {
	String str="this is a string!!";
	int vowels=0,consonants=0,digits=0,spaces=0,specialchars=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			++vowels;
		}
		else if(ch[i]>='a'&& ch[i]<='z') {
			++consonants;
		}
		else if(ch[i]>'0' && ch[i]>'1')
		{
			++digits;
		}
		else if(ch[i]==' ')
		{
			++spaces;
		}
		else {
			++specialchars;
		}
			
	}
	System.out.println("vowels: "+vowels);
	System.out.println("consonants: "+consonants);
	System.out.println("digits: "+digits);
	System.out.println("spaces: "+spaces);
	System.out.println("specialcharacters: "+specialchars);
}
}
