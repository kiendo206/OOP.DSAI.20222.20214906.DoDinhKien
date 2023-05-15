package hust.soict.dsai.lab01;
import java.util.Scanner;
public class LinearEquation {

	public static void main(String[] args) {
		// input the coefficients
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		// solve the equation
		if (a==0) {
			if (b==0) {
				System.out.print("Infinitely many solution");
			}
			else {
				System.out.print("No solution");
			}
		}
		else {
			System.out.printf("x = %f%n", -b/a);
		}
	}

}
