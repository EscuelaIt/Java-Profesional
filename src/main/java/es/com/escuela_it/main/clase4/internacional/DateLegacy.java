package es.com.escuela_it.main.clase4.internacional;

import java.util.Calendar;
import java.util.Date;

public class DateLegacy {

	public static void main(String[] args) {

		Date date = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.YEAR, -2);
		calendar.before(new Date());
		
		Date time = calendar.getTime();

		System.out.println(date);
		System.out.println(time);

	}

}
