import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.text.Element;

public class Test {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();

		link.add("hello");
		link.add("world");
		link.add("java");

		System.out.println(link);

		System.out.println(link.getFirst());
	}
}
