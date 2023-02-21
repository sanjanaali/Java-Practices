package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class mapHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map m = new HashMap();
		m.put("tim",5);
		m.put("joe","x");
		m.put("a","b");
		
		boolean x = m.containsValue("b");
		boolean y = m.containsKey(5);
		
		
		System.out.println(m);
		System.out.println(m.get(5));
		System.out.println(x);
		System.out.println(y);
		System.out.println(m.values());
		
	}

}
