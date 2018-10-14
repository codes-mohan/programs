package SpecialCase;

public class equalsANDequalEqual {
public static void main(String[] args) {
//*********constant pool************//
	
	
	
//---------------------------------------------------------------------//	
	String s1="yes";
	String s2="no";
	
	System.out.println(s1==s2); //false
	System.out.println(s1.equals(s2)); //false
	
	
//------------------------------------------------------------------------//	
	String s3="yes";
	String s4="no";
	s3=s4;
	System.out.println(s3==s4); //true
	System.out.println(s3.equals(s4)); //true
	
	
//-------------------------------------------------------------------------//
	
	String s5="yes";
	String s6="yes";
	
	System.out.println(s5==s6); //true
	System.out.println(s5.equals(s6)); //true
	
	
/*********************non-constant pool************************************/

	String str1=new String("yes");
	String str2=new String("no");
	
	System.out.println(str1==str2);  //false
	System.out.println(str1.equals(str2));  //false
	
	
	//--------------------------------------------------------------------/
	
	String str3=new String("yes");
	String str4=new String("no");
	str3=str4;
	System.out.println(str3==str4);  //true
	System.out.println(str3.equals(str4));  //true
	
	//-----------------------------------------------------------------/
	
	String str5=new String("yes");
	String str6=new String("yes");
	
	System.out.println(str5==str6);  //false
	System.out.println(str5.equals(str6));  //true
	

/**********constant and non-contant mixed************************************/
	
	String string1="yes";
	String string2=new String("no");
	
	System.out.println(string1==string2); //false
	System.out.println(string1.equals(string2));  //false
	
	//-------------------------------------------------------------------/
	
	String string3="yes";
	String string4=new String("no");
	string3=string4;
	System.out.println(string3==string4); //true
	System.out.println(string3.equals(string4));  //true
	
	
	//----------------------------------------------------------------/
	
	String string5="yes";
	String string6=new String("yes");
	
	System.out.println(string5==string6); //false
	System.out.println(string5.equals(string6));  //true
	
	
}
}
