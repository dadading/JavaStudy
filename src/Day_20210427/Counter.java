package Day_20210427;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String s1 = sc.nextLine();
			String[] str = s1.split("\\+|-|\\*|/");

			// 如果是两个数据计算则进入计算
			if (str.length == 2) {
				// 提取要计算的两个数据
				double d1 = Double.parseDouble(str[0]);
				double d2 = Double.parseDouble(str[1]);

				// 提取计算符号
				String opt = s1.substring(str[0].length(), str[0].length() + 1);

				switch (opt) {
				case "+":
					System.out.printf("%.4f+%.4f=%.4f", d1, d2, d1 + d2);
					break;
				case "-":
					System.out.printf("%.4f-%.4f=%.4f", d1, d2, d1 - d2);
					break;
				case "*":
					System.out.printf("%.4f*%.4f=%.4f", d1, d2, d1 * d2);
					break;
				default:
					if (d2 == 0) {
						System.out.print("Wrong!Division by zero!");
					} else {
						System.out.printf("%.4f/%.4f=%.4f", d1, d2, d1 / d2);
					}
				}

				System.out.println();
			} else {
				System.out.println("Invalid operation!");
			}
		}
	}
}
