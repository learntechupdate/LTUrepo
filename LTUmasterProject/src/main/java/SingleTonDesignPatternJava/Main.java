package SingleTonDesignPatternJava;

public class Main

{
	public static void main(String[] args) 
	{
		SingleTonClass a1=SingleTonClass.getObject();
		System.out.println(a1);
		SingleTonClass a2=SingleTonClass.getObject();
		System.out.println(a2);
		
		SingleTonClass a3=SingleTonClass.getObject();
		System.out.println(a3);
		
		SingleTonClass a4=SingleTonClass.getObject();
		System.out.println(a4);
	
		
		
		
	}	
	
}	 
	

	

