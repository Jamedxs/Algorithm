package com.dxs.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[100];
		for (int i = 0; i < 100; i++) {
		num[i] = i;
		}
		
	}
	
	public static void getRandomNum() {
		Set<Integer> sets = new HashSet<Integer>();
		Random random = new Random();
		while (sets.size() < 900) {
			sets.add(random.nextInt(1000));
		}
		Iterator<Integer> it = sets.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}


}
