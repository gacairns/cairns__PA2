package cairns__PA2;

import java.util.*;
public class cairns_02 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int choice;
		double result, height, weight;
		
		System.out.print("Please select one or two by typing the number:\n"
				+ "1: BMI in inches and pounds\n" + "2: BMI in kilograms and meters\n");
		choice = scnr.nextInt();
		
		if (choice==1) {
			System.out.print("Please enter your height (in inches) followed by weight (in lbs):\n ");
			height = scnr.nextDouble();
			weight = scnr.nextDouble();
			result = (double)(703*weight)/(height*height);
			System.out.printf("Your BMI is %.2f.",result);
		}
		if (choice==2) {
			System.out.print("Please enter your height (in meters) followed by weight (in kilograms):\n ");
			height = scnr.nextDouble();
			weight = scnr.nextDouble();
			result = (double)(weight)/((height)*(height));
			System.out.printf("Your BMI is %.2f.\n", result);
		}
		
		System.out.print("Underweight = <18.5\n"+"Normal weight = 18.5–24.9\n"+"Overweight = 25–29.9\n"+"Obesity = BMI of 30 or greater\n");
	}

}
