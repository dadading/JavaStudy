package Day_20210423;

import java.util.Scanner;

/*
 * 
 * 输入一个字符串,计算这个字符串里面有多少个大写字符,多少个小写字符,多少个数字字符
 * 
 * */

public class CharacterDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		char[] chr1 = sc.nextLine().toCharArray();

		for (int i = 0; i < chr1.length; i++) {
			if (Character.isLowerCase(chr1[i])) {
				smallCount++;
			} else if (Character.isUpperCase(chr1[i])) {
				bigCount++;
			} else if (Character.isDigit(chr1[i])) {
				numberCount++;
			}
		}

		System.out.println("大写字符出现次数：" + bigCount);
		System.out.println("小写字符出现次数：" + smallCount);
		System.out.println("数字字符出现次数：" + numberCount);
	}
}
