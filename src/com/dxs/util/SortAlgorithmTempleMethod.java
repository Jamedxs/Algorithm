package com.dxs.util;

public class SortAlgorithmTempleMethod {
	//��Ԫ�ؽ��бȽ�
		public static boolean less(Comparable v, Comparable w) {
			return v.compareTo(w) < 0;
		}
		//����Ԫ��λ��
		public static void exch(Comparable[] a, int i, int j) {
			Comparable t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		// �ڵ����д�ӡ����
		public static void show(Comparable[] a) { 
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");
				System.out.println();
		}
		//��������Ԫ���Ƿ�����
		public static boolean isSorted(Comparable[] a) {
			for (int i = 1; i < a.length; i++)
				if (less(a[i], a[i - 1]))
					return false;
			return true;
		}
}
