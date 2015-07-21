package com.dxs.sring;

import java.util.Map;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String s = new String();
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.length());*/
		int i;
		//System.out.println(Integer.toBinaryString(i));
		i = (i = 22) ^ i >>> 1;
		System.out.println(Integer.toBinaryString(i));
	}

	public class BusyFlag{
		protected Thread busyflag = null;
		protected int busycount = 0;
		
		public synchronized void getBusyFlag(){
			while(tryGetBusyFlag() == false){
				try {
					wait();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		public synchronized boolean tryGetBusyFlag(){
			if(busyflag == null){
				busyflag = Thread.currentThread();
				busycount = 1;
				return true;
			}
			if(busyflag == Thread.currentThread()){
				busycount ++;
				return true;
			}
			return false;
		}
		
		public synchronized void freeBusyFlag(){
			if(getBusyFlagOwner() == Thread.currentThread()){
				busycount--;
				if(busycount == 0)
					busyflag = null;
					notify();
			}
		}
		
		public synchronized Thread getBusyFlagOwner(){
			return busyflag;
		}
	}
}
