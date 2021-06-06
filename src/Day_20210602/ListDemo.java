package Day_20210602;

//List接口是一个有序,元素可重复的集合,此接口可以通过索引精确的控制每个元素插入的位置。
//允许null元素的插入

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList特点：
		// 底层数据结构是数组,查改快,增删慢
		// 非线程安全,效率高
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());

		// 初始化添加元素
		al.add("java");
		al.add("hello");
		al.add("world");
		al.add(null);

		// 查:底层原码就是拿到index,直接返回集合值
		System.out.println(al.get(1));

		// 改:底层原码就是拿到index,进行修改操作
		System.out.println(al.set(0, "0"));
		System.out.println("al=" + al);

		// 增:将index以及之后的元素复制到index+1的位置往后,然后在index将元素插入
		al.add(0, "java");
		System.out.println("al=" + al);

		// 删:将index+1后面所有的元素左移,最后一位设置为null
		al.remove(0);
		System.out.println("al=" + al);
		System.out.println("-------------");

		// LinkedList特点：
		// 底层数据结构是链表,查改慢,增删快
		// 非线程安全,效率高
		LinkedList<String> ll = new LinkedList<String>();

		// 添加元素
		ll.add("11");
		ll.add("22");
		ll.add("33");
		ll.add(null);

		// 查:底层原码通过for循环查找
		System.out.println(ll.get(0));

		// 改:底层原码通过for循环查找,在修改
		ll.set(0, "00");
		System.out.println("ll=" + ll);

		// 增:块
		ll.add(0, "00");
		System.out.println("ll=" + ll);

		// 删:快
		ll.remove(0);
		System.out.println("ll=" + ll);

	}
}
