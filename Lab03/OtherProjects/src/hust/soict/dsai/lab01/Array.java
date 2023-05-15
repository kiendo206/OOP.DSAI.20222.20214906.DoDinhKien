package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// input the array 
		double s=0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");   
		int n=sc.nextInt();    
		double[] arr = new double[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)
		{    
		arr[i]=sc.nextDouble();
		s+=arr[i];
		}
		Arrays.sort(arr);
		System.out.printf("The sorted array is: %s%n", Arrays.toString(arr));
		System.out.printf("The sum of the array is: %f%n", s);
		System.out.printf("The average of the array is: %f%n", s/n);
	}

}
