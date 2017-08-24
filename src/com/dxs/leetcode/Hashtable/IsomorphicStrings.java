package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dengxusheng on 2017-08-24.
 * Given two strings s and t, determine if they are isomorphic.
 Two strings are isomorphic if the characters in s can be replaced to get t.
 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 For example,
 Given "egg", "add", return true.
 Given "foo", "bar", return false.
 Given "paper", "title", return true.
 解析：判断两个string是否具有相同的构成，将s和t都将遍历到一个map中，s作为key。再将t遍历到一个set中，这个时候就可以判断如果map中存在字符的话那么value和t的字符不等，返回false。如果没在map中，先判断t的字符在set中是否存在，如果存在则返回false。
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        Map<Character,Character> map = new HashMap<Character,Character>();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(map.containsKey(sch)){
                if(map.get(sch) != tch){
                    return false;
                }
            }else{
                if(set.contains(tch)){
                    return false;
                }

                map.put(sch,tch);
                set.add(tch);
            }
        }

        return true;
    }
}
