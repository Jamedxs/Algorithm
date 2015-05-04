package com.dxs.qunaer;

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
            params[i]=params[i].trim();//去掉前后空格  
            params[i]=params[i].replaceAll("\\s+", " ");//去掉中间空格  
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
