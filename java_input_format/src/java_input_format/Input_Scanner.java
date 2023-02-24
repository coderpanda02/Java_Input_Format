package java_input_format;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of integers to perform addition : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" numbers to perform addition : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("The result of the addition : "+sum);
		
		sc.close();
	}

}
