package RuMenXunLian;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Solution s = new Solution();
        int[] arr = {1,23,2,8,5,0};
        int[] arr1 = s.MySort(arr);
        
        System.out.print("[ ");
        for(int i=0;i<arr1.length;i++){
        	if(i==arr1.length-1){
        		System.out.println(arr[i]+"]");
        	}else{
        		System.out.print(arr[i]+", ");
        	}
        }
    }
}

