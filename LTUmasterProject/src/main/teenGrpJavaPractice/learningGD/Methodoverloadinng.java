package learningGD;

public class Methodoverloadinng {
static void add(int x,int y)
{
	int sum = x+y;
	System.out.println(sum);
	
}
static void add (int x,int y,int z)
{
	int sum = x+y+z;
	System.out.println(sum);
}
static void add (int x,int y,int z,int a)
{
	int sum = x+y+z+a;
	System.out.println(sum);
	
}
public static void main(String[] args)
{
add(10,20,30);
add(10,20);
add(10,20,30,40);
}
}
