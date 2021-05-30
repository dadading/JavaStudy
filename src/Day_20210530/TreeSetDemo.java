package Day_20210530;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();

		Student s1 = new Student("dingguanyi", 30);
		Student s2 = new Student("xiehiaping", 27);
		Student s3 = new Student("dingxiaoyan", 33);
		Student s4 = new Student("dingguanyi", 27);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);

		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
