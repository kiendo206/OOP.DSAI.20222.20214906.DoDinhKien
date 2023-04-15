import java.util.Scanner;
import java.lang.Math;
public class SecondOrderEquation {

	public static void main(String[] args) {
		// input the coefficients
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		// solve the equation
		double D = b*b-4*a*c;
		if (a==0) {
			if (b==0) {
				if (c==0) {
					System.out.print("Infinitely many solution");
				}
				else {
					System.out.print("No solution");
				}
			}
			else {
				System.out.printf("The equation has a root x = %f", -c/b);
			}
		}
		else {
			if (D<0) {
				System.out.print("No solution");
			}
			else if (D==0) {
				System.out.printf("The equation has a double root x1 = x2 = %f", -b/(a*2));
			}
			else {
				System.out.printf("The equation has two roots%nx1 = %f%nx2= %f%n", (-b+Math.sqrt(D))/(a*2), (-b-Math.sqrt(D))/(a*2));
			}		
		}
	}

}
