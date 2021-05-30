package Day_20210530;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student2> hs = new TreeSet<Student2>(
				new Comparator<Student2>() {

					@Override
					public int compare(Student2 o1, Student2 o2) {
						// TODO Auto-generated method stub

						// 比较总成绩
						int num = o1.totalScore() - o2.totalScore();

						// 比较语文成绩
						int num2 = num == 0 ? o1.getChinsesScore()
								- o2.getChinsesScore() : num;

						// 比较英语成绩
						int num3 = num2 == 0 ? o1.getEnglishScore()
								- o2.getEnglishScore() : num2;

						// 比较数学成绩
						int num4 = num3 == 0 ? o1.getMathScore()
								- o2.getMathScore() : num3;

						// 比较姓名
						int num5 = num4 == 0 ? o1.getName().compareTo(
								o2.getName()) : num4;
						return num5;
					}
				});

		Student2 s1 = new Student2("丁冠一", 100, 100, 100);
		Student2 s2 = new Student2("丁冠一", 100, 100, 99);
		Student2 s3 = new Student2("丁冠一", 100, 200, 0);
		Student2 s4 = new Student2("谢海平", 100, 100, 100);
		Student2 s5 = new Student2("丁晓燕", 100, 100, 100);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);

		System.out.println("姓名\t语文成绩\t英语成绩\t数学成绩");
		for (Student2 s : hs) {
			System.out.println(s.getName() + "\t" + s.getChinsesScore() + "\t"
					+ s.getEnglishScore() + "\t" + s.getMathScore());
		}

	}
}
