package com.dxs.qunaer;

public class CycleOrderedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int indexOf(int[] array,int target ){
		int lo = 0;
		int hi = array.length-1;
		int mid = 0;
		
		while(lo <= hi){
			mid = (lo + hi)/2;
			if(array[mid] == target) return mid;
			else if(array[lo] < array[mid]){//前半部分有序，后半部分循环有序
				if(target > array[lo] && target < array[mid]){
					hi = mid - 1;
				}
				else{
					lo = mid + 1;
				}
			}else{//后半部分有序，前半部分循环有序
				if(target > array[mid] && target < array[hi]){
					lo = mid + 1;
				}else{
					hi = mid - 1; 
				}
			}
		}
		
		return -1;
	}

}
