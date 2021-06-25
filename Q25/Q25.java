import java.util.Arrays;
import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int n;
			
		
		// the loop is used to check if the number given can make a pattern (must be a number greater than 1)
        while (true) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();	// enter a number
            if (n > 1)
            {
                break;
            }
            System.out.println("Invalid number. Please try again.");
        }
		
		scanner.close();
		int array[] = new int[n];
		Arrays.fill(array, n);	// store the top row of the pattern in an array
		
		printarray(array,n);	// print the top row of the pattern
		System.out.println();
		
		
		
		for (int i=0; i<n-1; i++) 	// loop to calculate the remaining rows of the pattern
		
		{
			for (int j=n-1; j>i; j--) // subtract numbers from the previous row to generate a new row of the pattern
			{
				array[j] = array[j] - 1;
			}
			
			printarray(array,n); // print the contents of the array, which represents one row of the pattern
			System.out.println();
		}
				
		
	}
	
	public static void printarray(int arr[], int n)	// a method to print the contents of an integer array
	{		
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}		
	}
	
}
