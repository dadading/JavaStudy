package Day_20210420;

public class Test {
	public static void main(String[] args) {
		String s1 = "cdgfeba";

		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length - 1; i++) {
			for (int m = i; m < c1.length - 1; m++) {
				if (c1[i] > c1[m + 1]) {
					char min = c1[m + 1];
					c1[m + 1] = c1[i];
					c1[i] = min;
				}
			}
		}

		

		System.out.println(s1);
		
		char c2 = 'a';
		System.out.println(c2);
	}
}
