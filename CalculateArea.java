package WEEK5;

public class CalculateArea {
	public static void main(String[] args) {
		//To do Auto-generated method stub
		 // Get the radius8double) from the user 
		 // Calculate the area of circle - pi*r*r
	
		 int number;
        Scanner ali = new Scanner (System.in);
		System.out.println("what is the radius ?");
		double radius = ali.nextDouble();
		if (radius<0);
		System.out.println("not possible");
		double area= 3.14*radius*radius;
		System.out.println("The area is "+ area);
	
		
	}

}
