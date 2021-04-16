package Day_20210416;

import Study_20201222.Animal;
import Study_20201222.Dog;


public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + ",b=" + b);
		
		Animal a1 = new Dog();
		
		Dog d1 = (Dog)a1;
		
		System.out.println(a1.hashCode());
		System.out.println(d1.hashCode());
		
		Dog d2 = new Dog("阿黄",3);
		System.out.println(d1.getClass().getName());
		System.out.println(d2.getClass().getName());
		System.out.println("-------------");
		
		System.out.println(d2.toString());
		System.out.println("-------------");
		
		Dog d3 = new Dog("阿黄",3);
		System.out.println(d2.equals(d3));
		System.out.println(a1.equals(d1));
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
