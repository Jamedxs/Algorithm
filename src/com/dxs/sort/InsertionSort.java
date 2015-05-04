package com.dxs.sort;

import com.dxs.util.SortAlgorithmTempleMethod;

public class InsertionSort {
	public static void sort(Comparable[] a){
		int n = a.length;
		SortAlgorithmTempleMethod sortTemple = new SortAlgorithmTempleMethod();
		for (int i = 1; i < n; i++) {
			//��a[i]���뵽a[i-1],a[i-2]....֮��
			for (int j = i; j > 0 && sortTemple.less(a[j], a[j-1]); j--) {
				sortTemple.exch(a, j, j-1);
			}
		}
	}
}
