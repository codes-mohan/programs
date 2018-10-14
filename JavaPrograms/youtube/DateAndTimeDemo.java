package youtube;

import java.util.Date;

public class DateAndTimeDemo {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	System.out.println("The system date and time is");
	Date d=new Date();
	System.out.println(d);
	System.out.println(new Date());
	// new date() anonymous object
	System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
}
}
