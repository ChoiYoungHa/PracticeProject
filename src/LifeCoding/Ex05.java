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
		
		rmap.put("name", "������");
		rmap.put("email", "h.lee@");
		rmap.put("addr","����");
		
		rList.add(rmap);
		
		rmap = null;
		
		rmap = new HashMap<String,String>();
		
		rmap.put("name", "ȫ�浿");
		rmap.put("email", "g.hong@");
		rmap.put("addr", "���");
		
		rList.add(rmap);
		rmap = null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String,String> pmap = it.next();
			System.out.println("-----------�ݺ�����---------");
			System.out.println("name : " + pmap.get("name"));
			System.out.println("dept : " + pmap.get("email"));
			System.out.println("addr : " + pmap.get("addr"));
			System.out.println("-----------�ݺ� ��----------");
			pmap = null;
			
		}
		
	}

}
