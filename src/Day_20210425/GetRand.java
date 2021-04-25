package Day_20210425;

import java.util.Scanner;

/*
 * 
 * 获取任意范围内的随机数
 * 
 * 
 * */

public class GetRand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数字：");
		int start = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int end = sc.nextInt();

		int result = (int) ((end - start + 1) * Math.random() + start);
		System.out.println(start + "和" + end + "之前的随机数是：" + result);
	}
}