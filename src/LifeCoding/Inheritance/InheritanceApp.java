package LifeCoding.Inheritance;

class cal {
	public int sum(int v1, int v2) {
	return v1+v2;
}
}
class cal2 extends cal{
	
}
public class InheritanceApp {
	public static void main(String[] args) {
		
		cal c1 = new cal();
		System.out.println(c1.sum(1, 2));
		
		cal2 c2 = new cal2();
		System.out.println(c2.sum(1, 2));
		
		

	}
		

	}



