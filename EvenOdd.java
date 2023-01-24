import java.util.Scanner;

public class EvenOdd{
	
	public static void main(String args[]){
	 
	 System.out.print("Enter a Value: ");
	 Scanner scan = new Scanner(System.in);
	 int num = scan.nextInt();
	 
	 if(num%2==0){
		
		System.out.println("The given Number is Even!!");
	}
	
	else {
		System.out.println("The given Number is Odd!!");
	}
	 
	
	}
}