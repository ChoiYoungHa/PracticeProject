package LifeCoding.Inheritance;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("통장 잔액을 입력해주세요 : ");
		int account = 0;
		account = sc.nextInt();
		
		while(true) {
		System.out.println("1.출금 2.입금 3.잔액확인 4.종료");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("출금하실 금액을 입력하세요 : ");
			int output = sc.nextInt();
			account -= output;
		}
		else if(num == 2) {
			System.out.println("입금하실 금액을 입력하세요 : ");
			int init = sc.nextInt();
			account += init;
		}
		else if(num == 3) {
			System.out.println("현재 잔액은 : "+account +"원 입니다.");
		}
		else if(num == 4){
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}

	}

}
