package javaPractice;
import java.util.Scanner;

public class arrLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArr = {1,5,7,5,8,4};
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		for (int element:newArr) {
			
			System.out.println(element + " " + count);
			count++;	
		}
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println("Input: ");
			String input = sc.nextLine();
			names[i] = input;
			
		}
		
		for (String n : names) {
			System.out.println(n);
			if(n.equals("tim")){
				break;
			}
		}
		
	}

}
