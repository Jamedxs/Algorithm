package com.dxs.exam.qihu;

import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年8月11日
 */
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
        int t = 0;
        int num[][] = new int[1000][2];
        int k = 0;
        
        while(cin.hasNextInt())
        {
            t = cin.nextInt();
            num[k][0] = cin.nextInt();
            num[k][1] = cin.nextInt();
            k++;
        }
        //镇长总人数，默认为0
        int zzSum[] = null;
        //用于存放镇长人选数序号
        int zz[] = null;
        
        for (int i = 0; i < k; i++) {
			//先取出总人数和关系数
        	int zzi = 0;
        	int zzj = 0;
        	int sum = num[i][0];
        	int relationSum = num[i][1];
        	if(relationSum == 0){
        		zzSum[zzi++] = 0;
        		zz[zzj++] = 0;
        		continue;
        	}else{
        		
        	}
        
		}
        
        
        
        for (int i = 0; i < (2*t); i++) {
			
		}
        
	}

}
