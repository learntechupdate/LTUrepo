package javainterview;

public class NoSpace
{
public static void main(String[] args) 
{
	String s1="My name is Karthik";
	String s2="";
	int l=s1.length()-1;
	for(int i=0;i<=l;i++)
	{
		if(s1.charAt(i)!=' ')
		{
			s2=s2+s1.charAt(i);
		}
	}
	System.out.println(s2);
}
	
}
