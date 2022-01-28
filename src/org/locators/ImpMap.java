package org.locators;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImpMap {

	public static void main(String[] args) {
		
		
		Map <Integer,Encapsulation> m = new HashMap<Integer,Encapsulation>();
		
		Encapsulation  s = new Encapsulation();
		s.setName("Bala");
		s.setEmail("bala@gmail.com");
		s.setPhno(987456125l);
		
		Encapsulation  s1 = new Encapsulation();
		s1.setName("Mala");
		s1.setEmail("mala@gmail.com");
		s1.setPhno(89456214l);
		
		Encapsulation  s2 = new Encapsulation();
		s2.setName("Himalaya");
		s2.setEmail("Himalaya@gmail.com");
		s2.setPhno(7854691528l);
		
		
		m.put(100,s);
		m.put(200, s1);
		m.put(300,s2);
		
		Set<Integer> keySet = m.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}

		Encapsulation encapsulation = m.get(100);
		System.out.println(encapsulation);
		
		Set<Entry<Integer, Encapsulation>> entrySet = m.entrySet();
		
		
		for (Entry<Integer, Encapsulation> entry : entrySet) {
			
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getEmail());
			System.out.println(entry.getValue().getPhno());
		}
		

	}

}



