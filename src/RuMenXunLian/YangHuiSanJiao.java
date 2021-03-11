package RuMenXunLian;

import java.util.Scanner;

/*
 * 
 * 题目描述：
 * KiKi知道什么叫杨辉三角之后对杨辉三角产生了浓厚的兴趣，他想知道杨辉三角的前n行，请编程帮他解答。
 * 杨辉三角，本质上是二项式(a+b)的n次方展开后各项的系数排成的三角形。
 * 其性质包括：每行的端点数为1， 一个数也为1；每个数等于它左上方和上方的两数之和。
 * 
 * 输入描述
 * 第一行包含一个整数数n。 (1≤n≤30)
 * 
 * 输出描述
 * 包含n行，为杨辉三角的前n行，每个数输出域宽为5。
 * 
 * 示例1
 * 输入：6
 * 输出：
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 * 
 * */

public class YangHuiSanJiao {
	public static void main(String[] args){
		System.out.println("请输入杨辉三角的边长：");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int[][] arr1 = new int[x][x];
		
		//赋值
		for(int i=0;i<arr1.length;i++){
			//每行第一个赋值1
			arr1[i][0]=1;
			//每行最后一个赋值1
			arr1[i][i]=1;
		}
		
		for(int i=2;i<arr1.length;i++){
			for(int m=1;m<i;m++){
				//从第3行开始,每行第2列到倒数第2列,每个元素等于上一行的元素+上一行前一列元素
				arr1[i][m]=arr1[i-1][m]+arr1[i-1][m-1];
			}
		}
		
		//展示
		System.out.println("输出：");
		for(int i=0;i<arr1.length;i++){
			for(int m=0;m<i+1;m++){
				System.out.printf("%5d", arr1[i][m]);
			}
			System.out.println();
		}
	}
}
