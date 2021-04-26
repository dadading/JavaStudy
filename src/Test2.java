import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
		
		String s1 = "2021-02-26 15:57:59";
		System.out.println(sdf.parse(s1));
	}
}
