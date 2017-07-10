package com.dxs.bitManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月10日 上午9:55:25
 * 
 */
public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<String>();
        //循环24小时中的时间，来判断是否等于num
        for (int h = 0; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if(Integer.bitCount(h*64+m) == num){
					list.add(String.format("%d:%02d", h, m));
				}
			}
		}
        
        return list;
        
    }
	public List<String> readBinaryWatch2(int num) {
        List<String> list = new ArrayList<String>();
        
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
