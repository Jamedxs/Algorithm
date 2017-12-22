package com.dxs.leetcode.Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dengxusheng on 2017-12-22.
 */
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        if(left < 1 || right > 10000) return null;

        List<Integer> resList = new ArrayList<>();

        for (int i = left; i <= right; i++){
            //判断是否是自分割数
            if(judgeSelfDividingNumbers(i)){
                resList.add(i);
            }
        }

        return resList;

    }

    private static boolean judgeSelfDividingNumbers(int num){
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            Integer j = Integer.parseInt(ch.toString());
            if(j == 0){
                return false;
            }else if(num % j != 0){
                return false;
            }
        }

        return true;

    }

    //参考其他人的做法，通过将i赋值给j j每次除以10  来判断i是否是自分数
    public static List<Integer> selfDividingNumbers2(int left, int right) {
        if(left < 1 || right > 10000) return null;

        List<Integer> resList = new ArrayList<>();

        for (int i = left; i <= right; i++){
            int j = i;
            for (; j>0; j /= 10){
                if( (j % 10 == 0) || (i % (j % 10)) != 0 ) break;
            }
            if(j == 0) resList.add(i);
        }

        return resList;

    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }

}
