package com.base;

//괄호가 있는 경우 세가지에 대해 말할 수 있다.
//메소드, 생성자, Casting연산자((int)같은것) 뿐이다.
public class SeoulTemp {
	void methodA() {
		
	}
	int methodB() {
		return (int)3.14;
	}
	
	public static void main(String[] args) {
		//insert here - methodB를 호출해 보세요
		SeoulTemp b = new SeoulTemp();
		System.out.println(b.methodB());
	}

}
