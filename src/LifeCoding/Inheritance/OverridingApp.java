package LifeCoding.Inheritance;


class cal { // 부모 클래스
	public int sum(int a, int b) {
		return a+b;
	}	
}

class calsun extends cal{ //자식 클래스 extends 확장하다라는 의미
	public int minus(int a,int b) { // 부모클래스를 받고 minus라는 함수를 만들어 클래스를 기능을 확장함
		return a-b;
	}
	public int sum(int a, int b) { // 부모클래스를 받고 부모클래스의 함수를 재정의함.
		System.out.println("I'm Sun");
		return a+b;
	}
}

public class OverridingApp {
	public static void main(String[] args) {
		
		cal c1 = new cal(); // 부모클래스 인스턴스화
		System.out.println(c1.sum(1, 2));
		
		calsun c2 = new calsun(); // 자식클래스 인스턴스화
		System.out.println(c2.minus(100, 1)); // 자식클래스에서 추가(확장)된 마이너스 함수 사용
		System.out.println(c2.sum(1, 2)); // 자식클래스에서 재정의된 sum 함수 사용
	
	}

}
