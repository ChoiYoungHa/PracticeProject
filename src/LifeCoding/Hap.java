package LifeCoding;

import java.util.Scanner;
public class Hap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int hap = 0;
		
		while(s.hasNext()) {
			a = s.nextInt();
			b = s.nextInt();
			
			if(a ==0 && b ==0) {
				break;
			}
			hap = a+b;
			System.out.println(hap);
        }	
	}
}