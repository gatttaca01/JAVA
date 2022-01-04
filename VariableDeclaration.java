
public class VariableDeclaration {

	public static void main(String[] args) {
		int age; // create
		int birthYear = 1994; // create and assign
		int currentYear = 2021;
		// call currentYear , call birthYear
		age = currentYear - birthYear;
		System.out.println("age"); // this is text
		System.out.println(age);
		// way1
		System.out.println("you are " + age + " years old"); // we use double +
		System.out.println("you are going to be " + (age + 1) + " next year");
		System.out.println(age);
		// way2
		age = age + 1;
		System.out.println(age);
		System.out.println("you are going to be " + age + " next year");

		int n1, n2, n3;
		n1 = 15;
		n2 = 34;
		n3 = 78;
		System.out.println("1th variable " + n1);
		System.out.println("2nd variable " + n2);
		System.out.println("3rd variable " + n3);
		int sum = n1 + n2 + n3;
		System.out.println("the result is " + sum);

	}

}
