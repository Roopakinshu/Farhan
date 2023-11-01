package javaday2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
		simpleDateFormat.format(date);
		System.out.println(simpleDateFormat.format(date));
		
	}
}
