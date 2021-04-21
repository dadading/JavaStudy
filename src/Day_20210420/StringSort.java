package Day_20210420;

public class StringSort {
	public static void main(String[] args) {
		String str1 = "bcagfde";
		char[] chr1 = str1.toCharArray();

		// 排序前
		System.out.println(str1);

		selectSort(chr1);
		String str2 = String.valueOf(chr1);

		// 排序后
		System.out.println(str2);
	}

	public static void selectSort(char[] chr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < chr1.length - 1; i++) {
			for (int m = i; m < chr1.length - 1; m++) {
				if (chr1[i] > chr1[m + 1]) {
					char min = chr1[m + 1];
					chr1[m + 1] = chr1[i];
					chr1[i] = min;
				}
			}
		}
	}

}
