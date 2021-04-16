package RuMenXunLian;

/*
 * 在大串中查找小串出现的次数
 * "123sdfhuhsdfhu123sdhfuhu123shdufhu123hsadufhu123"
 * 
 * */

public class StringFind {
	public static void main(String[] args) {
		String big = "123sdfhuhsdfhu123sdhfuhu123shdufhu123hsadufhu123";
		String small = "123";
		int cnt = 0;

		// System.out.println(big.indexOf(small));
		while (big.indexOf(small) >= 0) {
			big = big.substring(big.indexOf(small) + small.length());
			System.out.println(big);
			cnt += 1;
		}
		System.out.println(big + "中出现" + cnt + "次" + small);
	}
}
