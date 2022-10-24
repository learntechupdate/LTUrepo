package learningGD;

public class Super3rdUse//Basic A4
{
int cc;
String colour;
public Super3rdUse(int c,String col){
	cc=c;
	colour=col;
}
}
class Adv4 extends Super3rdUse
{
boolean ab;
boolean airbag;
public Adv4(boolean a,boolean b,int x,String y)
{
	super(x,y);
	ab=a;
	airbag=b;
	
}

}
