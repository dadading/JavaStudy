package RuMenXunLian;

import java.util.*;

public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     * ��������������
     * @param arr int����һά���� �����������
     * @return int����һά����
     */
    public int[] MySort (int[] arr) {
        // write code here
        for(int i=0;i<arr.length-1;i++){
        	int flag = 0;
        	for(int m=0;m<arr.length-1-i;m++){
        		if(arr[m]>arr[m+1]){
        			int tmp = arr[m];
        			arr[m] = arr[m+1];
        			arr[m+1] = tmp;
        			flag = 1;
        		}
        	}
        	if(flag==0){
        		return arr;
        	}
        }
        return arr;
    }
}
