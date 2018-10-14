
public class GenericConstructorDemo {

	<T> GenericConstructorDemo(T t){
		System.out.println(t);
	}
public static void main(String[] args) {
	@SuppressWarnings("unused")
	GenericConstructorDemo d=new GenericConstructorDemo(2);
	@SuppressWarnings("unused")
	GenericConstructorDemo d1=new GenericConstructorDemo("hello");
}
}
