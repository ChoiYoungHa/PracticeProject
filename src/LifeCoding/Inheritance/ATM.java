package LifeCoding.Inheritance;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ܾ��� �Է����ּ��� : ");
		int account = 0;
		account = sc.nextInt();
		
		while(true) {
		System.out.println("1.��� 2.�Ա� 3.�ܾ�Ȯ�� 4.����");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("����Ͻ� �ݾ��� �Է��ϼ��� : ");
			int output = sc.nextInt();
			account -= output;
		}
		else if(num == 2) {
			System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
			int init = sc.nextInt();
			account += init;
		}
		else if(num == 3) {
			System.out.println("���� �ܾ��� : "+account +"�� �Դϴ�.");
		}
		else if(num == 4){
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}

	}

}
