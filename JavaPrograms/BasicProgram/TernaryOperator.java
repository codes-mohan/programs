package BasicProgram;

public class TernaryOperator {
public static void main(String[] args) {
	int a=20,b=50,c=80;
	int largest=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println("largest number= "+largest);
}
}
