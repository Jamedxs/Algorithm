package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月17日 上午9:29:39
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
	1. 'A' : Absent.
	2. 'L' : Late.
	3. 'P' : Present.
	A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
	You need to return whether the student could be rewarded according to his attendance record.
	Example 1:
	Input: "PPALLP"
	Output: True
	Example 2:
	Input: "PPALLL"
	Output: False
	解析：题目要求，当多于一个A或者连续两个L，就返回false。
 */
public class StudentAttendanceRecordI {
	public static boolean checkRecord(String s) {
        
		int a = 0;
		int l = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A'){
				if(++a > 1) return false;
				l = 0;
			}else if(s.charAt(i)=='L'){
				if(++l > 2) return false;
			}else{
				l = 0;
			}
			
			
			
		}
		
		return true;
    }
	public static void main(String[] args) {
		String s ="PPALLL";
		System.out.println(checkRecord(s));
	}

}
