package Day_20210425;

import java.util.Scanner;

/*
 * 
 * 1.5-15位数字
 * 2.不能以0开头
 * 
 * */

public class QQCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的qq号码：");
		String qq = sc.nextLine();

		if (checkQQ(qq)) {
			System.out.println("您输入的QQ是：" + qq + ",是合法的");
		} else {
			System.out.println("您输入的QQ是：" + qq + "是非法的");
		}

	}

	public static boolean checkQQ(String qq) {
		boolean flag = true;

		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char[] chr1 = qq.toCharArray();
				for (int i = 0; i < chr1.length; i++) {
					if (!Character.isDigit(chr1[i])) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}
