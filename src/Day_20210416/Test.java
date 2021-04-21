package Day_20210416;

import Study_20201222.Animal;
import Study_20201222.Dog;

public class Test {
	public static void main(String[] args) {
		// 冒泡排序
		int[] arr1 = { 2, 4, 5, 1, 3 };

		// 排序之前
		show(arr1);

		// 排序
		// for (int i = 0; i < arr1.length - 1; i++) {
		// for (int m = 0; m < arr1.length - 1 - i; m++) {
		// if (arr1[m] > arr1[m + 1]) {
		// int max = arr1[m];
		// arr1[m] = arr1[m + 1];
		// arr1[m + 1] = max;
		// }
		// }
		// }

		// 选择排序
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int m = i; m < arr1.length - 1; m++) {
				if (arr1[i] > arr1[m + 1]) {
					int min = arr1[m + 1];
					arr1[m + 1] = arr1[i];
					arr1[i] = min;
				}
			}
		}

		// 排序之后
		show(arr1);
	}

	public static void show(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length - 1) {
				System.out.println(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ", ");
			}
		}
	}
}