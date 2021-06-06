package Day_20210602;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//Set接口元素唯一,无序

public class SetDemo {
	public static void main(String[] args) {
		// HashSet底层是哈希表,无序唯一
		// 依赖两个方法保证元素唯一性hashcode()和equals()

		HashSet<String> hs = new HashSet<String>();

		hs.add("dingguanyi");
		hs.add("xiehaiping");
		hs.add("java");
		hs.add("dingguanyi");
		hs.add(null);

		System.out.println("hs=" + hs);

		Student s1 = new Student("丁冠一", 30);
		Student s2 = new Student("谢海平", 27);
		Student s3 = new Student("丁冠一", 33);
		Student s4 = new Student("丁冠一", 30);

		HashSet<Student> hs2 = new HashSet<Student>();
		hs2.add(s1);
		hs2.add(s2);
		hs2.add(s3);
		hs2.add(s4);
		System.out.println("hs2=" + hs2);

		// 增强for
		for (Student s : hs2) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("----------------");

		// 迭代器
		Iterator<Student> ite = hs2.iterator();
		while (ite.hasNext()) {
			Student s = ite.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		// TreeSet底层数据结构是红黑树,唯一有序
		// 自然排序和比较器排序
		TreeSet<Student2> ts = new TreeSet<Student2>(
				new Comparator<Student2>() {

					@Override
					public int compare(Student2 o1, Student2 o2) {
						// TODO Auto-generated method stub

						int num = o1.getChinese() - o2.getChinese();
						int num2 = num == 0 ? o1.getMath() - o2.getMath() : num;
						int num3 = num2 == 0 ? o1.getEnglish()
								- o2.getEnglish() : num2;
						int num4 = num3 == 0 ? o1.getName().compareTo(
								o2.getName()) : num3;
						return num4;
					}
				});

		Student2 s11 = new Student2("丁冠一", 100, 100, 100);
		Student2 s22 = new Student2("谢海平", 60, 60, 60);
		Student2 s33 = new Student2("丁冠一", 100, 90, 80);
		Student2 s44 = new Student2("丁冠一", 60, 100, 60);
		Student2 s55 = new Student2("丁冠一", 100, 100, 100);

		ts.add(s11);
		ts.add(s22);
		ts.add(s33);
		ts.add(s44);
		ts.add(s55);

		System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");
		for (Student2 s : ts) {
			System.out.println(s.getName() + "\t" + s.getChinese() + "\t"
					+ s.getMath() + "\t" + s.getEnglish());
		}
	}
}
