package hust.soict.dsai.lab01;
import java.util.Scanner;
public class LinearSystem {

	public static void main(String[] args) {
		// input the coefficients
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a11: ");
		double a11 = sc.nextDouble();
		System.out.print("Enter a12: ");
		double a12 = sc.nextDouble();
		System.out.print("Enter b1: ");
		double b1 = sc.nextDouble();
		System.out.print("Enter a21: ");
		double a21 = sc.nextDouble();
		System.out.print("Enter a22: ");
		double a22 = sc.nextDouble();
		System.out.print("Enter b2: ");
		double b2 = sc.nextDouble();
		// solve the system
		double D = a11*a22-a21*a12;
		if (D==0) {
			if (b1*a21==b2*a11) {
				System.out.print("Infinitely many solutions");
			}
			else {
				System.out.print("No solution");
			}
		}
		else {
			double x1=(b1*a22-b2*a12)/D;
			double x2=(b1-(a11*x1))/a12;
			System.out.printf("x1 = %f%n", x1);
			System.out.printf("x2 = %f%n", x2);
		}
				
	}

}
