package RuMenXunLian;

/*
 * 
 * 冒泡排序方
 * 
 * */

public class BubbleSort {
	public static void main(String[] args){
		int[] arr1 = {5,4,3,2,1};
		
		for(int i=0;i<arr1.length-1;i++){
			int flag = 0;
			for(int m=0;m<arr1.length-1-i;m++){
				if(arr1[m]>arr1[m+1]){
					int tmp = arr1[m];
					arr1[m] = arr1[m+1];
					arr1[m+1] = tmp;
					flag = 1;
				}
				//若本身就是有序数列,则只需外循环一次
				if (flag==0){
					break;
				}
			}
		}
		
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.print(arr1[i]+"]");
			}else{
				System.out.print(arr1[i]+", ");
			}
		}
	}
}
