package com.dxs.sort;

import com.dxs.util.SortAlgorithmTempleMethod;

public class SelectSort {
	public static void sort(Comparable[] a){
		int n = a.length;
		SortAlgorithmTempleMethod sortTemple = new SortAlgorithmTempleMethod();
		for(int i = 0; i < n;i++ )
		{
			int min = i;
			for (int j = i+1; j < n; j++) {
				if(sortTemple.less(a[j], a[min]))
					min = j;
			}
			sortTemple.exch(a, i, min);
		}
	}
}
