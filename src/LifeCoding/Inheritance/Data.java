package LifeCoding.Inheritance;

// �ڷ������� �ڹٿ��� ������ ������ �Ǽ��� �������� ������ ����ڰ� ���Ƿ� �ڷ����¸� ���� �� �ִ�.
class BookDTO{
	String name;
	int price;
	String company;
	int page;
}

public class Data {

	public static void main(String[] args) {
		
		BookDTO b = new BookDTO(); // �̸� �����ص� Ŭ������ b��� ������ �ν��Ͻ��� �޸𸮿� �ø���.
		
		b.name = "�ڹ�å";
		b.price = 25000;
		b.company = "�Ѻ�";
		b.page = 300;
		
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);

	}

}
