package javaconcepts;

/*
 * 1h:56m:44
 * If we don't want variable to object specific we make it static -it goes into class loader memory
 * object created will go into Heap
 * static variable is accessible using class name and object name
 * The constructor will be executed every time the object is created
 * static block will be executed only once as the class loading happens once
 * static block will executed 1st as the class loading happens 1st then the object creation  happens
 * we cannot ref a non static variable in static class
 */

class Emp{
	
	int empid;
	int salary;
//	String ceo;
	static String ceo;
	
	static // when u load a class
	{
		ceo="Ariel";
		System.out.println("static block");
	}
	Emp() // when u create a object
	{
		
		empid=0;
		salary=3000;
       System.out.println("constructor block ");
	}
	
	public void show(){
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(ceo);
	}
}
public class J11StaticKeyword {

	int nonstaticvar=0;
	static int staticvar=0;
	public static void main(String[] args) {
		
//		nonstaticvar=5; //Cannot make a static reference to the non-static field nonstaticvar
		staticvar=5;
		
		Emp navin=new Emp();
		navin.empid=1;
		navin.salary=100;
//		navin.ceo="Ana";
		navin.show();
		
		Emp sujith=new Emp();
		sujith.empid=2;
		sujith.salary=500;
//		sujith.ceo="Addan"; 
		sujith.show();
		
//		Emp.ceo="Class CEO"; //class.static_variable_name
				
		
		
		Emp con=new Emp();
		con.show();
		
		
		
	}
}









