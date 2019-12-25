package pgm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {

	 DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	 Date date = new Date();
	 System.out.println(format.format(date));
	}
}
