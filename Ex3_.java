import java.util.Scanner;

public class Ex3_ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int  countComputer =0 , countPrinter= 0, countPhone =0;
		 double priceComputer = 1999.99, pricePrinteer = 55.5, pricePhone= 459.99;
		 
		 while(true) {
	     System.out.println("Press 1 to add a computer");
		 System.out.println("Press 2 to add a printer ");
		 System.out.println("Press 3 to add a phone ");
		 System.out.println("Press 0 to exist");
		 
		 int choice= sc.nextInt();
		 
		 if (choice == 0)
			 break;
		 
		 switch (choice) {
		case 1 ://computer 
			System.out.println(++countComputer+"computer(s) added to cart. ");
		break ;	
		case 2 ://printer
			System.out.println(++countPrinter + "printer(s) added to cart.");
		break ;
		case 3 ://phone 
			System.out.println(++countPhone+" phone(s) added to cart ");
		break ;
			
		}
		default:
			System.out.println("Invalid input");
			break; // we use that because end of the switch
	
		} // end of switch
		 }// end of while loop

	System.out.println("Your cart has" +countcomputer+ "computer(s)," + countPrinter +" printer(s)," + countPhone + "phone(s).");
	 double totalCost = (countComputer * priceComputer) +
			 (countPrinter * pricePrinter)+ (countPhone * pricePhone);
   System.out.println ("Total price= " + totalCost);
	}// end of main

// System.out.printf search this 
//end of class

}
