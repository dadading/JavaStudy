package Day_20210420;

public class BinaryFind {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int index = binaryFind(arr1, 4);
		System.out.println("4在数组的" + index + "位置");
	}

	public static int binaryFind(int[] arr1, int value) {
		int min = 0;
		int max = arr1.length - 1;

		// 计算出中间索引
		int mid = (min + max) / 2;

		while (value != arr1[mid]) {
			if (value > arr1[mid]) {
				min = mid + 1;
			} else if (value < arr1[mid]) {
				min = mid - 1;
			}
			mid = (min + max) / 2;

			if (min > max) {
				return -1;
			}
		}
		return mid;
	}
}
