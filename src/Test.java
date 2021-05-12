import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println(Student.age);

		Student s1 = new Student("丁冠一", 30);
		System.out.println(s1.getName() + "---" + s1.getAge());

		Student s2 = new Student();
		System.out.println(s2.getName() + "---" + s2.getAge());
   	}
}