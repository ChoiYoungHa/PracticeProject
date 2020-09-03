package LifeCoding;

interface Calcu{
	double PI = 3.14234;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}

class go implements Calcu, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	
	public void print() {
		System.out.println("I'm Calcu");
	}
}
class Printerable implements Printable{
	public void print() {
		System.out.println("I'm Calcu");
	}
}

public class Do {

	public static void main(String[] args) {
		Calcu g1 = new go();
		
		System.out.println(g1.sum(2, 3));
		//g1.print();
		System.out.println(g1.PI);
		

	}

}
