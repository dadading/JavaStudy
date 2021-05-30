package Day_20210530;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		// 名字长度
		int num = o1.getName().length() - o2.getName().length();
		// 比较年龄
		int num2 = num == 0 ? o1.getAge() - o2.getAge() : num;
		// 比较姓名
		int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;

		return num2;
	}

}
