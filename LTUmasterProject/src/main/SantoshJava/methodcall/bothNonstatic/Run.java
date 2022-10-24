package methodcall.bothNonstatic;

public class Run {
	
	public  void method1() {
		
		System.out.println("Static M1 method");
		
//		Run r=new Run();
//		r.disp();
		this.disp();
	}

	public  void disp() {

		System.out.println("Non static Method disp");
	}

}
