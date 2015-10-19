package com.dxs.exam.ali;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dengxusheng
 * 2015年8月23日
 */
public class Test1 {
	public static void main(String[] args) {
		
	}
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	public  int  repeatThree(int[] num){
		int len = num.length;
		int result = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < len; i++) {
			if(map.containsKey(num[i])){
				int value = (Integer) map.get(num[i]);
				value++;
				map.put(num[i], value);
			}else{
				map.put(num[i], 1);
			}
		}
		
		Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer,Integer> entry = it.next();
			if(3 == entry.getValue()){
				result = entry.getKey();
			}
		}
		return result;
	}
	
}
