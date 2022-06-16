import java.util.Scanner;

public class Q37 {public static void main(String[] args) {
	    var scanner = new Scanner(System.in);
	    int numberOfRows;
	
	    // the loop is used to check if the given number can make a pattern
	    while (true) {
	        System.out.print("Enter a number: ");
	        numberOfRows = scanner.nextInt();
	        if (numberOfRows > 0)
	            break;
	        else
	            System.out.println("Invalid number. Please try again.");
	    }
	
	    /*space represent the space required to fill the pyramid
	     * left represent left half of the inverted pyramid
	     * right represent right half of the inverted pyramid
	     * */
	    
	    for (int i = numberOfRows,space=0; i > 0; i--,space++) {
	    	for(int l=0;l<space;l++)
	    		System.out.print("  ");
	        for(int left=1;left<i;left++)
	        	System.out.print(left+" ");
	    	for (int right = i; right> 0; right--)
	            System.out.print(right+" ");
	        System.out.println();
	    }
	    scanner.close();
	}
}