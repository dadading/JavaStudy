package Day_20210505;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		Student s1 = new Student("丁冠一", 30);
		Student s2 = new Student("谢海平", 27);
		Student s3 = new Student("丁晓燕", 33);
		Student s4 = new Student("丁冠一", 30);
		Student s5 = new Student("丁冠一", 99);
		Student s6 = new Student("丁冠一", 30);

		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);

		Iterator ite = arr.iterator();
		while (ite.hasNext()) {
			Student s = (Student) ite.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("-----------------");

		// 去除重复元素
		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < arr.size(); i++) {
			if (!arr2.contains(arr.get(i))) {
				arr2.add(arr.get(i));
			}
		}

		Iterator ite2 = arr2.iterator();
		while (ite2.hasNext()) {
			Student s = (Student) ite2.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
