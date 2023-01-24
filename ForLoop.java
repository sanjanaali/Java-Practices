//This program is for hailstone sequence

import java.util.Scanner;

public class ForLoop{

public static void main (String[] args){
	
	System.out.print("Please enter a number within 10: ");
	Scanner h = new Scanner(System.in);
	int num = h.nextInt();
	
	for(int i = num; i < 50; i++){
		
		System.out.print(num);
		
		if(num==1){
			break;
		}
		if(num%2==0){
			num = num/2;
		}
		else{
			num = 3*num + 1;
		}
		System.out.print(",");
		
	}
	}
	
}