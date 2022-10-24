package javaprograms.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorProgram {
	
	public static void main(String[] args) {
		
		//M1 Using iterator
		System.out.println("//M1 Using iterator");
		
		HashSet<String> m1=new HashSet<String>();
		m1.add("Anita");
		m1.add("Sourab");
		m1.add("Srini");
		m1.add("Javeed");
		m1.add("Touheed");
		
		Iterator< String> Im1=m1.iterator(); 
		while (Im1.hasNext()) {
			
			System.out.println(Im1.next());
					
				}
		
	
		//M2 Using foreach    
	   System.out.println("//M2 Using foreach");
	   
	   HashSet<String> m2=new HashSet<String>();
	    m2.add("Apple");
		m2.add("Mango");
		m2.add("Grapes");
		m2.add("Orange");
		m2.add("Watermelon");
		
		for (String fruit : m2) {
			
			System.out.println(fruit);
		}
	
	}
			
}
		

