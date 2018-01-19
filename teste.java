import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

import com.sun.org.apache.xpath.internal.functions.Function;

public class teste {
	public static void main(String[] args) {

	Calendar cal = Calendar.getInstance();
	    //Date date =  (Date) calendar.getTime();
		 Date date = new Date();
		 LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

	       // display time and date using toString()
		 int day   = localDate.getDayOfMonth();
		 System.out.println(day);
	    
	   // System.out.println(date);
	    
	}
}
