package com.dxs.leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dengxusheng on 2017-09-01.
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 The order of output does not matter.
 Example 1:
 Input:
 s: "cbaebabacd" p: "abc"

 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".


 Example 2:
 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".

 解析：自己想的解法没实现，看了答案之后，感觉茅塞顿开。将p遍历到26的数组里面，在遍历s的时候，也放到new 出来的26的数组里面。比较两个数组是否相等，当所以当坐标>=i时，每往后遍历一个元素，先前的元素也要减一个。
 */
public class FindAllAnagramsinaString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] pNum = new int[26];
        int[] sNum = new int[26];
        int pLength = p.length(), sLength = s.length();
        for (int i = 0; i < pLength; i++) {
            pNum[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sLength; i++) {
            sNum[s.charAt(i) - 'a']++;
            if(i >= pLength){
                sNum[s.charAt(i-pLength) - 'a']--;
            }
            if(Arrays.equals(sNum,pNum)){
                list.add(i-pLength+1);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
