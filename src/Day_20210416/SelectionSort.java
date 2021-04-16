package Day_20210416;

/*
 * 选择排序
 * 
 * 
 * */

public class SelectionSort {
	public static void main(String[] args){
		int[] arr1 = {1,4,3,2,5};
		
		//排序之前
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.println(arr1[i]+"]");
			}else{
				System.out.print(arr1[i]+", ");
			}
		}
		
		for(int i=0;i<arr1.length-1;i++){
			for(int m=i+1;m<arr1.length;m++){
				if(arr1[m]<arr1[i]){
					int min = arr1[m];
					arr1[m] = arr1[i];
					arr1[i] = min;
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
