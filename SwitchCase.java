//This program is for adding the given value with 100

import java.util.Scanner;

public class SwitchCase{
	
	public static void main(String[] args){
	
	System.out.print("Enter a number from 1 to 10: ");
	
	Scanner x = new Scanner(System.in);
	
	int y = x.nextInt();
	
	switch(y){
		case 1: 
		System.out.println(100+y);
		break;
		case 2: 
		System.out.println(100+y);
		break;
		case 3: 
		System.out.println(100+y);
		break;
		case 4: 
		System.out.println(100+y);
		break;
		case 5: 
		System.out.println(100+y);
		break;
		case 6: 
		System.out.println(100+y);
		break;
		case 7: 
		System.out.println(100+y);
		break;
		case 8: 
		System.out.println(100+y);
		break;
		case 9: 
		System.out.println(100+y);
		break;
		case 10: 
		System.out.println(100+y);
		break;
		default:
		System.out.println(100);
		break;
	}
	
	}
}