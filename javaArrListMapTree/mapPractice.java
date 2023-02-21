package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class mapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		String str = "Hello my name is Sanjana";
		
		for (char c : str.toCharArray()) {
			if (m.containsKey(c)) {
				int old = (int) m.get(c);
				m.put(c, old+1);
				
			}
			
			else 
			{
				m.put(c, 1);
			}
		}
		
		m.remove(' ');
		
		System.out.println(m);
		
	}

}
