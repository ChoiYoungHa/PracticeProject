package LifeCoding.Inheritance;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
