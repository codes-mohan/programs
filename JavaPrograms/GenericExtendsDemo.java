
public class GenericExtendsDemo{
	// for V only numbers are allowed
	<T,V extends Number> GenericExtendsDemo (T t,V v){
		System.out.println(t);
		System.out.println(v);
	}
public static void main(String[] args) {
	@SuppressWarnings("unused")
	GenericExtendsDemo  d= new GenericExtendsDemo ("string",10);
	//if we pass arguments as (11,"String");
	//it will cause an error
	//because second argument must be of type Number
	
}
}
