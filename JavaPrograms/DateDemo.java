import java.util.*;

public class DateDemo
{
@SuppressWarnings("deprecation")
public static void main(String args[])
	{
		Date d = new Date();
		int i1 = d.getHours();
		int i2 = d.getMinutes();
		int i3 = d.getSeconds();
		System.out.println(i1+"  "+i2+"   "+i3);
	}
}