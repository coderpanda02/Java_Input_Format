package java_input_format;

import java.util.Scanner;

//	Math.round(input*scale)/scale -> for 3 decimal -> (input*1000)/1000
//	scale = Math.pow(10, places) -> for 2 decimal, places = 2,
//									for 3 decimal, places = 3
// Ex : double scale1 = Math.pow(base, 2); //for 2 decimal places

public class Input_Format2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number you want to round off : ");
		double input = sc.nextDouble();
		
		
		System.out.println("How many decimal places do you want the "
							+ "number to be rounded off?");
		System.out.println("Enter the number of decimal places ( eg: "
							+ "Enter '2' for 2 decimal places) : ");
		int scale_in = sc.nextInt();
		
		
		int base = 10; //as decimal numbers, base is 10

		//double scale = Math.pow(double base, double exponent) ->
		double scale = Math.pow(base, scale_in);
		
		//Formatting with Math.round() -->		
		System.out.println(Math.round(input*scale)/scale); 
		
		sc.close();
 
	}

}
