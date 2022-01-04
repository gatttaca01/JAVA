import java.util.Scanner;

public class GettingInputs {

	public static void main(String[] args) {
		// classes have different properties

		Scanner input = new Scanner(System.in);
		// prompt
		System.out.println("give me a number");
		int value = input.nextInt();
		System.out.println("you entered " + value);

	}
}
