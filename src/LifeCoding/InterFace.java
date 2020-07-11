package LifeCoding;

interface Calcularment{ // 밑에 내가 받고싶은 형태의 메서드를 요청하기위해 해당형태로 만들수밖에 없도록 규율을 정하는것이 인터페이스다.
	int sum(int v1, int v2); // 받고싶은 메서드의 형태 틀만 입력해주고 나머지는 외주업체에서 구체적으로 구현해준다.
}

class outpeople implements Calcularment{ // 클래스에 인터페이스를 받아서 규약에 맞게 작성하지않으면 컴파일 오류가 난다.
	public int sum(int v1, int v2) { // 인터페이스에서 정한 규율대로 구체적인 코딩을 이어간다.
		return v1+v2;
	}
}

class tmp{ // 내가 받고싶은 형태의 더하기 메서드
	public int sum(int v1, int v2) { // sum이라는 변수명에  출력값은 int 입력값은 각각 매개변수에 int v1, v2로 정하고싶다.
		return v1+v2;
	}
}

public class InterFace { 
	public static void main(String[] Args) { 
		outpeople t1 = new outpeople();  // 인터페이스로 딱 규율에 맞게 잘 만들어진 메서드를 그대로 인스턴스화해서 사용하면 
		System.out.println(t1.sum(1, 2)); // 기존에 사용하던 인터페이스와 호환이되지 않는 문제는 발생하지 않는다. 이때문에 인터페이스를 사용한다.
	}

}
	