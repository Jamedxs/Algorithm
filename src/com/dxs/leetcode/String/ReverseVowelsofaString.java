package com.dxs.leetcode.String;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月4日 上午10:25:01
 * Write a function that takes a string as input and reverse only the vowels of a string.
	Example 1:
	Given s = "hello", return "holle".
	Example 2:
	Given s = "leetcode", return "leotcede".
	Note:
	The vowels does not include the letter "y".
	
	解析：反转一个string中的元音字母，立马想到的是，将元音存在Set中，然后判断字母是否为元音。然后利用头和尾两个指针来遍历，判断如果都是元音字母，就交换。一开始想直接用String进行操作，最后发现太麻烦了，还是把string先转成数组再操作比较方便。
 */
public class ReverseVowelsofaString {
	public String reverseVowels(String s) {
        String str = "aeiou";
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
        	set.add(str.charAt(i));
		}
        char[] res = s.toCharArray();
        int i = 0,j = s.length() - 1;
        while(i < j){
        	while(i < j && !set.contains(Character.toLowerCase(res[i]))) i++;
        	while(i < j && !set.contains(Character.toLowerCase(res[j]))) j--;
        	
        	char temp = res[i];
        	res[i] = res[j];
        	res[j] = temp;
        	i++;
        	j--;
        }
        return new String(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
