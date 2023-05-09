package oops;

import java.text.DecimalFormat;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(7.5);
//1		System.out.println("Area : " + c1.getArea());
//		System.out.println("Circumference : " + c1.getCircumference());

//		System.out.printf("Area : %.2f\n", c1.getArea());
//		System.out.printf("Circumference : %.2f", c1.getCircumference());
		DecimalFormat df = new DecimalFormat("#####.##");
//		DecimalFormat df = new DecimalFormat("00000.00");
		System.out.println("Area : " + df.format(c1.getArea()));
		System.out.println("Circumference : " + df.format(c1.getCircumference()));
		
	}

}