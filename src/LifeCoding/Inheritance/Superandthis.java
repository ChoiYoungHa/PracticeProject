package LifeCoding.Inheritance;


class cal { // �θ� Ŭ����
	public int sum(int a, int b) {
		return a+b;
	}	
}

class calsun extends cal{ //�ڽ� Ŭ���� extends Ȯ���ϴٶ�� �ǹ�
	public int minus(int a,int b) { // �θ�Ŭ������ �ް� minus��� �Լ��� ����� Ŭ������ ����� Ȯ����
		return a-b;
	}
	public int sum(int a, int b) { // �θ�Ŭ������ �ް� �θ�Ŭ������ �Լ��� ��������.
		System.out.println("I'm Sun");
		return a+b;
	}
}

public class OverridingApp {
	public static void main(String[] args) {
		
		cal c1 = new cal(); // �θ�Ŭ���� �ν��Ͻ�ȭ
		System.out.println(c1.sum(1, 2));
		
		calsun c2 = new calsun(); // �ڽ�Ŭ���� �ν��Ͻ�ȭ
		System.out.println(c2.minus(100, 1)); // �ڽ�Ŭ�������� �߰�(Ȯ��)�� ���̳ʽ� �Լ� ���
		System.out.println(c2.sum(1, 2)); // �ڽ�Ŭ�������� �����ǵ� sum �Լ� ���
	
	}

}
