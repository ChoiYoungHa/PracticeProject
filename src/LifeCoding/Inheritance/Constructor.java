package LifeCoding.Inheritance;

class Sam{ // �����ڴ� Ŭ�����̸��� �Լ����� �����Ͽ� �ν��Ͻ�ȭ�Ҷ� ���ڰ��� ������ �ְԲ� ���ִ� �Ծ��̴�.
	int v1, v2;
	Sam(int v1,int v2){
	System.out.println("I'm Instructor");
	this.v1=v1; this.v2=v2; // ���⼭ this�� ���ڰ��� ���� �ڱ��ڽ��� �ǹ��Ѵ�.
	}
	
	public int sum() {
		return this.v1+v2; 
	}
}
class Da extends Sam{ // �θ� �����ڸ� �ڽĵ� �����ڰ� �־���Ѵ�.

	Da(int v1, int v2) { //�׷��� �θ��� �����ڸ� �״�� �޾ƿ���, �� Ȯ���� �� �ְ�, ���ڰ��� �θ�Ŭ�������� �������� �޴´ٴ� �ǹ̷� super�� ���
		super(v1, v2);
		System.out.println("I'm Sun Instructor!");
	}
	public int minus() {
		return super.v1-v2;
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		
		Sam s1 = new Sam(1, 2);
		System.out.println(s1.sum());
		
		Da d1 = new Da(3,1);
		System.out.println(d1.minus());
		
		
		

	}

}
