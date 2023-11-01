package javaday2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(simpleDateFormat.format(cal.getTime()));
		System.out.println(simpleDateFormat.format(cal.getTime()));
//		System.out.println(simpleDateFormat.format(cal.getTimeZone()));


	}
}
