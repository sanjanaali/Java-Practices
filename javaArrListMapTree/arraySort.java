package javaPractice;

import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-22, 5,2,78,3,8,3,1,7,9};
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			
			System.out.print(i + ",");
		}
		
	}

}
