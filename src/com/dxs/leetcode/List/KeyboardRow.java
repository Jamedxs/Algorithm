package com.dxs.leetcode.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

	public static String[] findWords(String[] words) {
        
		String[] qStr = {"q","w","e","r","t","y","u","i","o","p","Q","W","E","R","T","Y","U","I","O","P"};
		String[] aStr = {"a","s","d","f","g","h","j","k","l","A","S","D","F","G","H","J","K","L"};
		String[] zStr = {"z","x","c","v","b","n","m","Z","X","C","V","B","N","M"};

		List<String> qList = Arrays.asList(qStr);  
		List<String> aList = Arrays.asList(aStr);
		List<String> zList = Arrays.asList(zStr);
		
		List<String> resultList = new ArrayList<String>();
		
		for (String word : words) {
			List<String> list = new ArrayList<String>();
			Boolean flag = false;
			if(qList.contains(String.valueOf(word.charAt(0)))){
				list = qList;
			}else if(aList.contains(String.valueOf(word.charAt(0)))){
				list = aList;
			}else{
				list = zList;
			}
			for (int i = 1; i < word.length(); i++) {
				if(!list.contains(String.valueOf(word.charAt(i)))){
					flag = true;
					break;
				}
			}
			
			if(flag == false){
				resultList.add(word);
			}
			
		}
		
		return resultList.toArray(new String[resultList.size()]);
		
    }
	
	public static String[] findWords2(String[] words) {
        
		String[] str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length; i++) {
			for (char c : str[i].toCharArray()) {
				map.put(c, i);
			}
		}
		List<String> resultList = new ArrayList<String>();
		
		for (String word : words) {
			if(word.equals("")) continue;
			int k = map.get(word.toUpperCase().charAt(0));
			for (int i = 1; i < word.length(); i++) {
				if(map.get(word.toUpperCase().charAt(i)) != k){
					k = -1;
					break;
				}
			}
			
			if(k != -1){
				resultList.add(word);
			}
		}
		return resultList.toArray(new String[resultList.size()]);
		
    }
	public static void main(String[] args) {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] resList = findWords2(words);
		for (String string : resList) {
			System.out.println(string);
		}
	}

}
