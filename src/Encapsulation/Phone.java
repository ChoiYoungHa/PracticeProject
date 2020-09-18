package Encapsulation;

public class Phone {
	
	public static final String Model = "Aes12341234"; // 핸드폰 모델명
	
	private long number = 01012341234L; // 전화번호 (비공개)

	public long getNumber() { //전화번호 불러오기 
		return number;
	}

	public void setNumber(long number) { // 전화번호 세팅
		this.number = number;
	}
	

}
