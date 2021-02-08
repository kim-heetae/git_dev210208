package com.base;

public class A {
	int age = 30;
	public static void main(String[] args) {
		A a = null;//NullPoiterException 발생하지 않음
		//사용하면 그때 발생.
		a = new A();//이 코드가 없다면
		System.out.println(a.age);//여기서 발생.
	}

}