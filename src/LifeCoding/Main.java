package LifeCoding;
class Print{ // �̷��� �����Լ� ���� Ŭ������ ����� ������ ���������� �ٸ� Ŭ������ ���� �����ִ�.
	public static String ClassVar = "I'm Class Var"; // Ŭ���� �Ҽ��� Ŭ���������� �������ش�. static���� �̹� �޸𸮿� �ö����ִٴ� �ǹ̷� �ν��Ͻ�ȭ�� �Ұ���
	public String InstansVar = "I'm Instans Var"; // �ν��Ͻ� �Ҽ��� �ν��Ͻ������� �������ش�. static�� �����Ƿ� �ν��Ͻ�ȭ���Ѽ� �޸����� �÷� ����ؾ��Ѵ�.
	
	public static void ClassMesod() { // static�� ���Ե� Ŭ���� �޼��� Ŭ���������� ����� �� �ְ� �ν��Ͻ� ������ ����� �����.
		System.out.println(ClassVar); // �ش� �޼��带 ����ϸ� Classvar�� ���� �ִ³����� ��µȴ�.
	//	System.out.println(InstansVar);
	}
	public void InstansMesod() { // static�� ���� �ν��Ͻ� �޼��� Ŭ�������� �ν��Ͻ����� ��� ��� �����ϴ�.
		System.out.println(InstansVar);
		System.out.println(ClassVar);
	}
	public Print(String Paramiter) { //������. �ν��Ͻ�ȭ ��ų�� ��������ϴ� ���������ִٸ� �������� �Բ� �����ؾ� ��밡���ϰԲ� ����� ���Ҵ�.
		this.InstansVar = Paramiter; // �Ű������� �̸��� �갥���� �ʱ����� �ν��Ͻ�ȭ��ų�� �� �ν��Ͻ�������� this�� ���� �������ش�.
	}
	public void A() {
		System.out.println(this.InstansVar); // �ν��Ͻ�ȭ ��ų�� ������ ���� ���⿡ ���޵ȴ�.
		System.out.println("aaaaaaaaa");
		System.out.println("aaaaaaaaa");
	}
	public void B() {
		System.out.println(this.InstansVar); // a�� ����
		System.out.println("bbbbbbbbb");
		System.out.println("bbbbbbbbb");
	}
}

public class Main {
	public static void main(String[] args) {
		
		Print p1 = new Print("----------"); // �����ڷ����� �ν��Ͻ�ȭ��ų�� ������ ����
		p1.A();
		p1.B();
		
		Print p2 = new Print("**********"); // p1�� ����.
		p2.A();
		p2.B();
		
		Print.ClassMesod();
		Print.ClassVar = "I'm Change ClassVar";
		Print.ClassMesod();
	}

}
