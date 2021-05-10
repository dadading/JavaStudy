package Day_20210510;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据,以0结束,要求控制台输出这些数据中的最大值
 * 
 * 
 * */

public class ListDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (true) {
			System.out.println("请输入一个数据：");
			int number = sc.nextInt();
			if (number == 0) {
				break;
			} else {

				arr.add(number);
			}
		}

		Integer[] arr2 = new Integer[arr.size()];
		arr.toArray(arr2);

		Arrays.sort(arr2);

		System.out.println(arr + "输出最大的数字：" + arr2[arr2.length - 1]);
	}
}
