package RuMenXunLian;

/*
 * ѡ������
 * 
 * 
 * */

public class SelectionSort {
	public static void main(String[] args){
		int[] arr1 = {1,4,3,2,5};
		
		//����֮ǰ
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
		
		//�����
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
