package CaveOfProgramming;
import java.util.ArrayList;
 
class Machines{
 
    @Override
    public String toString() {
        return "I am a machine";
    }
     
    public void start() {
        System.out.println("Machine starting.");
    }
 
}
 
class Camera extends Machines {
    @Override
    public String toString() {
        return "I am a camera";
    }
     
    public void snap() {
        System.out.println("snap!");
    }
}
 
class genericsDemo {
 
    public static void main(String[] args) {
 
        ArrayList<Machines> list1 = new ArrayList<Machines>();
 
        list1.add(new Machines());
        list1.add(new Machines());
 
        ArrayList<Camera> list2 = new ArrayList<Camera>();
 
        list2.add(new Camera());
        list2.add(new Camera());
 
        showList(list2);
        showList2(list1);
        showList3(list1);
    }
 
    public static void showList(ArrayList<? extends Machines> list) {
        for (Machines value : list) {
            System.out.println(value);
            value.start();
        }
 
    }
     
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
     
    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
 
 
}