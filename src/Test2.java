import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入信息：");
		String[] s1 = sc.nextLine().split(" ");
		double price = Double.parseDouble(s1[0]);
		int month = Integer.parseInt(s1[1]);
		int day = Integer.parseInt(s1[2]);
		int coupon = Integer.parseInt(s1[3]);
		double spend;

		if (month == 11 || day == 11) {
			if (coupon == 1) {
				spend = Math.max(0.0, price * 0.7 - 50);
				System.out.print(String.format("%.2f", spend));
			} else if (coupon == 0) {
				spend = price * 0.7;
				System.out.println(String.format("%.2f", spend));
			}
		} else if (month == 12 || day == 12) {
			if (coupon == 1) {
				spend = Math.max(0.0, price * 0.8 - 50);
				System.out.println(String.format("%.2f", spend));
			} else if (coupon == 0) {
				spend = price * 0.8;
				System.out.println(String.format("%.2f", spend));
			}
		} else {
			System.out.println(String.format("%.2f", price));
		}
	}
}
