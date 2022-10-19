package practicejava.naseema;



//static class
class AddClass{
	
	//controuctors
	AddClass(){
		System.out.println("Doing noting");
	}
	
	//parmater constoruc
      AddClass(int a , int b){
		System.out.println(a+b);
	}
      
      
      public static void addDecimal(double d,double e){
    	  
    	  System.out.println(d+e);
      }
      
      public int add3Number(int n1,int n2, int n3){
		int result;
		return result=n1+n2+n3;
    	  
      }
      
}

//Nonstatic class
	

public class StaticNNonstaticDemo {

	public static void main(String[] args) {
	
		
		AddClass ref2=new AddClass(8,9);//adding using constrouser
		
		//classname.methodname
		AddClass.addDecimal(1.1, 2.3);
		
		//3add with Nonstatic method 
		//Create object -> ClassName ref=new ClassConstorust
	
		AddClass ref=new AddClass();
		int resutl=ref.add3Number(2, 3, 1);
		
		System.out.println(resutl);
		
	}
	
	
	}


