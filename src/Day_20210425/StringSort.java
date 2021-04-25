package Day_20210425;

import java.util.Arrays;

/*
 * 输入："22 44 33 55 11"
 * 输出："11 22 33 44 55"
 * 
 * */

public class StringSort {
	public static void main(String[] args) {
		// 定义一个字符串
		String s1 = "22 44 33 55 11";

		// 将字符串按空格分割成一个字符串数组
		String[] s2 = s1.split(" ");

		// 将字符串数组转换为整数数组
		int[] i1 = new int[s2.length];
		for (int i = 0; i < i1.length; i++) {
			i1[i] = Integer.parseInt(s2[i]);
		}

		// 排序
		Arrays.sort(i1);

		// 将排序后的整数数组拼接
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < i1.length; i++) {
			sb.append(i1[i]).append(" ");
		}
		String result = sb.toString().trim();

		// 结果输出
		System.out.println(result);
	}
}
