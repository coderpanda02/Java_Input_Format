package java_input_format;

import java.util.Scanner;

public class Input_Scanner2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name (First Name followed by space and Last name) : ");
		String name = sc.next();
//		name = name + sc.next(); //next() will give o/p like -> FnameLname
		name = name + sc.nextLine(); //nextLine() reads the gap between name, -> Fname Lname
		
		System.out.println("Enter the Gender ('M'/'F') : ");
		char gender = sc.next().charAt(0);	
		
		System.out.println("Enter the age in numbers : ");
		int age = sc.nextInt();
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age+" Years");
		
		sc.close();
		
	}

}
