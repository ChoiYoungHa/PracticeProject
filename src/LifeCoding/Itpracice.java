package LifeCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itpracice {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("��ü���� ���α׷���");
		rList.add("�ϵ�");
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
