import java.util.Date;

import Day_20210426.DateUtil;

public class Test {
	public static void main(String[] args) {
		Date d = new Date();
		String s = DateUtil.dateToString(d, "yyyy-MM-dd");
		System.out.println(s);
	}
}
