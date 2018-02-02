package com.dxs.leetcode.bitManipulation;

import java.util.Stack;

/**
 * @Author: Jamedxs
 * @Description:
 * @create 2018-02-02 上午10:05
 */
public class BinaryNumberwithAlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        if(n <= 0){
            return false;
        }
        String str = Integer.toBinaryString(n);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }else{
                Character ch = stack.peek();
                if(ch == str.charAt(i)){
                    return false;
                }else{
                    stack.push(str.charAt(i));
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(hasAlternatingBits(n));
    }
}
