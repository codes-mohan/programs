class generic<T>{
T value;
generic(T value){
	this.value=value;
	}
void display() {
	System.out.println(value);
}
}


public class GenericClassDemo {
public static void main(String[] args) {
	generic<Integer> g=new generic<>(10);
	g.display();
	generic<String> g1=new generic<>("string");
	g1.display();
}
}
