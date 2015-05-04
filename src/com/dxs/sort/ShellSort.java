package com.dxs.sort;

public class ShellSort {
/*	public static void main(String[] args) {
		Person p=new Person();
		p.setName("yue");
		p.setAge(50);
		p.tell();
	}*/
	public void fun()
	{
		Person p=new Person();
		p.setName("yue");
		p.setAge(50);
		p.tell();
	}
}
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void tell(){
		System.out.println("name:"+name+"age:"+age);
	}
}


