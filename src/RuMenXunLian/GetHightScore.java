package RuMenXunLian;

import java.util.Scanner;

/*
 * 
 * ��Ŀ������
 * KiKi֪���˴�һ���ƱȽ���Ҫ�γ̵ķ�����������������ƻ�����������Ӣ����̰����ҵ������е���߷֡�
 * 
 * ��������:
 * һ�У������������ÿո�ָ����������Ƴɼ���
 * 
 * �������:
 * һ�У�һ�������������������Ʒ����е���߷�����
 * 
 * ʾ��1
 * ���룺
 * 90 88 99
 * �����
 * 99
 * 
 * */

public class GetHightScore {
	public static void main(String[] args){
		System.out.println("�������һ�ſεķ�����");
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		
		System.out.println("������ڶ��ſεķ�����");
		int i2 = sc.nextInt();
		
		System.out.println("����������ſεķ�����");
		int i3 = sc.nextInt();
		
		//����һ����߷�
		int max;

		//if�ж���߷�
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
		
		//��Ŀ�����
		int tmp = (i1>i2)?i1:i2;
		max = (tmp>i3)?tmp:i3;
		
		System.out.println("���ſγ���߷��ǣ�"+max);
	}
}
