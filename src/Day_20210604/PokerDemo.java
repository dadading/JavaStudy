package Day_20210604;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

//模拟扑克牌的洗牌/发牌/看牌功能
//需求分析:
//A:可以将牌的花色点数和index组合成key-value
//B:洗牌可以通过对key的打乱顺序
//C:在去key-value里面去找对应的花色

public class PokerDemo {
	public static void main(String[] args) {
		// 定义一个花色数组
		String[] colors = { "♦", "♣", "♠", "♥" };

		// 定义一个点数数组
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2" };

		// 定义一副扑克
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// 定义个洗牌的index
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 定义每个人手上的牌
		TreeSet<Integer> dingguanyi = new TreeSet<Integer>();
		TreeSet<Integer> xiehaiping = new TreeSet<Integer>();
		TreeSet<Integer> dingxiaoyan = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();

		Integer index = 0;

		// 将牌添加在HashMap
		for (String num : numbers) {
			for (String col : colors) {
				hm.put(index, col.concat(num));
				list.add(index);
				index++;
			}
		}

		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);

		// 洗牌
		Collections.shuffle(list);

		// 发牌
		for (int m = 0; m < list.size(); m++) {
			if (m >= list.size() - 3) {
				dipai.add(list.get(m));
			} else if (m % 3 == 0) {
				dingguanyi.add(list.get(m));
			} else if (m % 3 == 1) {
				xiehaiping.add(list.get(m));
			} else if (m % 3 == 2) {
				dingxiaoyan.add(list.get(m));
			}
		}

		// 看牌
		showPoker("丁冠一", hm, dingguanyi);
		showPoker("谢海平", hm, xiehaiping);
		showPoker("丁晓燕", hm, dingxiaoyan);
		showPoker("底牌", hm, dipai);
	}

	// 看牌功能
	public static void showPoker(String name, HashMap<Integer, String> hm,
			TreeSet<Integer> ts) {
		System.out.print(name + "的牌如下：");
		for (Integer i : ts) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
}
