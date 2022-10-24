package enhance.programs;


import java.util.Comparator;

//for RennixIQTestAssignment compare price
class ValueCompare implements Comparator<ValueCompare>, Comparable<ValueCompare>{
		private String EcomName;
		private int Price;
		ValueCompare(){
		}

		ValueCompare(String name, int price){
		  EcomName = name;
		  Price = price;
}

		public String getValueCompareEcomName(){
		  return EcomName;
		}

		public int getValueComparePrice(){
		  return Price;
		}

		// Overriding the compareTo method
		public int compareTo(ValueCompare price){
		  return (this.EcomName).compareTo(price.EcomName);
		}

		// Overriding the compare method to sort the Price 
		public int compare(ValueCompare price, ValueCompare price2){
		  return price.Price - price2.Price;
		}
		}


