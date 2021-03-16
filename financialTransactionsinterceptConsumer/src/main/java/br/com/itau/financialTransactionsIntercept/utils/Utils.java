package br.com.itau.financialTransactionsIntercept.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static Timestamp convertStringToTimestamp(String dateTime) {

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parsedDate = dateFormat.parse(dateTime);
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

			return timestamp;
		} catch (Exception e) { // this generic but you can control another types of exception
			return null;
		}

	}

	public static Date convertStringToDate(String dateTime) {

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parsedDate = dateFormat.parse(dateTime);

			return parsedDate;
		} catch (Exception e) { // this generic but you can control another types of exception
			return null;
		}

	}

	public static Timestamp getNowDate() {

		Date date = new Date();
		return new Timestamp(date.getTime());
	}

	public static String getLastDateBy2Month() {

		Calendar c = Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		d = c.getTime();
		c.add(Calendar.MONTH, -2);

		c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		d = c.getTime();
		return sdf.format(d);

	}

	public static String getCurrentDate() {

		Calendar c = Calendar.getInstance();
		Date d = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		c.add(Calendar.DATE, 1);
		d = c.getTime();

		return sdf.format(d);

	}

	public static Date formatDateAbacosStringToDate(String date) {

		String DD = date.substring(0, 2);
		String MM = date.substring(2, 4);
		String YYYY = date.substring(4, 8);
		String time = date.substring(9, 21);

		final String datefull = YYYY + "-" + MM + "-" + DD + " " + time;

		return convertStringToDate(datefull);

	}

}
