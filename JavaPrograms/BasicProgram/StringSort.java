package BasicProgram;

public class StringSort {
public static void main(String[] args) {
	String [] words= {"Ruby","Python","Java","c"};
	for(int i=0;i<words.length-1;++i)
	{
		for(int j=i+1;j<words.length;++j)
		{
			if(words[i].compareToIgnoreCase(words[j])>0)
			{
				String temp=words[i];
				words[i]=words[j];
				words[j]=temp;
			}
		}
	}
	System.out.println(" in lexicographical order");
	for(int i=0;i<words.length;i++)
	{
		System.out.println(words[i]);
	}
}
}
