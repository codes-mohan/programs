// if two interfaces contains methods with same name same/different arguments
// then we can implement both at a time

//but if two interfaces contains same method name but different return type
// then we acn't implement both at a time



interface first{
	void method();
}
interface second{
	int method();
	
}


public class InterfaceNamingConflicts implements first,second {
public static void main(String[] args) {
	InterfaceNamingConflicts i=new InterfaceNamingConflicts();

}

@Override
public int method() {
	// TODO Auto-generated method stub
	return 0;
}


}
