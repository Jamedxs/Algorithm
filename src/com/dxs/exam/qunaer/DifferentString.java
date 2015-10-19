package com.dxs.exam.qunaer;

public class DifferentString {

	public static void main(String[] args) {  
        System.out.println(dif("abcde","bcde"));  
        System.out.println(dif("dabc","aabcef"));  
        System.out.println(dif("abcdefe","aabcadef"));  
    }  
  
    static String dif(String str1, String str2) {  
        int flag[] = new int[26];  
        StringBuffer sb = new StringBuffer();  
        str1 = str1.toLowerCase().trim();  
        str2 = str2.toLowerCase().trim();  
        for(int i=0;i<str1.length();i++){  
            flag[str1.charAt(i)-'a']--;  
        }  
        for(int i=0;i<str2.length();i++){  
            flag[str2.charAt(i)-'a']++;  
        }  
        for(int i=0;i<flag.length;i++){  
//          System.out.println("flag["+i+"]="+flag[i]);  
            if(flag[i]<0){  
                int count = Math.abs(flag[i]);  
                for(int j=0;j<count;j++){  
                    sb.append("-");  
                    sb.append((char)(i+'a'));  
                    sb.append(",");  
                }  
            }else if(flag[i]>0){  
                for(int j=0;j<flag[i];j++){  
                    sb.append("+");  
                    sb.append((char)(i+'a'));  
                    sb.append(",");  
                }  
            }  
        }  
        if(sb.lastIndexOf(",")==sb.length()-1)  
            sb.deleteCharAt(sb.length()-1);  
        return sb.toString();  
    }  

}
