package cn.itcast.game;

import java.util.Scanner;

/**
 * 
 * 这是猜数字小游戏
 * 
 * @author dingguanyi
 * @version v1.0
 *
 */

public class GuessNumberBean {
	private GuessNumberBean() {

	}

	public static void start() {
		// 产生一个随机数
		int number = (int) (Math.random() * 100) + 1;

		// 定义一个统计变量
		int count = 0;

		while (true) {
			// 键盘录入一个数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数据(1-100):");
			int guessNumber = sc.nextInt();
			count++;

			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else if (guessNumber == number) {
				System.out.println("恭喜你猜了" + count + "次,就猜中了");
				break;
			}
		}
	}
}
