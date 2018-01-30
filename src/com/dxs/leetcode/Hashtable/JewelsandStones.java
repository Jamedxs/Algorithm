package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

public class JewelsandStones {
    public static int numJewelsInStones(String J, String S) {
        Map<Character,Integer> map = new HashMap<>();
        int ret = 0;

        for (int i = 0; i < S.length(); i++) {

            if(map.get(S.charAt(i)) == null){
                map.put(S.charAt(i),1);
            }else{
                int value = map.get(S.charAt(i));
                map.put(S.charAt(i),++value);
            }
        }
        for (int i = 0; i < J.length(); i++) {
            if(map.containsKey(J.charAt(i))){
                int val = map.get(J.charAt(i));
                ret += val;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}
