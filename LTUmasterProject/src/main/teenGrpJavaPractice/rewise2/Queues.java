import java.util.*;


public class Queues {
			
	public static void main(String[] args) {
		Queue l= new PriorityQueue();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		for(Object obj : l)
		{
			System.out.println(obj);
			//System.out.println(l);
		}System.out.println(l.size());
		System.out.println(">>>>>>>>>>>After removing a new Value>>>>>>>>>>>>>>>>>>>>");

		l.remove(1);
		for(Object obj : l)
		{
			System.out.println(obj);
			//System.out.println(l);
		}System.out.println(l.size());
	}
	

}
