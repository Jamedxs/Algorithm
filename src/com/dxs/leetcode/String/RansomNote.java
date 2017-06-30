package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月30日 上午9:30:41
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
	Each letter in the magazine string can only be used once in your ransom note.
	Note:
	You may assume that both strings contain only lowercase letters.
	canConstruct("a", "b") -> false
	canConstruct("aa", "ab") -> false
	canConstruct("aa", "aab") -> true
	解析：在magazines 这个string中，看ransom note 这个string中的字符是否出现过，用字符-‘a’,得到一个数字，当作新new出来数组得下标，标记这个字符在magazines 中出现过，然后在遍历 ransom note,同样方法看是否出现过，如果没有出现过，则返回false。
 */
public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
		//将magazine中的字符遍历成ASCII的数值，当成res数组的序号
		for (int i = 0; i < magazine.length(); i++) {
			res[magazine.charAt(i) - 'a']++;
		}
		//遍历ransomNote 看在res数组中是否存在，不存在则返回false
		for(int i = 0; i < ransomNote.length(); i++){
			if(--res[ransomNote.charAt(i) - 'a'] < 0){
				return false;
			}
		}
		
		return true;
    }
	public static void main(String[] args) {
		String ransomNote = "bg";
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		System.out.println(canConstruct(ransomNote,magazine));
	}

}
