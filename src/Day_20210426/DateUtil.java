package Day_20210426;

/*
 * 
 * 日期工具类
 * 
 * 
 * */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {

	private DateUtil() {
	}
	
	public static String dateToString(Date d,String format){
		return new SimpleDateFormat(format).format(d);
	}
	
	public static Date stringToDate(String d,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(d);
	}

}
