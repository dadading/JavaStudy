package Day_20210530;

import java.util.HashSet;
import java.util.Random;

/*
 * 
 * 
 * 编写一个程序，获取10个1到20的随机数，要求随机数不能重复
 * 
 * 
 */

public class HashSetDemo {
	public static void main(String[] args) {
		// 初始化一个集合
		HashSet<Integer> hs = new HashSet<Integer>();

		// 创建一个随机数
		Random r = new Random();

		// 当集合添加10个元素则跳出循环
		while (hs.size() < 10) {
			int a = r.nextInt(20) + 1;
			hs.add(a);
		}

		// 遍历集合
		for (Integer i : hs) {
			System.out.println(i);
		}
	}
}
