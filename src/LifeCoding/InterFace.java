package LifeCoding;

interface Calcularment{ // �ؿ� ���� �ް���� ������ �޼��带 ��û�ϱ����� �ش����·� ������ۿ� ������ ������ ���ϴ°��� �������̽���.
	int sum(int v1, int v2); // �ް���� �޼����� ���� Ʋ�� �Է����ְ� �������� ���־�ü���� ��ü������ �������ش�.
}

class outpeople implements Calcularment{ // Ŭ������ �������̽��� �޾Ƽ� �Ծ࿡ �°� �ۼ����������� ������ ������ ����.
	public int sum(int v1, int v2) { // �������̽����� ���� ������� ��ü���� �ڵ��� �̾��.
		return v1+v2;
	}
}

class tmp{ // ���� �ް���� ������ ���ϱ� �޼���
	public int sum(int v1, int v2) { // sum�̶�� ������  ��°��� int �Է°��� ���� �Ű������� int v1, v2�� ���ϰ�ʹ�.
		return v1+v2;
	}
}

public class InterFace { 
	public static void main(String[] Args) { 
		outpeople t1 = new outpeople();  // �������̽��� �� ������ �°� �� ������� �޼��带 �״�� �ν��Ͻ�ȭ�ؼ� ����ϸ� 
		System.out.println(t1.sum(1, 2)); // ������ ����ϴ� �������̽��� ȣȯ�̵��� �ʴ� ������ �߻����� �ʴ´�. �̶����� �������̽��� ����Ѵ�.
	}

}
	