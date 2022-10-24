package learningGD;

public class Demo {
	static int x = 10;
	int y = 20;
	
	static void display()
	{
		System.out.println("HAPPY REPUBLIC DAY");
		
	}
     void display2()
     {
    	 System.out.println("TOMMOROW NO CLASS");
    	 
     }

public static void main(String[] args)
{
	Demo d1 = new Demo();
	System.out.println(d1.y);
	System.out.println(x);
	d1.display2();
		display();
}
}

