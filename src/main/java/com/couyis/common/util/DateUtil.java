package com.couyis.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date getMinDate() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		Date minDate = null;
		try {
			minDate = dateFormater.parse("1900-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minDate;
	}

	public static Date getMinDateTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date minDate = null;
		try {
			minDate = dateFormater.parse("1900-01-01 00:00:01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minDate;
	}

	public static Date getTodayMinDateTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date minDate = null;
		try {
			minDate = dateFormater.parse(getToday() + " 00:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minDate;
	}

	public static Date getMaxDate() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		Date maxDate = null;
		try {
			maxDate = dateFormater.parse("2500-01-01");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxDate;
	}

	public static Date getMaxDateTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date maxDate = null;
		try {
			maxDate = dateFormater.parse("2500-01-01 00:00:01");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxDate;
	}

	public static Date getTodayMaxDateTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date minDate = null;
		try {
			minDate = dateFormater.parse(getToday() + " 23:59:59");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minDate;
	}

	public static String getTodayDir() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy/MM/dd");
		return dateFormater.format(new Date());
	}

	public static String getToday() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormater.format(new Date());
	}

	public static String getDateString(Date date) {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMdd");
		return dateFormater.format(date);
	}

	public static String getDateString(Date date, String format) {
		if (format == null || "".equals(format)) {
			return "";
		}
		SimpleDateFormat dateFormater = new SimpleDateFormat(format);
		return dateFormater.format(date);
	}
}
