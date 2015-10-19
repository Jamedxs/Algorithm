package com.dxs.sring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年9月25日
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List list = new ArrayList();
		while(cin.hasNextInt())
        {
			list.add(cin.nextInt());
        }
		
		List resultList = maxLongNums(list);
		Iterator it = resultList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
	}
	
	public static List maxLongNums(List list){
		int length = list.size();
		int sum = 0;
		int begin = 0;
		int end = 0;
		int max = 0;
		for (int i = 0; i < length; i++) {
			int k = i;
			int thisMax = 0;
			for (int j = i; j < length; j++) {
				sum += (Integer)list.get(j);
				if(sum == 0){
					thisMax = j - k;
					if(thisMax > max){
						max = thisMax;
						begin = k;
						end = j;
					}
				}
			}
			
		}
		List resultList = new ArrayList();
		
		for (int i = begin; i <= end; i++) {
			resultList.add((Integer)list.get(i));
		}
		
		return resultList;
	}

}
