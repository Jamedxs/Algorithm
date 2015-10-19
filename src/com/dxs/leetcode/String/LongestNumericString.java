package com.dxs.leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 查询字符串中最长 数字串    此题不是leecode上的题目
 * @author dengxusheng
 * 2015年9月18日
 */
public class LongestNumericString {
	public static String Continumax(String intputStr) {
        char[] charArray = intputStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                sb.append(charArray[i]);
            } else {
                sb.append(",");
            }
        }
        String[] digitArray = sb.toString().replaceAll("(,)+", ",").split(",");//得到数字数组
        if (digitArray.length <= 1) {
            //System.out.println("没有数字串！");
            return null;
        }
        List<String> digitList = new ArrayList<String>(Arrays.asList(digitArray));//转化为list方便操作
        List<String> positiveDigitList = fetchContinueDigitByPositiveSort(digitList, true);//得到正向连续的数字比如1234，345
        List<String> backDigitList = fetchContinueDigitByPositiveSort(digitList, false);//得到反向连续的数字比如4321，765
        List<String> lastList = new ArrayList<String>();
        lastList.addAll(positiveDigitList);
        lastList.addAll(backDigitList);
        int maxLength = 0;
        String maxValue = "";
        List<String> endStrList = new ArrayList<String>();
        for (String s : lastList) {         //找出最长并且是最后一个的值和长度
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        for (String s : lastList) {         //找出最长并且是最后一个的值和长度
            if (s.length() == maxLength) {
                endStrList.add(s);
            }
        }
        //int startIndex = 0;
        int lastIndex = intputStr.length();
        int sum = 0;//保存 相同字符串的和
        for (String s : endStrList) {
        	if (intputStr.indexOf(s) <= lastIndex){
        		lastIndex = intputStr.indexOf(s);
        	}
        	int nowSum = jisuan(s);
        	if(nowSum > sum){
        		sum = nowSum;
        		maxValue = s;
                maxLength = s.length();
        	}else if(nowSum == sum){
        		if (intputStr.indexOf(s) <= lastIndex) {
                    maxValue = s;
                    maxLength = s.length();
                }
        	}
            
        }
        //System.out.println("最大连续数字串为：" + maxValue);
        //System.out.println("其长度为：" + maxLength);
        return maxValue;
    }
 
    private static List<String> fetchContinueDigitByPositiveSort(List<String> digitList, boolean isPositive) {
        List<String> lastDigitList = new ArrayList<String>();
        for (String s : digitList) {
            if (s.equals("")) {
                continue;
            }
            char[] charArray = s.toCharArray();
            int start = Integer.parseInt(String.valueOf(charArray[0]));
            int begin = Integer.parseInt(String.valueOf(charArray[0]));
            int startIndex = 0;
            if (charArray.length == 1) {
                lastDigitList.add(String.valueOf(start));
                return lastDigitList;
            }
            for (int j = 1; j < charArray.length; j++) {
                if (isPositive) {
                    if (begin + 1 == Integer.parseInt(String.valueOf(charArray[j])) && j != charArray.length - 1) {
                        begin = begin + 1;
                        continue;
                    }
                } else {
                    if (begin - 1 == Integer.parseInt(String.valueOf(charArray[j])) && j != charArray.length - 1) {
                        begin = begin - 1;
                        continue;
                    }
                }
                begin = Integer.parseInt(String.valueOf(charArray[j]));
                if (start == begin) {
                    lastDigitList.add(String.valueOf(start));
                } else if (j == charArray.length - 1 && ((isPositive && Integer.parseInt(String.valueOf(charArray[j])) - 1 == Integer.parseInt(String.valueOf(charArray[j - 1])))
                        || (Integer.parseInt(String.valueOf(charArray[j])) + 1 == Integer.parseInt(String.valueOf(charArray[j - 1]))))) {
                    lastDigitList.add(String.valueOf(charArray).substring(startIndex, j + 1));
                } else {
                    lastDigitList.add(String.valueOf(charArray).substring(startIndex, j));
                    if (j == charArray.length - 1) {
                        lastDigitList.add(String.valueOf(charArray[j]));
                    }
                }
                start = begin;
                startIndex = j;
            }
 
        }
        return lastDigitList;
 
    }
 
    private static int jisuan(String str){
    	int result = 0;
    	for (int i = 0; i < str.length(); i++) {
    		result += (int)str.charAt(i);
		}
    	return result;
    }
    
    public static void main(String[] arg) {
    	Scanner cin = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while(cin.hasNextLine()){
			list.add(cin.nextLine());
		}
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			//System.out.println(str);
			System.out.println(Continumax(str));
		}
    }
}
