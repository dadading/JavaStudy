package Day_20210602;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Map用于保存具有映射关系的数据,Map里保存两组数据:key和value,key值不能重复

public class MapDemo {
	public static void main(String[] args) {
		// HashMap无序,非线程安全,效率高
		// 允许null值(key和value都允许)
		// 底层是Node数组
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put(null, null);
		hm.put(null, "30");
		hm.put("丁冠一", "30");
		hm.put("谢海平", "27");
		hm.put(null, null);

		System.out.println("hm=" + hm);

		// 提取key值,在使用get()方法得到value值
		Set<String> set = hm.keySet();
		for (String s : set) {
			System.out.println(s + "---" + hm.get(s));
		}
		System.out.println("-----------");

		// 使用entrySet()方法
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
		System.out.println("-----------");

		// TreeMap有序,非线程安全,效率高(O(logN)),但是比不上HashMap(O(1))
		// 不允许key是null,允许多个value是null
		TreeMap<Student3, Integer> tm = new TreeMap<Student3, Integer>(
				new Comparator<Student3>() {

					@Override
					public int compare(Student3 o1, Student3 o2) {
						// TODO Auto-generated method stub
						int num = o1.getAge() - o2.getAge();

						return num;
					}
				});

		Student3 s1 = new Student3("丁冠一", 30);
		Student3 s2 = new Student3("谢海平", 27);
		Student3 s3 = new Student3("丁冠一", 28);
		Student3 s4 = new Student3("丁冠一", 30);

		tm.put(s1, 1);
		tm.put(s2, 2);
		tm.put(s3, 3);
		tm.put(s4, 4);

		Set<Student3> set2 = tm.keySet();
		for (Student3 s : set2) {
			System.out.println(s.getName() + "---" + s.getAge() + tm.get(s));
		}
		System.out.println("-----------");

		for (Map.Entry<Student3, Integer> entry : tm.entrySet()) {
			System.out.println(entry.getKey().getName() + "---"
					+ entry.getKey().getAge() + "---" + entry.getValue());
		}

		TreeMap<String, String> tm2 = new TreeMap<String, String>();
		tm2.put("dingguanyi", null);
		tm2.put("dingguanyi", null);
		tm2.put("xiehaiping", null);
		System.out.println("tm2=" + tm2);
	}

}
