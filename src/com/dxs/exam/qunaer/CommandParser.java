package com.dxs.exam.qunaer;

public class CommandParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
        System.out.println(parser("-name jack -age 20 -address \"HangZhou ZheDa Road\""));  
        System.out.println(parser("    -name jack -age 20 -address \"HangZhou ZheDa Road\""));  
        System.out.println(parser("-name    jack -age 20    -address \"HangZhou ZheDa Road\""));  
        System.out.println(parser("-name jack -age 20 -address \"HangZhou ZheDa Road   \"   "));  
    }  
      
    static String parser(String str){  
        String params[] = str.split("-");  
        for(int i=0;i<params.length;i++){  
            params[i]=params[i].trim();//ȥ��ǰ��ո�  
            params[i]=params[i].replaceAll("\\s+", " ");//ȥ���м�ո�  
        }  
        StringBuffer sb = new StringBuffer();  
        sb.append("[");  
        for(int i=0;i<params.length;i++){  
            if(params[i].length()!=0 && !params[i].equals("")){  
                sb.append("-");  
                sb.append(params[i]);  
                if(i!=params.length-1){  
                    sb.append(", ");  
                }  
            }  
        }  
        sb.append("]");  
        return sb.toString();  
    }  

}
