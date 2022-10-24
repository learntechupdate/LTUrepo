package methodcallboth;

public class Run {
	
	public static void method1() {
		
		System.out.println("Static M1 method");
		
		Run r=new Run();
		r.disp();
	}

	public  void disp() {

		System.out.println("Non static Method disp");
	}

}
