package LifeCoding;

public class Ex02 {

	public static void main(String[] args) {
		
		int i = 3;
		while(i<=8) {
			if(i==3 || i==5) {
				System.out.println("["+i+"]´Ü");
			}
			int k = 1;
			while(k<=9) {
				System.out.println(i+"*"+k + "=" +i*k);
				k++;
			}
			i++;
		}

	}

}
