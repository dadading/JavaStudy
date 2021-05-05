package Day_20210505;

import java.util.ArrayList;

/*
 * 
 * 去除ArrayList中重复的元素
 * 
 * */

public class ArrayListDemo {
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

		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < arr.size(); i++) {
			if (!arr2.contains(arr.get(i))) {
				arr2.add(arr.get(i));
			}
		}
		System.out.println(arr2);
	}
}
