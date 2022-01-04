package WEEK6;

public class Loops {
	public static void main(String[] args) {
		 System.out.println(1);
		 System.out.println(2);
		 System.out.println(3);
		 System.out.println(4);
		 System.out.println(5);
		 System.out.println(6);
		 System.out.println(7);
		 System.out.println(8);
		 System.out.println(9);
		 System.out.println(10);
		 // while - - looping if 
		 System.out.println( "                    ");
		 int count =1;
		 while  (count<=10 ) { // or if 
			 // iteration
		 System.out.println(count);
		 count = count+2 ;
	 }
		 // check - execute - go back to the condition - check - execute -- go back ... 
		 // even numbers between 1-20 
		
		 System.out.println("                          ");
		 
		 int number = 2 ;
		 number *=2;
		 
		 while (number<=20 ) {
			 System.out.println(number);
			 number =number +2;
			 // number-=6;
		 //number = number - 6;
			 
		 }
		  // display numbers from 10-15
		 count =10 ; 
		 while( count <= 15) {
			 count++; //- -	
			 System.out.println(count);
		// count = count +1;
			// count+=1;
			// count++;
			 //++count;
		
			 // find numbers between 20-100 that aree divisible by  5
			 int a =20; 
			 while (a<=100) {
				 if ( a%5 == 0)
	         System.out.println(a);
				  a++;
		 
				 
			 }
			 
		 }
		 }

}
