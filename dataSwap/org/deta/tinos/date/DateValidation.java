package org.deta.tinos.date;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import org.deta.tinos.stable.Stable;
//refer www.bjtime.com 第 12，13，14行 共三行
//注意如果bjtime 网站关闭了这个功能，该函数将无效，请再互联网搜索其他提供时间校验的网址。
public class DateValidation{
	public static boolean currentSystemTimeCheck(long offsetUTC8
			, long miliSecondsDistinction) throws IOException {
		URL url= new URL(Stable.STRING_BJTIME);
		URLConnection uRLConnection= url.openConnection();
		uRLConnection.connect();
		long bjtime= uRLConnection.getDate();
		long system= currentSystemTimeToUTC(offsetUTC8);
		if(miliSecondsDistinction< Math.abs(bjtime- system)) {
			return false;
		}
		return true;	
	}

	public static long currentSystemTimeToUTC(long offsetUTC8) {
		return new Date().getTime()+ offsetUTC8;
	}
}