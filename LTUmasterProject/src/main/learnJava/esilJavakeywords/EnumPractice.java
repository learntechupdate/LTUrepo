package esilJavakeywords;

public class EnumPractice {
	
	

	private MonthEnumDemo month;

	EnumPractice(MonthEnumDemo month){
		this.month = month;
	}
	
	
	
	//unable to compare class name ref varible with enum 
	    public  void monthtype(){
		
		 switch (month) {
	     case January:
	         System.out.println("Start of new year, make new year resloution");
	         break;
		default: System.out.println("New year resloution gone ");
			break;
		 }
	    	 
//		if(month.) {
//			
//			System.out.println("check");
//		}
//		
//		else {
//			System.out.println("hey");
//		}
		
		
	 }

	public static void main(String[] args) {
		
		EnumPractice firstmonth = new EnumPractice(MonthEnumDemo.January);
		firstmonth.monthtype();
		EnumPractice othermonth = new EnumPractice(MonthEnumDemo.March);
		othermonth.monthtype();
		

	}

}
