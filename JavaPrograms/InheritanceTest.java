class Room {
	int length;
	int breadth;

	public Room(int l, int b) {
		length = l;
		breadth = b;
	}

	public int roomArea() {
		return length * breadth;
	}
}

class BedRoom extends Room{

	int height;
	
	public BedRoom(int l,int b,int h)
	{
		super(l,b);
		height=h;
	}
	
	public int volume()
	{
		return length*breadth*height;
		
	}
}

public class InheritanceTest {
public static void main(String[] args) {
	BedRoom br=new BedRoom(5,5,5);
	int area=br.roomArea();
	
	int volume=br.volume();
	System.out.println("Area of room= "+area);
	System.out.println("Volume of Bed Room ="+volume);
}
}
