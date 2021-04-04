package RuMenXunLian;

import java.util.Scanner;

/*
 * 题目描述：
 * 依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
 * 
 * 输入描述：
 * 学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
 * 
 * 输出描述：
 * 学号，3科成绩，输出格式详见输出样例。
 * 
 * 示例1
 * 输入：
 * 17140216;80.845,90.55,100.00
 * 输出：
 * The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
 * 
 * */

public class ShowScores {
	public static void main(String[] args){
		System.out.println("请输入学号和成绩：");
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split("[;,]");
		
		//展示输入的信息
//		for(int i=0;i<data.length;i++){
//			System.out.println(data[i]);
//		}
		
		//转换
		int id = Integer.valueOf(data[0]);
		double score1 = Double.valueOf(data[1]);
		double score2 = Double.valueOf(data[2]);
		double score3 = Double.valueOf(data[3]);
				
		//输出
		System.out.printf("The each subject score of  No. "+id+" is "+String.format("%.2f",score1)+", "+String.format("%.2f", score2)+", "+String.format("%.2f", score3)+".");
	}
}
