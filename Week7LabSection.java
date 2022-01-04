import java.util.Scanner;

public class Week7LabSection {
	public static void main(String[] args) {
		/*for int i=0 i>=n , i++ ;
		if (i %2 ==1 )
		syso (i);
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the upper limit : ");
		int number = sc.nextInt();
		
	for (int i =0; i <= number; i++) {
			if (i %2 == 1)
				System.out.println(i);
			
		}// end of for
	
	
	
	}// end of main


}// end of class
