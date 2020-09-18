package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		
		System.out.println(ph.getNumber()); // 캡슐화의 감춰저있는부분을 불러오려면 get
		
		ph.setNumber(111111111);
		System.out.println(ph.getNumber()); // 감춰저있는 부분을 바꿀려면 set
		
		System.out.println(Phone.Model); // 공개되는 모델명 불러오기 final로 선언해서 바꿀수없는 유일한 모델명
		

	}

}
