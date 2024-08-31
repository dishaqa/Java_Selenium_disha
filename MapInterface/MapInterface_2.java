package MapInterface;
import java.util.HashMap;
import java.util.Map;
public class MapInterface_2 {

	public static void main(String[] args) {
		
		
		Map<String,Integer> m1 = new HashMap<String,Integer>(); //upcasting
		
		m1.put("Salt", 1);
		m1.put("Sugar", 10);
		m1.put("rice", 50);
		
		System.out.println(m1);
		
		//m1.clear();
		//System.out.println(m1);
		
		boolean b1 = m1.isEmpty();
		System.out.println(b1);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.put("Tothpaste", 11);
		m2.putAll(m1);
		System.out.println(m2);
		}

}
