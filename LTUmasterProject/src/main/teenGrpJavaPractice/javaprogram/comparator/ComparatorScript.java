package javaprogram.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//for RennixIQTestAssignment compare price

		public class ComparatorScript{
		public static void main(String args[]){
		  // Takes a list o ValueCompare objects
		  List<ValueCompare> list = new ArrayList<ValueCompare>();

		  list.add(new ValueCompare("Amazon",322));
		  list.add(new ValueCompare("Filpkart",2322));
		  list.add(new ValueCompare("Reliance",142));
		  list.add(new ValueCompare("Snapdeal",421));
		  list.add(new ValueCompare("Lowes",143));
		  Collections.sort(list);// Sorts the array list

//		  for(ValueCompare a: list) {//printing the sorted list of names
//		     System.out.print(a.getValueCompareEcomName() + ", ");
//		  }
		  // Sorts the array list using comparator
		  Collections.sort(list, new ValueCompare());
		  
//		  System.out.println(" ");
		  
		  for(ValueCompare Ecom: list)//printing the sorted list of Prices
		     {System.out.print(Ecom.getValueCompareEcomName() +" : "+
		    		 Ecom.getValueComparePrice() + ", ");
		     }
		//print the least price Ecom(s)
		// check list is empty or not 
		
		
}
		
}
