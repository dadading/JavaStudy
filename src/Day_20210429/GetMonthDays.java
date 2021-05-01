package Day_20210429;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 
 * 获取输入年份的二月的天数
 * 5
 * 
 * */

public class GetMonthDays {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		//
		// int year = sc.nextInt();

		Calendar c = Calendar.getInstance();
		c.set(2011, 2, 1);
		c.add(Calendar.DATE, -1);

		System.out.println(c.get(Calendar.YEAR) + "年"
				+ (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DATE)
				+ "日");
		// System.out.println(c.get(Calendar.DATE));
	}
}
