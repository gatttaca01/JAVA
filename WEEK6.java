package WEEK6;

public class MultipleConditions {
	public static void main(String[] args) {
	
		// <,> >=,<=,=
		int age =18;
		if (age == 20) {
			System.out.println("you can go yo a bar" );
		}
		else 
			System.out.println(" sorry , you cannot");
	int number =234;
	// % mod remainder 
	// number % 2
	// 4%2 =0
	// 5%2 = 1
	System.out.println("odd number");
	int a =8;
	/*a%2 ==0
	 * && logical condition and operator
	 */
	if (a%2 ==0 && a%3 ==0)
		System.out.println("It is divisible by 3 and 2 ");
	else 
		System.out.println("not divisible");
	//  || --> OR
	
	
			
		
		
	}

}
