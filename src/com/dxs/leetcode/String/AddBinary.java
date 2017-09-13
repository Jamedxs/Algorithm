package com.dxs.leetcode.String;

/**
 * Created by dengxusheng on 2017-09-13.
 * Given two binary strings, return their sum (also a binary string).
     For example,
     a = "11"
     b = "1"
     Return "100".

     解析：进位操作，使用digit来表示当前位  carry表示进位。最后注意字符串反转。
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        if(a == null || "".equals(a) || a.length() <= 0) return b;
        if(b == null || "".equals(b) || b.length() <= 0) return a;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0){
            int digit = (int)(a.charAt(i--)-'0' +  b.charAt(j--)-'0') + carry ;
            carry = digit / 2;
            digit %= 2;
            sb.append(digit);
        }

        while(i >= 0){
            int digit = (int)(a.charAt(i--)-'0') + carry ;
            carry = digit / 2;
            digit %= 2;
            sb.append(digit);
        }
        while(j >= 0){
            int digit = (int)(b .charAt(j--)-'0') + carry ;
            carry = digit / 2;
            digit %= 2;
            sb.append(digit);
        }
        if(carry>0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
}
