package Day_20210601;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
 * 统计字符串中的每个字符出现的字数
 * aaasssdddaaa
 * a(6)s(3)d(3)
 * 
 * 
 * 
 * 
 * */

public class TreeMapDemo {
	public static void main(String[] args) {

		// 输入您的字符串
		System.out.println("请输入您的字符串：");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("您输入字符串是：" + s);

		// 将字符串转换为字符数组
		char[] c = s.toCharArray();

		// 创建集合
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// 遍历数组,若集合不包含元素则添加,包含则把value+1
		for (int i = 0; i < c.length; i++) {
			if (!tm.keySet().contains(c[i])) {
				tm.put(c[i], 1);
			} else {
				tm.put(c[i], tm.get(c[i]) + 1);
			}
		}

		// 遍历结果
		Set<Character> set = tm.keySet();
		for (Character c2 : set) {
			System.out.print(c2 + "(" + tm.get(c2) + ")");
		}
	}
}
