package com.dxs.exam.qunaer;

public class DecryptionString {

	/**
	 * ���ַ����ܣ����ܵĹ������£�a2bc3c5e6,����֮��Ľ���ǣ�aabcbcbcccceeeeee,����������ֵ���������͵����ֵ
	 */
	public static void main(String[] args) {
		String s1 = "a2bc3d1";
		System.out.println(decode(s1));

	}
	private static boolean judgeNumber(char ch){
		if(ch >= '0' && ch <= '9') return true;
		else return false;
	}
	
	
	private static String decode(String str){
		int N = str.length();
		int k = 0;//��¼�����±�
		StringBuilder sbNumber = new StringBuilder();
		StringBuilder sbCharacter = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			if(judgeNumber(str.charAt(i))){//���Ϊ����
				sbNumber.append(str.charAt(i));
				k = Integer.valueOf(sbNumber.toString());
				flag = true;
			}else{
				if(flag){
					for (int j = 0; j < k; j++) {
						sb.append(sbCharacter);
					}
					flag = false;
					sbNumber.delete(0, sbNumber.length());
					sbCharacter.delete(0, sbCharacter.length());
				}
				//�ַ� 
				sbCharacter.append(str.charAt(i));
			}
		}
		for (int i = 0; i < k; i++) {//���һλ�����ֵ����
			sb.append(sbCharacter);
		}
		return sb.toString();
	}
}
