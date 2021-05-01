package Day_20210427;

import java.util.Scanner;

public class CountDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String[] str = sc.nextLine().split(" ");
			int year = Integer.parseInt(str[0]);
			int month = Integer.parseInt(str[1]);

			switch (month) {
			case 2:
				if (year % 4 == 0 || year % 400 == 0) {
					System.out.println(29);
				} else {
					System.out.println(28);
				}
				break;
			case 4:
				System.out.println(30);
				break;
			case 6:
				System.out.println(30);
				break;
			case 9:
				System.out.println(30);
				break;
			case 11:
				System.out.println(30);
				break;
			case 12:
				System.out.println(31);
				break;
			default:
				System.out.println(31);
			}
		}
	}
}
