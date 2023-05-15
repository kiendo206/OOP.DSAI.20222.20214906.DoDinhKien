package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;
public class AddMatrix {

	public static void main(String[] args) {
		// input the array 
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of rows: ");   
		m=sc.nextInt();    
		 
		System.out.print("Enter the number of columns: ");  
		n=sc.nextInt(); 
		
		double[][] arr1 = new double[m][n];
		double[][] arr2 = new double[m][n];
		double[][] arr = new double[m][n];
		
		System.out.println("Enter the value of the first matrix: ");
		for (i = 0; i < m; i++)
		{
			//inner for loop for column  
			for (j = 0; j < n; j++)   
			{
			arr1[i][j] = sc.nextDouble();   
			}
		}
		System.out.println("Enter the value of the second matrix: ");
		for (i = 0; i < m; i++)
		{
			//inner for loop for column  
			for (j = 0; j < n; j++)   
			{
			arr2[i][j] = sc.nextDouble();   
			}
		}
			  
		for (i = 0; i < m; i++)   
		{   
			for (j = 0; j < n; j++) 
			{
			arr[i][j]=arr1[i][j]+arr2[i][j];   
			}   
		}
		System.out.println("The sum of the two matrix is: "); 
		for (i=0;i<m;i++)
		{
		System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}