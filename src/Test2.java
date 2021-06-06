import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class Test2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		m.put("丁冠一", "谢海萍");
		m.put("帅哥", "美女");
		m.put("孙悟空", "七仙女");

		Set<Map.Entry<String, String>> set = m.entrySet();

		for (Map.Entry<String, String> s : set) {
			System.out.println(s.getKey() + "=" + s.getValue());
		}
	}
}