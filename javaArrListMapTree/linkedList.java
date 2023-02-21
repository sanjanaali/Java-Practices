package javaPractice;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(8);
		t.add(4);
		t.add(1);
		t.add(2);
		t.get(0);
		t.set(2, 5);
//		t.subList(1,3);
		
		System.out.println(t.subList(1,5));
		
		
	}

}
