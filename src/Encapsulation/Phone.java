package Encapsulation;

public class Phone {
	
	public static final String Model = "Aes12341234"; // �ڵ��� �𵨸�
	
	private long number = 01012341234L; // ��ȭ��ȣ (�����)

	public long getNumber() { //��ȭ��ȣ �ҷ����� 
		return number;
	}

	public void setNumber(long number) { // ��ȭ��ȣ ����
		this.number = number;
	}
	

}
