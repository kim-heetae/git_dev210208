package com.base;
/* ()가 있는경우
 * 1. 메소드
 * 2. 생성자
 * 3. 형변환 연산자 = Casting 연산자
 */
public class Test {

	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;
		f = (float)d;//Casting연산자 - 강제로 형변환을 시킴
		d = f;
	}

}
