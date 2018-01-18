package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dengxusheng on 2018-01-18.
 */
public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j])
                    res[i] = j;
            }
        }
        return res;
    }
    public static int[] anagramMappings2(int[] A, int[] B) {
        int[] res = new int[A.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i],i);
        }
        for (int i = 0; i < A.length; i++) {
            if(map.containsValue(A[i]))
                res[i] = (Integer) map.get(A[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int A[] = {12, 28, 46, 32, 50};
        int B[] = {50, 12, 32, 46, 28};
        System.out.println(anagramMappings2(A,B));
    }
}
