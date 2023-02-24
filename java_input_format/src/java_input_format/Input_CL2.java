package java_input_format;

public class Input_CL2 {

	public static void main(String[] args) {

		if(args.length == 0) {
			System.out.println("Please enter two integers through "
								+ "command line arguments!");
		}
		else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
				      
			int sum = a + b;
			System.out.println("Sum of "+a+" and "+b+" is : "+sum);
		}
	}
}
