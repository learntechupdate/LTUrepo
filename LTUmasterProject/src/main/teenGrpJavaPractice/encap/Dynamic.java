package selenium;



public class Dynamic 
{
	public static void main(String[] args)
	{
		Basics b =Helper.cO("basics");
		b.move();
		b.stop();
	}
}

class Basics
{
	void move()
	{
		System.out.println("car is moving..");
		
	}
	
	void stop()
	{
		System.out.println("car stop using disk breaks");
	}
	
}

class Advance extends Basics
{
	void move()
	{
		System.out.println("car is moving..");
		
	}
	
	void stop()
	{
		System.out.println("car stop using abs breaks");
	}
	
}


class Helper
{
	static Basics cO(String s)
	{
		if(s.equals("basics"))
		{
			return new Basics();
			
		}
		
		else if(s.equals("advance"))
		{
			return new Advance();
			
		}
		return null;
	}
}





