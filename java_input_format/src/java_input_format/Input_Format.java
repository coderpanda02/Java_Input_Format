package java_input_format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//	System.out.format(format, args) -> ("%.2f",input)

//	String.format(format, args) - String.format("%.2f",input) , String.format("%,.3f")

//	DecimalFormat("0.00")
//	DecimalFormat("#.##")


//For both String.format or DecimalFormat, "," is a grouping separator,
//however, the result will vary on Locale (object represents a specific geographical,
//political,or cultural region). In most "English" locales, the grouping separator
//is also a comma "," For non-English locale like "German", the grouping separator
//is a period "."



public class Input_Format {

	public static void main(String[] args) {
		
		Double a = 12343.656132;
		Double b = 1223413.450;
//		Double c = 34.452531;

		System.out.println("The values of 'a' and 'b' are: "+a+"   "+b);	
		
		
		//Formatting using System.out.format("%.2f",input)
		System.out.println("\nString formatted using 'System.out.format()' : ");
		
		System.out.format("%.2f", a);
		System.out.println();
		
		System.out.format("%,.4f", b); //',' is the grouping separator
		System.out.println();

		
		//Formatting using String.format()
		System.out.println("\nString formatted using 'String.format()' : ");
		
		System.out.println(String.format("%.2f", a));
		System.out.println(String.format("%,.4f", b)); //',' is the grouping separator
		
		
		//Formatting using DecimalFormat("0.000")
		System.out.println("\nString formatted using 'DecimalFormat(\"0.000\")' : ");
		
		DecimalFormat df1 = new DecimalFormat("0.000");
		System.out.println(df1.format(a));
		System.out.println(df1.format(b));
		
		
		//Formatting using DecimalFormat("#,###.###") //',' is the grouping separator
		
//		DecimalFormat("#.##") displays blank if the second decimal place is 
//		empty or zero. The DecimalFormat("0.00") is a better solution for
//		2 decimal places.
		
		System.out.println("\nString formatted using "
							+ "'DecimalFormat(\"#,###.###\")' : ");
		DecimalFormat df2 = new DecimalFormat("#,###.###");
		System.out.println(df2.format(a));
		System.out.println(df2.format(b));
		
		
		//Formatting using ' new DecimalFormat(String pattern,
		//						DecimalFormatSymbols symbols) '
		
		
//		DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.GERMAN);
//		DecimalFormat df3 = new DecimalFormat("#,###.##", dfs);
		
		System.out.println("\nString formatted using 'DecimalFormatSymbols()' : ");
		DecimalFormat df3 = new DecimalFormat("#,###.###", 
							new DecimalFormatSymbols(Locale.GERMAN));
		System.out.println(df3.format(a));
		System.out.println(df3.format(b));
		

	}
	

}
