package RuMenXunLian;

import java.util.Scanner;

/*
 * 对输入的字符串进行反转后输出
 * 
 * */

public class StringReversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入您的字符串:");
		String s1 = sc.nextLine();

		System.out.println("反转之前:" + s1);

		// 开始反转
		String s2 = "";
		char[] c1 = s1.toCharArray();
		for (int i = c1.length - 1; i >= 0; i--) {
			s2 += c1[i];
		}

		System.out.println("反转之后:" + s2);
	}
}
