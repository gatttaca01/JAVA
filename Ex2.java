import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the upper limit : ");
		int number = sc.nextInt();
		for (int  i =1; i<=50; i++) {
			System.out.println(number + "*" +i +"=  " +number*i);
		}
	}

}
