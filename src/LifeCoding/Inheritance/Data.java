package LifeCoding.Inheritance;

// 자료형에는 자바에서 정해준 문자형 실수형 정수형이 있지만 사용자가 임의로 자료형태를 만들 수 있다.
class BookDTO{
	String name;
	int price;
	String company;
	int page;
}

public class Data {

	public static void main(String[] args) {
		
		BookDTO b = new BookDTO(); // 미리 설계해둔 클래스를 b라는 형태의 인스턴스로 메모리에 올린다.
		
		b.name = "자바책";
		b.price = 25000;
		b.company = "한빛";
		b.page = 300;
		
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);

	}

}
