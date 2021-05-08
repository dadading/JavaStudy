package Day_20210508;

import java.util.ArrayList;
import java.util.Random;

/*
 * 获取1-20之前的10个随机数,要求不能重复,并展示
 * 
 * */

public class RandomDemo {
	public static void main(String[] args) {

		// 创建整数集合
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// 创建
		Random r = new Random();

		// 定义统计变量
		int count = 0;

		while (count < 10) {
			// 产生1个随机数
			int number = r.nextInt(20) + 1;
			if (!arr.contains(number)) {
				arr.add(number);
				count++;
			}
		}

		// 遍历
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
