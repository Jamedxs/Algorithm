package com.dxs.leetcode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dengxusheng on 2017-09-04.
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] ss = str.split(" ");

        if(ss.length != pattern.length()) return  false;
        int i = 0;
        for (String s : ss) {
            if(map.containsKey(pattern.charAt(i))){
                if(!s.equals((String)map.get(pattern.charAt(i)))){
                    return false;
                }
            }else{
                if (set.contains(s)) return false;
                map.put(pattern.charAt(i),s);
                set.add(s);
            }

            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abbac";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern,str));
    }
}
