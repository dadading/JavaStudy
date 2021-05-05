package Day_20210505;

import java.util.ArrayList;

/*
 * 
 * 去除ArrayList中重复的元素
 * 不能创建新的集合
 * 
 * 
 * */

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		arr.add("dingguanyi");
		arr.add("hello");
		arr.add("world");
		arr.add("hello");
		arr.add("hello");
		arr.add("java");
		arr.add("java");
		arr.add("dingguanyi");

		System.out.println(arr);

		for (int i = 0; i < arr.size() - 1; i++) {
			for (int m = i + 1; m < arr.size(); m++) {
				if (arr.get(i).equals(arr.get(m))) {
					arr.remove(m);
					m--;
				}
			}
		}
		System.out.println(arr);
	}
}
