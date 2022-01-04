package WEEK6;

import java.util.Scanner;

public class CalculatorSystem {
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = s.next.line( );
		String username = "Musaa@bau.edu.tr";
		System.out.println("Enter your password");
		int password =s.nextInt();
		 char gender= 'M';
		  
		if (username =="Musaa@bau.edu.tr" && password == 1234 || gender == 'F') {
			
		
	    System.out.println("login was succeeded");
		System.out.println("welcome "+ name);
		System.out.println("Enter a number ");
		int number1 =s.nextInt();
		System.out.println("Enter another number ");
		int number2 = s.nextInt();
		System.out.println("press 1 for +");
		System.out.println("press 2 for -");
		System.out.println("press 3 for *");
		System.out.println("press 4 for /");
		int operator = s.nextInt()
;
	if (operator == 1) // +
		System.out.println(number1+number2);
	else if(operator == 2)// -
		System.out.println(number1 - number2);
	else if (operator == 3) // *
		System.out.println(number1 * number2);
	else if (operator == 4) // / {
		if (number2 ! == 0 )
			System.out.println("Invalid diviser");
		else 
		System.out.println( number1 / number2);
	// == checks if two things are equal .
	// != = ! + =  if two things are not equal .
	
	else 
		System.out.println("Invalid input");
	
		}
	
	 else 
	 {
		 
		 
	
		System.out.println("invalid info");
		}
		 System.out.println(5 == 5);
		 
	}

}
