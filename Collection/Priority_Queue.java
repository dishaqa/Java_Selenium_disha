package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) 
	{
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add(10);
		p1.add(20);
		p1.add(30);
		//p1.add(null); // not accepting null
		//p1.add("test"); // not accepting hetrogenius value
		System.out.println(p1);
		Iterator i1 = p1.iterator();
		
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
		}
		
		System.out.println(p1.size());
		boolean b1 = p1.contains(30);
		System.out.println(b1);
		
	}

}
