package com.dxs.util;

public class SortAlgorithmTempleMethod {
	//对元素进行比较
		public static boolean less(Comparable v, Comparable w) {
			return v.compareTo(w) < 0;
		}
		//交换元素位置
		public static void exch(Comparable[] a, int i, int j) {
			Comparable t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		// 在单行中打印数组
		public static void show(Comparable[] a) { 
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");
				System.out.println();
		}
		//测试数组元素是否有序
		public static boolean isSorted(Comparable[] a) {
			for (int i = 1; i < a.length; i++)
				if (less(a[i], a[i - 1]))
					return false;
			return true;
		}
}
