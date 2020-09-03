package LifeCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ex05 {

	public static void main(String[] args) {
		
		List<Map<String,String>> rList = new ArrayList<>();
		Map<String,String> rmap = new HashMap<String,String>();
		
		rmap.put("name", "이협건");
		rmap.put("email", "h.lee@");
		rmap.put("addr","서울");
		
		rList.add(rmap);
		
		rmap = null;
		
		rmap = new HashMap<String,String>();
		
		rmap.put("name", "홍길동");
		rmap.put("email", "g.hong@");
		rmap.put("addr", "경기");
		
		rList.add(rmap);
		rmap = null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String,String> pmap = it.next();
			System.out.println("-----------반복시작---------");
			System.out.println("name : " + pmap.get("name"));
			System.out.println("dept : " + pmap.get("email"));
			System.out.println("addr : " + pmap.get("addr"));
			System.out.println("-----------반복 끝----------");
			pmap = null;
			
		}
		
	}

}
