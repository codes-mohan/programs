import java.util.*;

public class CalenderDemo{
	public static void main(String args[])
	{
		Calendar cc = Calendar.getInstance();
		TimeZone tz =cc.getTimeZone();
		System.out.println(tz);
		GregorianCalendar gc = new GregorianCalendar(tz);
		System.out.println(gc);
	}
}