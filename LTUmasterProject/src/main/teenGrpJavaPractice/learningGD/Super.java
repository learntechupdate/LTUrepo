package learningGD;

public class Super 
{
int i = 10;
String s= "SUPER CLASS";
public void display()
{
System.out.println(i+" "+s);
}
}


class Subclass extends Super
{
	int i = 20;
	public void display()
	{
		System.out.println(i);
		System.out.println(super.i+" "+super.s);
		super.display();
	}
}
