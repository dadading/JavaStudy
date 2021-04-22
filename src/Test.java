public class Test {
	public static void main(String[] args) {
		int[] arr1 = { 22, 11, 55, 44, 33 };

		// 未排序之前
		System.out.print("未排序之前:");
		show(arr1);

		// 冒泡排序
		sort(arr1);

		// 排序之后
		System.out.print("排序之后:");
		show(arr1);

		// 查找22所在的索引
		int index = find(arr1, 22);

		System.out.println("22在数组中出现的索引是：" + index);
	}

	public static int find(int[] arr1, int i) {
		// TODO Auto-generated method stub
		// 定义最大最小索引
		int min = 0;
		int max = arr1.length - 1;

		// 定义中间的索引
		int mid = (min + max) / 2;

		while (arr1[mid] != i) {
			if (i > arr1[mid]) {
				min = mid + 1;
			} else if (i < arr1[mid]) {
				max = mid - 1;
			}
			mid = (min + max) / 2;

			// 如果未找到需要的元素则退出
			if (min > max) {
				return -1;
			}
		}
		return mid;
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

	public static void sort(int[] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int m = 0; m < arr1.length - 1 - i; m++) {
				if (arr1[m] > arr1[m + 1]) {
					int max = arr1[m];
					arr1[m] = arr1[m + 1];
					arr1[m + 1] = max;
				}
			}
		}
	}

}
