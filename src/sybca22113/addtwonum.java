package sybca22113;

import java.util.Scanner;

public class addtwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	      
	        double result=num1+num2;
	        System.out.println("Sum is " + result);

	}

}
