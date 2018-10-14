package BasicProgram;

import java.util.StringTokenizer;

public class removeMultipleSpaces {
public static void main(String[] args) {
	String str="string with multiple spaces";
	
	//----------------first method---------------------------------//
	StringTokenizer st=new StringTokenizer(str," ");
	StringBuffer sb=new StringBuffer();
	while(st.hasMoreElements())
	{
		sb.append(st.nextElement());
	}
	System.out.println(sb.toString().trim());

	//------------second method-----------------------------------------///

	String [] arr=str.split(" ");
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]);
	}
	//------------------------third method-------------------------------//
	System.out.println(str.replaceAll(" ", ""));
	
}

}
