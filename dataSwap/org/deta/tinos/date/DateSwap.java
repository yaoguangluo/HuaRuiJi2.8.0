package org.deta.tinos.date;
import java.sql.Timestamp;
import java.util.Date;

import org.deta.tinos.stable.Stable;
@SuppressWarnings({Stable.SUPPRESS_WARNINGS_DEPRECATION
	, Stable.SUPPRESS_WARNINGS_STATIC_ACCESS})
public class DateSwap{
	public static String dateToGMTString(Date date) {	
		return date.toGMTString();
	}

	public static String dateToYYYYMMDD(Date date) {	
		return Stable.STRING_EMPTY+ date.getYear()
		+ Stable.STRING_PER+ date.getMonth()
		+ Stable.STRING_PER+ date.getDay();
	}

	public static String dateToHHMMSS(Date date) {	
		return Stable.STRING_EMPTY+ date.getHours()
		+ Stable.STRING_PER+ date.getMinutes()
		+ Stable.STRING_PER+ date.getSeconds();
	}

	public static String dateToMiliSeconds(Date date) {	
		return Stable.STRING_EMPTY+ date.getTime();
	}

	public static String getCurrentMiliSeconds(Date date) {	
		return Stable.STRING_EMPTY+ new Date().getTime();
	}

	public static Timestamp dateToTimeStamp(Date date) {
		long utc= date.UTC(date.getYear(), date.getMonth(), date.getDay()
				, date.getHours(), date.getMinutes(), date.getSeconds());
		return new Timestamp(utc);
	}
	
	public static long timeStampToMiliSeconds(Timestamp timestamp) {
		return timestamp.getTime();
	}
	
	public static String timeStampToMiliSecondsWithSize(Timestamp timestamp
			, int size) {
		String time= Stable.STRING_EMPTY+ timestamp.getTime();
		return time.substring(0, size);
	}
	
	public static String dateStringToMiliSeconds(String string) {
		return Stable.STRING_EMPTY+ new Date(string).getTime();
	}
}