package RuMenXunLian;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] arr1 = {5,2,4,3,1};		
		//排序前
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.println(arr1[i]+"]");
			}else{
				System.out.print(arr1[i]+", ");
			}
		}
		
		//冒泡排序
//		for(int i=0;i<arr1.length-1;i++){
//			for(int m=0;m<arr1.length-i-1;m++){
//				if(arr1[m]>arr1[m+1]){
//					int max = arr1[m];
//					arr1[m] = arr1[m+1];
//					arr1[m+1] = max;
//				}
//			}
//		}
		
		//选择排序
//		for(int i=0;i<arr1.length-1;i++){
//			for(int m=i+1;m<arr1.length;m++){
//				if(arr1[i]>arr1[m]){
//					int min = arr1[m];
//					arr1[m] = arr1[i];
//					arr1[i] = min;
//				}
//			}
//		}
		
		//插入排序
		for(int i=0;i<arr1.length-1;i++){
			for(int m=i+1;m>0;m--){
				if(arr1[m]<arr1[m-1]){
					int min = arr1[m-1];
					arr1[m-1] = arr1[m];
					arr1[m] = min;
				}
			}
		}
		
		//排序后
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.println(arr1[i]+"]");
			}else{
				System.out.print(arr1[i]+", ");
			}
		}
	}
}
