package LifeCoding;
class Print{ // 이렇게 메인함수 위에 클래스를 만들수 있지만 독립적으로 다른 클래스를 만들 수도있다.
	public static String ClassVar = "I'm Class Var"; // 클래스 소속의 클래스변수를 선언해준다. static으로 이미 메모리에 올라가져있다는 의미로 인스턴스화가 불가능
	public String InstansVar = "I'm Instans Var"; // 인스턴스 소속의 인스턴스변수를 선언해준다. static이 없으므로 인스턴스화시켜서 메모리위에 올려 사용해야한다.
	
	public static void ClassMesod() { // static이 포함된 클래스 메서드 클래스변수만 사용할 수 있고 인스턴스 변수는 사용이 힘들다.
		System.out.println(ClassVar); // 해당 메서드를 사용하면 Classvar에 들어가져 있는내용이 출력된다.
	//	System.out.println(InstansVar);
	}
	public void InstansMesod() { // static이 빠진 인스턴스 메서드 클래스변수 인스턴스변수 모두 사용 가능하다.
		System.out.println(InstansVar);
		System.out.println(ClassVar);
	}
	public Print(String Paramiter) { //생성자. 인스턴스화 시킬때 정해줘야하는 변수값이있다면 변수값과 함께 선언해야 사용가능하게끔 만들어 놓았다.
		this.InstansVar = Paramiter; // 매개변수의 이름과 헛갈리지 않기위해 인스턴스화시킬때 들어갈 인스턴스변수라고 this를 통해 구분해준다.
	}
	public void A() {
		System.out.println(this.InstansVar); // 인스턴스화 시킬때 설정한 값이 여기에 전달된다.
		System.out.println("aaaaaaaaa");
		System.out.println("aaaaaaaaa");
	}
	public void B() {
		System.out.println(this.InstansVar); // a와 동일
		System.out.println("bbbbbbbbb");
		System.out.println("bbbbbbbbb");
	}
}

public class Main {
	public static void main(String[] args) {
		
		Print p1 = new Print("----------"); // 생성자로인해 인스턴스화시킬때 변수값 지정
		p1.A();
		p1.B();
		
		Print p2 = new Print("**********"); // p1과 같다.
		p2.A();
		p2.B();
		
		Print.ClassMesod();
		Print.ClassVar = "I'm Change ClassVar";
		Print.ClassMesod();
	}

}
