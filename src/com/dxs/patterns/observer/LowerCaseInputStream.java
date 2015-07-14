package com.dxs.patterns.observer;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 扩展自FilterInputStream，所有io的装饰者都是扩展自这个类
 * @author dengxusheng
 */
public class LowerCaseInputStream extends FilterInputStream{
	
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	//实现两个read方法，一个针对字节，一个针对 字节数组
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c: Character.toLowerCase((char)c));
	}
	
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		int result = super.read(arg0, arg1, arg2);
		for(int i = arg1; i < result + arg1; i++){
			arg0[i] = (byte)Character.toLowerCase((char)arg0[i]);
		}
		return result;
	}
}
