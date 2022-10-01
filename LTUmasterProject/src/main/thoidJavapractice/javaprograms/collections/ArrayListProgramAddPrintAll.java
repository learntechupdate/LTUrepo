package javaprograms.collections;

import java.util.ArrayList;

public class ArrayListProgramAddPrintAll {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(0, 11); 
		
		for (Integer i : al) {
			
			System.out.println(i);
		}
	}

}

/*
 output ?  al.add(0, 11) will add and push other 
11
1
2
*/
