package javaprograms.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListAndHashsetContains {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anita");
		al.add("Sourab");
		al.add("Srini");
		al.add("Javeed");
		al.add("Touheed");
		
		System.out.println(al.contains("Touheed"));//used instead of if else
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Grapes");
		hs.add("Orange");
		hs.add("Watermelon");
		System.out.println(hs.contains("orange"));//Equal ignore case?
		
		
		
	}

}
