import java.util.Scanner;

public class DoWhileLoop{

public static void main (String[] args){
		
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		int i = 1;
		do{	
				sum = sum + i;
				i++;
		}while(i <= num);
		
		System.out.println("The sum from 1 to "+num+" is: " +sum);
		
		
}
}