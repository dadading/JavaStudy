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
        	for(int m=0;m<arr.length-i;m++){
        		if(arr[m]>arr[m+1]){
        			int tmp = arr[m];
        			arr[m] = arr[m+1];
        			arr[m+1] = tmp;
        		}
        	}
        }
        return arr;
    }
}
