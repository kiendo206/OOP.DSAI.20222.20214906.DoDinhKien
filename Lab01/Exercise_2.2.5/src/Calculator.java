
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// Input the numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		// Calculate sum, difference, produce and quotient
		System.out.printf("Sum of two numbers: %f%n", num1 + num2);
		System.out.printf("Difference of two numbers: %f%n", num1 - num2);
		System.out.printf("Product of two numbers: %f%n", num1*num2);
		if (num2==0) {
			System.out.print("Quotient does not exist");
		}
		else
		{
			System.out.printf("Quotient of two numbers: %f%n", num1/num2);
		}
	}

}
