package Day_20210416;

import java.util.Scanner;

/*
 * 
 * 题目描述：
 * KiKi知道了大一三科比较重要课程的分数，包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
 * 
 * 输入描述:
 * 一行，三个整数，用空格分隔，代表三科成绩。
 * 
 * 输出描述:
 * 一行，一个整数，代表输入三科分数中的最高分数。
 * 
 * 示例1
 * 输入：
 * 90 88 99
 * 输出：
 * 99
 * 
 * */

public class GetHightScore {
	public static void main(String[] args){
		System.out.println("请输入第一门课的分数：");
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		
		System.out.println("请输入第二门课的分数：");
		int i2 = sc.nextInt();
		
		System.out.println("请输入第三门课的分数：");
		int i3 = sc.nextInt();
		
		//定义一个最高分
		int max;

		//if判断最高分
//		if(i1>i2){
//			if(i1>i3){
//				max=i1;
//			}else{
//				max=i3;
//			}
//		}else{
//			if(i2>i3){
//				max=i2;
//			}else{
//				max=i3;
//			}
//		}
		
		//三目运算符
		int tmp = (i1>i2)?i1:i2;
		max = (tmp>i3)?tmp:i3;
		
		System.out.println("三门课程最高分是："+max);
	}
}
