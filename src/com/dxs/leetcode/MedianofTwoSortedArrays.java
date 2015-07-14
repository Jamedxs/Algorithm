package com.dxs.leetcode;

public class MedianofTwoSortedArrays {
	
	public static void main(String[] args) {
		int[] nums1= {1,2,3,7,8};
		int[] nums2= {4,5,6,9};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int numlength1 = nums1.length;
		int numlength2 = nums2.length;
		int total = numlength1 + numlength2;
		if(total <= 0 ) return 0;
		if(total % 2 != 0){
			//奇数
			return  find_k(nums1,nums2,total/2 + 1);
		}else
			return (find_k(nums1,nums2,total/2) + find_k(nums1,nums2,total/2 + 1) ) / 2.0;
	}
	private static int find_k(int[] A,int[] B,int k){
		int m = A.length;
		int n = B.length;
		if(m > n) return find_k(B,A,k);
		if(m == 0) return B[k-1];
		if(k == 1) return Math.min(A[0], B[0]);
		
		int a = Math.min(k/2, m);
		int b = k-a;
		if(A[a - 1] < B[b - 1]){
			int[] A1 = new int[m-a];
			for (int i = 0; i < A1.length; i++) {
				A1[i] = A[a+i];
			}
			return find_k(A1, B, k-a);
		}else if(A[a - 1] > B[b - 1]){
			int[] B1 = new int[n-b];
			for (int i = 0; i < B1.length; i++) {
				B1[i] = B[b+i];
			}
			return find_k(A, B1, k-b);
		}else 
			return A[a-1];
	}
}
