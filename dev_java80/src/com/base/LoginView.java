package com.base;

import javax.swing.JFrame;
/*
 * 매소드의 파라미터는 없을 수도 있고
 * 하나일 수도 있으며
 * 둘 이상도 가능하다.   ------ setSize(title, boolean)불가 -- type이 맞지 않기 때문
 * 즉 메소드를 호출할 때는 파라미터의 갯수와 타입 모두가 일치해야 함.
 */
public class LoginView {
	int go(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JFrame jf2 = new JFrame();
		String title = "LogIn";
		int width = 700;
		int height = 500;
		jf.setTitle(title);
		jf.setSize(500, 300);
		jf.setVisible(true);
		LoginView plus = new LoginView();
		int y = plus.go(50, 100);
		System.out.println(y);
		jf2.setTitle(title);
		jf2.setSize(width, height - 200);
		jf2.setVisible(true);
		//int , double , float , short , string , char , byte , long === 원시타입
		//A a = null;
		//a = new A();
		//이 코드가 쓰여져야 하는 위치는? 선언부(클래스 선언 바로 다음) - 변수선언과 메소드 선언 
		//						메소드 안쪽
		//이 코드의 역할은? 선언과 초기화
		//이 코드로 인해 일어나는 메모리의 상태는? NullPoiterException
		//이 코드가 필요한 이유? 인스턴스화 시키고 메소드에서 클래스의 변수를 사용하기 위해
	}

}