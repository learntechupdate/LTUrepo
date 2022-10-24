package learningGD;

public class Super1
{
int i = 10;
String s= "SUPER CLASS";
public void display()
{
System.out.println(i+" "+s);
}
}


class Sub extends Super1
{
	int i = 20,j;
	public void display()
	{
		System.out.println(i);
		System.out.println(super.i+i);
		j = super.i+i;
		super.display();
	}
}