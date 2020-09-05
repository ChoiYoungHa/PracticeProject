package LifeCoding;

import java.util.Scanner;

public class Nalde {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int buger = 2001;
		int drink = 2001;
		
		for(int i = 0; i<=2 ; i++) {
			int values = sc.nextInt();
			if(values < buger) {
				buger = values;
			}
		}
		
		for(int i = 0; i<=1 ; i++) {
			int values = sc.nextInt();
			if(values < drink) {
				drink = values;
			}
		}
		
		int hap = (buger + drink) - 50;
		System.out.println(hap);

	}

}
