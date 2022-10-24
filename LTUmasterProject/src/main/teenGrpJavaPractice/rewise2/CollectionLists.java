import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.List;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class CollectionLists {
	
public static void main(String[] args) {
	List l= new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	
	for(Object obj : l)
	{
		System.out.println(obj);
		//System.out.println(l);
	}System.out.println(l.size());
	System.out.println(">>>>>>>>>>>After adding a new Value>>>>>>>>>>>>>>>>>>>>");
	l.add(1,15);
	for(Object obj : l)
	{
		System.out.println(obj);
		//System.out.println(l);
	}
	System.out.println(l.size());
	l.set(2, 25);
	System.out.println(">>>>>>>>>>>After setting a Value 20 in place of 25>>>>>>>>>>>>>>>>>>>>");

	for(Object obj : l)
	{
		System.out.println(obj);
		//System.out.println(l);
	}System.out.println(l.size());
	
	System.out.println(l.get(4));
	l.remove(3);
	for(Object obj : l)
	{
		System.out.println(obj);
		//System.out.println(l);
	}System.out.println(l.size());
}
}
