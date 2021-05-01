package Day_20210429;

import java.util.Arrays;
import java.util.Scanner;

/*
 *有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。 
 * 第一行输入一个整数(0≤N≤50)。
 * 第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
 * 第三行输入想要进行插入的一个整数。
 * 
 * 输入：
 * 5
 * 1 6 9 22 30
 * 8
 * 
 * 输出：
 * 1 6 8 9 22 30
 * 
 * 
 * */

public class StringSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i1 = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		int i2 = sc.nextInt();

		// System.out.println("i1=" + i1);
		// System.out.println("s1=" + s1);
		// System.out.println("i2=" + i2);

		// 创建string
		StringBuilder sb = new StringBuilder(s1).append(" ").append(i2);
		// System.out.println(sb);

		// 字符串转化为int数组并排序
		int[] arr1 = new int[i1 + 1];
		String[] str1 = sb.toString().split(" ");
		for (int i = 0; i < i1 + 1; i++) {
			arr1[i] = Integer.parseInt(str1[i]);
		}
		Arrays.sort(arr1);

		// 展现
		// System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
