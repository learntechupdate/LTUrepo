package javaprograms.collections;

import java.util.HashMap;

public class HashMapProgram {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		
		hm.put(1,"Anita");
		hm.put(1,"Sourab");
		hm.put(1,"Srini");
		hm.put(1,"Javeed");
		hm.put(2,"Touheed");
		
		System.out.println(hm);
		
	}

}
