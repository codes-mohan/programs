package SpecialCase;


public class InstanceControlFlow{
    int i=10;
    {
        method();
        System.out.println("first instance block");
    }
        InstanceControlFlow()
        
        {
            System.out.println("constructor");
        }
        public static void main(String[] args) {
            InstanceControlFlow obj=new InstanceControlFlow();
            System.out.println("main method");
        }
        public void method()
        {
        
            System.out.println(j);
        }
    { 
        System.out.println("Second instance blcok");
    }
    int j=20;

}
