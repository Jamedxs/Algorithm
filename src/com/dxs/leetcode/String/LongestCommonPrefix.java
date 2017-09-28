package com.dxs.leetcode.String;

/**
 * Created by dengxusheng on 2017-09-28.
 * Write a function to find the longest common prefix string amongst an array of strings.
    解析：暴力匹配
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0){
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0,i);
            }
        }

        return strs[0];
    }
}
