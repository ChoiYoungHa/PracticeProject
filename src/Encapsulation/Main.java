package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		
		System.out.println(ph.getNumber()); // ĸ��ȭ�� �������ִºκ��� �ҷ������� get
		
		ph.setNumber(111111111);
		System.out.println(ph.getNumber()); // �������ִ� �κ��� �ٲܷ��� set
		
		System.out.println(Phone.Model); // �����Ǵ� �𵨸� �ҷ����� final�� �����ؼ� �ٲܼ����� ������ �𵨸�
		

	}

}
