package com.dxs.find;

public class SequentialSearchST <Key,Value>{
	private Node first; //�����׽ڵ�
	private class Node
	{
		//����ڵ�Ķ���
		Key key;
		Value val;
		Node next;
		public Node(Key key,Value val, Node next)
		{
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	public Value get(Key key)
	{
		//���Ҹ����ļ���������ص�ֵ
		for (Node x = first; x !=  null; x = x.next)
		{
			if(key.equals(x.key))
				return x.val; //����
		}
		return null; //δ����
	}
	
	public void put(Key key,Value val)
	{
		//���Ҹ����ļ����ҵ��������ֵ�������ڱ����½��ڵ�
		for (Node x = first; x !=  null; x = x.next)
		{
			if(key.equals(x.key))
			{
				x.val = val; return ;  //����
			} 
		}
		first = new Node(key, val, first);//δ���У��½��ڵ�
	}
}
