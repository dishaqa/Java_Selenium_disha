package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapinterface4 {

	public static void main(String[] args)
	
	{
		Map<Integer,Double> m1 = new HashMap<Integer,Double>() ;
		m1.put(12,10100.2);
		m1.put(54,10505.6);
		m1.put(542,10500.6);
		m1.put(12,10100.2); // not accepting duplicate  keys
		m1.put(13,10100.2); // accepting dulplicate values
		
		m1.put(null,null); // it's accepting null
		
		System.out.println(m1);
		
		for (Integer i1 : m1.keySet())
		{
			System.out.println(i1);
		}
		
		for(Double d1 : m1.values())
		{
			System.out.println(d1);
		}
		
		Set<Entry<Integer,Double>> e1= m1.entrySet();
		
		for (Entry<Integer,Double> e2 :m1.entrySet())
		{
			System.out.println("Employee ID and Salary: "+e2);
		}
		
		m1.putIfAbsent(13, 165000.9);
		System.out.println(m1);
		

	}

}
