package methodcallbothstatic;

public class Run {
	
	public static void method1() {
		
		System.out.println("M1 method");
		
		Run.disp();
		disp();
		
	}

	public static void disp() {

		System.out.println("Static  display method");
	}

}
