package RuMenXunLian;

import java.util.Scanner;

/*
 * 
 * ��Ŀ������
 * KiKi֪��ʲô���������֮���������ǲ�����Ũ�����Ȥ������֪��������ǵ�ǰn�У����̰������
 * ������ǣ��������Ƕ���ʽ(a+b)��n�η�չ��������ϵ���ųɵ������Ρ�
 * �����ʰ�����ÿ�еĶ˵���Ϊ1�� һ����ҲΪ1��ÿ�������������Ϸ����Ϸ�������֮�͡�
 * 
 * ��������
 * ��һ�а���һ��������n�� (1��n��30)
 * 
 * �������
 * ����n�У�Ϊ������ǵ�ǰn�У�ÿ����������Ϊ5��
 * 
 * ʾ��1
 * ���룺6
 * �����
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
		System.out.println("������������ǵı߳���");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int[][] arr1 = new int[x][x];
		
		//��ֵ
		for(int i=0;i<arr1.length;i++){
			//ÿ�е�һ����ֵ1
			arr1[i][0]=1;
			//ÿ�����һ����ֵ1
			arr1[i][i]=1;
		}
		
		for(int i=2;i<arr1.length;i++){
			for(int m=1;m<i;m++){
				//�ӵ�3�п�ʼ,ÿ�е�2�е�������2��,ÿ��Ԫ�ص�����һ�е�Ԫ��+��һ��ǰһ��Ԫ��
				arr1[i][m]=arr1[i-1][m]+arr1[i-1][m-1];
			}
		}
		
		//չʾ
		System.out.println("�����");
		for(int i=0;i<arr1.length;i++){
			for(int m=0;m<i+1;m++){
				System.out.printf("%5d", arr1[i][m]);
			}
			System.out.println();
		}
	}
}
