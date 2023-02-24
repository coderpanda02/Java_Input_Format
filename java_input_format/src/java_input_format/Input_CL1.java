package java_input_format;

public class Input_CL1 {

	public static void main(String[] args) {
		
		if(args.length == 0) { //handling ArrayIndexOutOfBound Exception
			System.out.println("Please enter characters through "
								+ "command line argument!");
		}
		else {
			System.out.println("Welcome "+args[0]+"!");
		}
	}

}
