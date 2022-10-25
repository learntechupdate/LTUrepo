package esilpractivejavaThoid;

public class MethodExample {

	
	//default constructor
	public MethodExample() {
		
	}
	
	
	//access Modifiers ,Nonstatic, return type, method name , input parameter in brackets/parentheses() , body {}  
	   public  int simpleAddNum(int firstNo , int SecondNo) {
		
		return firstNo+SecondNo;
	}
	   
	 
	   //static method - load only once irrespective of number of creation of classes
	 public static void companyLogo() {
		 
		 System.out.println("Welcome to esil");
		 
	 }
	
	
	 public static void main(String[] args) {
		
		 
		 MethodExample obj=new MethodExample();
		int sum= obj.simpleAddNum(10, 20);
		 System.out.println(sum);
		 
		 MethodExample.companyLogo();
		 
		 int sum2= obj.simpleAddNum(30, 20);
		 System.out.println(sum2);
		 
		 
		 
		 
	}

}
