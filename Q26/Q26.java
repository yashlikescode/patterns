import java.util.Scanner;

public class Q26 {

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
		
		
		for (int i=0; i<n; i++) // iterate over every row of the pattern
		{
			
			for (int j=0; j<i+1; j++) // iterate equal to the number of elements that should be in a given row of the pattern, printing every element
			{
				System.out.print(j+1);
			}			
			System.out.println();
			
		}
	}
}
