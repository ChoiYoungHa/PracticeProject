package LifeCoding;

public class Ex03 {

	public static void main(String[] args) {
		
		int [] num = new int[90];
		int hap = 0;
		
		for(int i =0 ; i<90 ; i++ ) {
			num[i] += i+11;
			hap += num[i];
		}
		int k = 0 ;
		while(k<90) {
			System.out.println("num"+"["+k+"] : " + num[k]);
			k++;
		}
		System.out.println("гу╟Х : "+hap);

	}

}
