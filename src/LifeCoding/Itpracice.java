package LifeCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itpracice {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("객체지향 프로그래밍");
		rList.add("하둡");
		rList.add("MongoDB");
		
		Iterator<String> it = rList.iterator();
		
		int a =1;
		while(it.hasNext()) {
			if(a==1) {
				System.out.println("<"+it.next()+">");
			}
			else {
				System.out.println(it.next());
			}
			a++;
		}

	}

}
