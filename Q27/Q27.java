import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		int n = 0;
					
		
		// the loop is used to check if the number given can make a pattern (must be a number greater than 1)
        while (true) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();	// scan a number
            if (n > 1)
            {
                break;
            }
            System.out.println("Invalid number. Please try again.");
        }	
		scanner.close(); 
		
		for (int x=0; x<n+1; x++) // iterate over every row of the pattern
		{ 
						
			for (int y=1; y<=x; y++) 
			{
				if(x==y) {
				System.out.print("1"); // The diagonal is always 1
								
			}else {
				System.out.print(y+" ");
				}}
			if(x!=0) System.out.println("");  // ignore empty first line
			
		}
	}
}
