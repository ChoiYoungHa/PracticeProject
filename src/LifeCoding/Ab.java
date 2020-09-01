package LifeCoding;

import java.util.Scanner;

public class Ab {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double result = a/b;
		
		System.out.println(result);

	}

}
