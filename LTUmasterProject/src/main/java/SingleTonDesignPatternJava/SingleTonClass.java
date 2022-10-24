package SingleTonDesignPatternJava;

public  class SingleTonClass 

{
  private static SingleTonClass objRef;
  private SingleTonClass(){
	  
  }
   
	public static SingleTonClass getObject() 
	{
	 if(objRef==null)
		{
			 objRef=new SingleTonClass();
			return objRef;
			
		}
		else
		{
			return objRef;	
		}
	}
}
