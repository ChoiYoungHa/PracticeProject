package LifeCoding.Inheritance;

class Sam{ // 생성자는 클래스이름과 함수명을 같게하여 인스턴스화할때 인자값을 무조건 넣게끔 해주는 규약이다.
	int v1, v2;
	Sam(int v1,int v2){
	System.out.println("I'm Instructor");
	this.v1=v1; this.v2=v2; // 여기서 this는 인자값을 받은 자기자신을 의미한다.
	}
	
	public int sum() {
		return this.v1+v2; 
	}
}
class Da extends Sam{ // 부모가 생성자면 자식도 생성자가 있어야한다.

	Da(int v1, int v2) { //그래서 부모의 생성자를 그대로 받아오고, 더 확장할 수 있고, 인자값은 부모클래스에서 받은값을 받는다는 의미로 super을 사용
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
