package Day_20210425;

import java.util.Scanner;

/*
 * 邮箱校验
 * 15305626179@189.cn
 * 98564785@qq.com
 * liuyi@sin.com.cn
 * 
 * 
 * */

public class EmailCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的邮箱：");
		String email = sc.nextLine();

		System.out
				.println("EmailChaek:" + email.matches("\\w+@\\w+(\\.\\w+)+"));
	}
}
