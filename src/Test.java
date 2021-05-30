import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();

		Student s1 = new Student("丁冠一", 30);
		Student s2 = new Student("谢海平", 27);
		Student s3 = new Student("丁晓燕", 33);
		Student s4 = new Student("丁晓燕", 34);
		Student s5 = new Student("诸葛亮", 30);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

		String s11 = "123";
		String s22 = "456";
		String s33 = "123";

		System.out.println(s11.compareTo(s22));
		System.out.println(s11.compareTo(s33));
	}
}