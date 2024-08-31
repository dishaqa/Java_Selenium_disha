package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class MapInterface3 {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		
		m1.put("MOHAN",93);
		m1.put("ROHAN",90);
		m1.put("SITA",43);
		m1.put("GITA",33);
		System.out.println(m1);
		
		/*m1.remove("SITA");
		System.out.println(m1);
		
		m1.remove("GITA",33);
		System.out.println(m1); */
		
		m1.replace("SITA", 43, 53);
		System.out.println(m1);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		
		m2.put("Swati", 95);
		m2.put("Priya", 93);
		m2.put("Priya2", 90);
		m2.put("Priya3", 91);
		
		for (String s2 : m2.keySet())
		{
			System.out.println(s2);
		}
		
		for (Integer i1 : m2.values())
		{
			System.out.println(i1);
		}
		System.out.println("---------------------------");
		for (Entry<String,Integer> e1 : m2.entrySet())
			
		
		{
			System.out.println(e1);
		}
		System.out.println("---------------------------");
		
		Iterator<Entry<String,Integer>> i2=  m2.entrySet().iterator();
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
	} 

} 
