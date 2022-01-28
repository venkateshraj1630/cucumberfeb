package org.locators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Client {
	
	
	


	public static void main(String[] args) {
		
	
		
		
		
		
		
		Map <Integer,Encapsulation> m = new HashMap<Integer,Encapsulation>();
		
		
		List<Encapsulation> l = new ArrayList();
		
		Encapsulation  s = new Encapsulation();
		s.setId(88965);
		s.setName("venkateshraj");
		s.setPhno(7904143545l);		
		Encapsulation  s1 = new Encapsulation();
		s1.setId(123456);
		s1.setName("Himalaya");
		s1.setPhno(8939727932l);
		
		Encapsulation  s2 = new Encapsulation();
		s2.setId(98765);
		s2.setName("Mala");
		s2.setPhno(9487816530l);
		
		Encapsulation  s3 = new Encapsulation();
		s3.setId(56789);
		s3.setName("Balasundaram");
		s3.setPhno(9751696133l);
		
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhno());
			
		}
		
//		for (Encapsulation encap : l) {
//			
//			System.out.println(encap.getId());
//			System.out.println(encap.getName());
//			System.out.println(encap.getPhno());
//			
//		}
		}
	}


