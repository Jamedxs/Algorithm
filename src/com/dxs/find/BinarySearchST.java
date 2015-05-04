package com.dxs.find;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	private Key[] keys;
	private Value[] vals;
	private int N;
	public BinarySearchST(int capacity)
	{
		keys = (Key[]) new Comparable[capacity];
		vals = (Value[]) new Object[capacity];
	}
	public int size()
	{
		return N;
	}
}
