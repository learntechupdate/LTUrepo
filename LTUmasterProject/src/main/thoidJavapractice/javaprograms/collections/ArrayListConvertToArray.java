package javaprograms.collections;

import java.util.ArrayList;

public class ArrayListConvertToArray {
	
	public static void main(String[] args) {
		
		
		//method1 Using ArrayList get() 
		System.out.println("//method1 Using ArrayList get()");
		
		ArrayList<String> alm1=new ArrayList<String>();
		alm1.add("Anita");
		alm1.add("Sourab");
		alm1.add("Srini");
		alm1.add("Javeed");
		alm1.add("Touheed");
		
		
		String conArr[] =new String[alm1.size()];
		for (int i = 0; i < alm1.size(); i++) {
						
			conArr[i]= alm1.get(i);//ArrayList get() method
			
		}
		
		for (String string : conArr) {
			
			System.out.println(string);
		}
		
		
		
		//method 2 Using toArray() 
		System.out.println("//method 2 Using toArray() ");
				
		ArrayList<String> alm2=new ArrayList<String>();
		alm2.add("Apple");
		alm2.add("Mango");
		alm2.add("Grapes");
		alm2.add("Orange");
		alm2.add("Watermelon");
		
		
		String fruits[]=alm2.toArray(new String[alm2.size()]) ;
		
		for (String fruit : fruits) {
			
			System.out.println(fruit);
		}
		
		
		
	}

}
