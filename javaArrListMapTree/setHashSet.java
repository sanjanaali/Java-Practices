package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class setHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(9);
//		t.clear();
//		t.isEmpty();
//		t.size();
		
		int x = t.size();
		System.out.println(x);
		
	}

}
