package RuMenXunLian;

import java.util.Scanner;

/*
 * ��Ŀ������
 * ��������һ��ѧ����ѧ�ţ��Լ�3�ƣ�C���ԣ���ѧ��Ӣ��ɼ�������Ļ�������ѧ����ѧ�ţ�3�Ƴɼ���
 * 
 * ����������
 * ѧ���Լ�3�Ƴɼ���ѧ�źͳɼ�֮����Ӣ�ķֺŸ������ɼ�֮����Ӣ�Ķ��Ÿ�����
 * 
 * ���������
 * ѧ�ţ�3�Ƴɼ��������ʽ������������
 * 
 * ʾ��1
 * ���룺
 * 17140216;80.845,90.55,100.00
 * �����
 * The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
 * 
 * */

public class ShowScores {
	public static void main(String[] args){
		System.out.println("������ѧ�źͳɼ���");
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split("[;,]");
		
		//չʾ�������Ϣ
//		for(int i=0;i<data.length;i++){
//			System.out.println(data[i]);
//		}
		
		//ת��
		int id = Integer.valueOf(data[0]);
		double score1 = Double.valueOf(data[1]);
		double score2 = Double.valueOf(data[2]);
		double score3 = Double.valueOf(data[3]);
				
		//���
		System.out.printf("The each subject score of  No. "+id+" is "+String.format("%.2f",score1)+", "+String.format("%.2f", score2)+", "+String.format("%.2f", score3)+".");
	}
}
