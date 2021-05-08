import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();

		Student s1 = new Student("丁冠一", 30);
		Student s2 = new Student("谢海平", 27);
		arr.add(s1);
		arr.add(s2);

		// 遍历
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName() + "---"
					+ arr.get(i).getAge());
		}
		System.out.println("----------");

		Iterator<Student> ite = arr.iterator();
		while (ite.hasNext()) {
			Student s = ite.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("----------");

		if (arr != null) {
			for (Student s : arr) {
				System.out.println(s.getName() + "---" + s.getAge());
			}
		}
	}
}