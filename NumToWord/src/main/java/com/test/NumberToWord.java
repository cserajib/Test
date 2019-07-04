package com.test;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToWord {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		
			"",		
			"Twenty", 	
			"Thirty", 	
			"Forty", 	
			"Fifty", 	
			"Sixty", 	
			"Seventy",	
			"Eighty", 	
			"Ninety" 	
	};

	public static String convert(final int n) {
		if(n==0)
			return "Zero";
		else if (n < 0) {
			return "Minus " + convert(-n);
		}

		else if (n < 20) {
			return units[n];
		}

		else if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		else if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		else if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		else if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

	public static void main(final String[] args) {
	
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter number between -999,999,999 to 999,999,999");
try {
	

	    int entNum = myObj.nextInt();  
	    System.out.println("Entered No is: " + entNum);	
	    System.out.println(NumberFormat.getInstance().format(entNum) + "='" + convert(entNum) + "'");
	}
    catch(InputMismatchException e) {
	    System.err.println("Please enter number between -999,999,999 to 999,999,999");
    }
	}
}
