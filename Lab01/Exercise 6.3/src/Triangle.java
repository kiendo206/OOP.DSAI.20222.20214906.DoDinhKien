import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int i,j;
		//input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		// make the triangle
		for (i=1;i<=n;i++) {
			for (j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for (j=1;j<2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
