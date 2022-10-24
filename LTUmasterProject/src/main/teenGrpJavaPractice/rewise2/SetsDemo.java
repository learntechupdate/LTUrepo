import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import jdk.nashorn.internal.ir.WhileNode;

class SetsDemo
{
public static void main(String[] args) {
	Account a1=new Account("aaaaa",101);
	Account a2=new Account("bbbbb",503);
	Account a3=new Account("cccccc",508);
	Account a4=new Account("ddddd",150);
	Account a5=new Account("aaaaa",101);
	Account a6=new Account("gggggg",560);
	
	//Set s=new HashSet();
	//Set s= new LinkedHashSet();
	Set s= new TreeSet();
	s.add(a1);
	s.add(a2);
	s.add(a3);
	s.add(a4);
	s.add(a5);
	s.add(a6);
	Iterator itr=s.iterator();
	{
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	};
	
}	

}


