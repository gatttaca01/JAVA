package WEEK6;

import WEEK5.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
	//	System.out.println( 5 == 5);
		//System.out.println( 5==6);
		 //System.out.println(5!  = 0);
		//System.out.println(5! ==6);
		
		//SWITCH CASE
		 java.util.Scanner note = new Scanner (System.in);
			System.out.println("what is the note?");
		int grade= note.nextInt();
		switch (grade) {
		case 90: // if (grade==90)
			System.out.println("A");
			 break;
		case 80 :
			System.out.println("B");
			break; 
		case 70 :
			System.out.println("C");
			break;
		case 60 :
			System.out.println("D");
			break;
			default :
				System.out.println("F");
				
		}
		 char  letter = 'A'
		switch (letter) {

		case 'A'
			System.out.println("well done");
			 break;
		case 'B':
			System.out.println("Not nad ");
			 break;
		case 'C':
			System.out.println("could have been better");
			 break;
		case 'D':
			System.out.println("try harder");
			 break;
		case 'F':
			System.out.println(" try again ");
			 break;
			default:
				System.out.println("Invalid letter");
				
		}
		
		
	}

}








