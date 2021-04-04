package RuMenXunLian;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        int[] arr1 = {5,3,2,4,1};
        //≈≈–Ú«∞
        System.out.print("[");
        for(int i=0;i<arr1.length;i++){
        	if(i==arr1.length-1){
        		System.out.println(arr1[i]+"]");
        	}else{
        		System.out.print(arr1[i]+", ");;
        	}
        }
        
        //√∞≈›≈≈–Ú
//        for(int i=0;i<arr1.length-1;i++){
//        	int flag = 0;
//        	for(int m=0;m<arr1.length-1-i;m++){
//        		if(arr1[m]>arr1[m+1]){
//        			int tmp = arr1[m];
//        			arr1[m] = arr1[m+1];
//        			arr1[m+1] = tmp;
//        			flag = 1;
//        		}
//        	}
//        	if(flag==0){
//        		break;
//        	}
//        }
        
        //—°‘Ò≈≈–Ú
//        for(int i=0;i<arr1.length-1;i++){
//        	for(int m=i+1;m<arr1.length;m++){
//        		if(arr1[i]>arr1[m]){
//        			int tmp = arr1[i];
//        			arr1[i] = arr1[m];
//        			arr1[m] = tmp;
//        		}
//        	}
//        }
        
        //≤Â»Î≈≈–Ú
        for(int i=1;i<arr1.length;i++){
        	for(int m=i;m>0;m--){
        		if(arr1[m]<arr1[m-1]){
        			int tmp = arr1[m];
        			arr1[m] = arr1[m-1];
        			arr1[m-1] = tmp;
        		}
        	}
        }
        
        //≈≈–Ú∫Û
        System.out.print("[");
        for(int i=0;i<arr1.length;i++){
        	if(i==arr1.length-1){
        		System.out.println(arr1[i]+"]");
        	}else{
        		System.out.print(arr1[i]+", ");;
        	}
        }
    }
}

