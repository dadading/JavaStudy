package RuMenXunLian;

/*
 * 插入排序
 * 
 * */

public class InsertSort {
	public static void main(String[] args){
		int[] arr1 = {3,5,2,1,4};
		
	    //排序前
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.println(arr1[i]+"]");
			}else{
				System.out.print(arr1[i]+", ");
			}
		}
		
		//插入排序
		for(int i=1;i<arr1.length;i++){
			for(int m=i;m>0;m--){
				if(arr1[m]<arr1[m-1]){
					int tmp = arr1[m];
					arr1[m] = arr1[m-1];
					arr1[m-1] = tmp;
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
