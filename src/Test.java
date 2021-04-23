import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 数组元素个数
		while (sc.hasNext()) {
			int index = Integer.parseInt(sc.nextLine());
			int[] arr1 = new int[index];

			String[] s1 = sc.nextLine().split(" ");
			for (int i = 0; i < index; i++) {
				arr1[i] = Integer.parseInt(s1[i]);
			}

			Arrays.sort(arr1);

			for (int m = 0; m < 5; m++) {
				System.out.print(arr1[index - 1 - m] + " ");
			}
		}
	}
}
