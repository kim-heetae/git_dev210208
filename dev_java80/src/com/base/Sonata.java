package com.base;

public class Sonata {
	//전역변수 선언
	//변수를 부르면(호출하면)
	//바퀴수를 담을 변수 선언
	int wheelNum = 4;//선언과 초기화를 동시에 처리함.
	//타입이 String이면 문자열을 담을 수 있다.
	String carColor = "black";
	/*****************************************************
	 * 메소드를 선언하기
	 * @param args - 파라미터의 타입은 배열 입니다.
	 * :파라미터는 사용자가 입력한 값을 받는 곳이다.
	 * :파라미터 자리에도 변수를 선언할 수 있다.
	 * ->이것을 지역변수라 한다.
	 * ->초기화를 할 수 없다.
	 * ->왜냐하면 호출될때 값이 넘어 오니깐.....
	 ****************************************************/
	/* 일하는 순서[알고리즘]가 있다.
	 * 23[메인메소드-메인스레드-entry point-가장먼저 시작됨-exe파일로 만들수있다]-24~36(초록:주석-실행하지 않음)
	 * 37[출력담당-모니터에]-41[인스턴스화:himCar-지역변수성격]-42-43-[변수선언]-44[변수초기화]-45[]-46-47-48-49-50
	 */
	public static void main(String[] args) {
		//System-클래스이다.
		//out은 변수인데 출력을 담당하는 변수
		//사용자가 입력한 값을 입력 받고 싶은 땐 System.in과 같이 사용함.
		//System은 로컬에서 사용되고 있는 컴터를 말함
		//출력창에 뭔가를 내보내고 싶을때 사용하는 변수(속성) - out
		//out을 제공하는 자가 누구인가? System
		//자바가상머신이 이것을 확인하려면 속성에 접근할 수 있어야 하는데
		//이때 사용하는 식별자가 .(dot)연산자 이다.
		//소유주.속성.메소드이름()
		//클래스의 구성요소 2가지는 무엇일까요?
		//너 변수와 메소드를 구분할 수 있는거야?
		//생긴 모양, syntax 구분할 수 있다.
		//이런(변수와 메소드) 것들은 어떻게 사용하나요?
		System.out.println("나는 소나타 입니다.");
		//insert here
		//자동차 바퀴수를 출력하고 싶을때?
		//5
		Sonata himCar = new Sonata();//Sonata himCar = null; himCar = new Sonata();로 나누어 적을수 있다.
		System.out.println("소나타의 바퀴수는 " + himCar.wheelNum + "개입니다.");//4로 출력
		int speed = 0;
		System.out.println("현재 소나타의 속도는 " + speed);//에러발생시 프로그램 멈춤
		speed = 50;
		System.out.println("현재 소나타의 속도는 " + speed);//50
		speed = 30;
		System.out.println("현재 소나타의 속도는 " + speed);//30
	}//end of main

}