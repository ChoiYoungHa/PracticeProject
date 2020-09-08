package LifeCoding.Inheritance;

class cal2{
	
	public int sum(int v1, int v2) {
		System.out.println("I'm Mother");
		return v1+v2;
	}
}

class calload extends cal2{
	
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	
	public int sum(int v1, int v2, int v3) {
		System.out.println("I'm Sun!");
		return v1+v2+v3;
	}
	
}

public class OverLoadingApp {
	public static void main(String[] args) {
		
		cal2 c1 = new cal2();
		calload c2 = new calload();
		
		System.out.println(c2.minus(3, 1));
		
		System.out.println(c1.sum(1,3));
		System.out.println(c2.sum(1,3,4));
		

	}

}
