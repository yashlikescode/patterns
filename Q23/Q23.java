import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Patterns {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n;
        int z;
        int counter;
        

        // the loop is used to check if the number given can make a pattern (must be an odd number greater than 1)
        while (true) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            if ((n % 2 != 0) && (n > 1))
                break;
            System.out.println("Invalid number. Please try again.");
        }

        int array[] = new int[n];
        int arraycopy[] = new int[n];
        
        double m = n;
        
     
        // this code will store the bottom row of the pattern in an array, then calculate the remaining rows of the pattern from the bottom row
        
        
        
        // fill the first half of array before the midpoint
        for (int i = 0; i < (int) Math.floor(m/2); i++)
        {  	
        	array[i] = n - (int) Math.floor(m/2) + i;     	
        }
        
        
        
        // fill the middle index of the array
        
        array[(int) Math.floor(m/2)] = n;
        
        counter = n;
             
        
        
        // fill the second half of the array, after the midpoint
        
        for (int i = (int) Math.ceil(m/2); i < n; i++)
        {
        	array[i] = counter - 1;
        	
        	counter--;
        }
       
                
        
        // print the pattern to the screen by using the bottom row of the pattern to calculate the previous rows of the pattern
        for (int i = 0; i<n; i++)
        {
        	
        	for (int j = 0; j<n; j++)
        	{
        		z = array[j] - n + i + 1; // calculates an individual number anywhere in the pattern using the bottom row of the pattern
        		
        		if (z<1) // ensures that the smallest number printed in the pattern is 1
        		{
        			z = 1;
        		}
        		
        		System.out.print(z); // print the number in the pattern
        		System.out.print(" ");  // add the spaces between the numbers		
        	}
        	System.out.println();
        }
                       
        scanner.close();       
    }
}
