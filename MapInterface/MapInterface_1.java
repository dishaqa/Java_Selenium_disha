package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_1 {

	public static void main(String[] args)
	{
		
		
		Map<String,Integer> m1 = new HashMap<String,Integer>(); //upcasting
		
		m1.put("Salt", 1);
		m1.put("Sugar", 10);
		m1.put("rice", 50);
		
		System.out.println(m1);
	}

}
