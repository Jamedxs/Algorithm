package com.dxs.leetcode.Array;

/**
 * Created by dengxusheng on 2017-09-25.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     Note:
     You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
     解析：比较nums1 和nums2 的 最后一个数字，将较大的放在 nums1[m+n-1] 。然后从后到前一次比较，如果A中所有的元素都比B小，那么前m个还是A原来的内容，没有改变。如果A中的数组比B大的，当A循环完了，B中还有元素没加入A，直接用个循环把B中所有的元素覆盖到A剩下的位置
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        while(m >= 0 && n >= 0){
            nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while(n >= 0){
            nums1[k--] = nums2[n--];
        }
    }
}
